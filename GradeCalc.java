import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeCalc
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //----Number of Subjects--------
        System.out.print("Enter total number of subjects:");
        int subj = obj.nextInt();
        int avgmarks = 100*subj;

        //--Subjects array---
        double[] marks = new double[subj];

        System.out.println("Now Enter Marks of all the "+subj+" subjects out of 100");

        int i=0;
        while(i<subj){
            System.out.print("Enter marks for Sub-" + (i+1) + ": ");
            marks[i] = obj.nextDouble();
            i++;
        }

        double sum = totalmarks(marks,subj);
        double avg = (sum/(double) avgmarks)*100;
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedAveragePercentage = df.format(avg);

        String grade ="";

        if(avg>=90){
            grade = "A";
        }else if(avg>=80){
            grade = "B";
        }else if(avg>=70){
            grade="C";
        }else if(avg>=60){
            grade="D";
        }else if(avg>=50){
            grade="E";
        }else {
            grade="F";
        }

        System.out.println("Total Marks :"+sum);
        System.out.println("Average Percentage :"+formattedAveragePercentage+"%");
        System.out.println("Your Grade: "+grade);
    }

    public static double totalmarks(double[] marks,int numofsub){
        double sum = 0;
        int i=0;
        while(i<numofsub) {
            sum += marks[i];
            i++;
        }
        return sum;
    }


}
