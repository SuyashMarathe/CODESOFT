import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        System.out.println("***STUDENTS GRADE CALCULATOR***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects You Have: ");
        int sub = sc.nextInt();
        int totalmarks=0;
        double percentage;
        char grade;

        System.out.println("Enter the Marks in Each Subject (Outoff 100) ");

        for(int i=1;i<=sub;i++) {
            System.out.println("Enter Marks for subject number "+i);
            int marks=sc.nextInt();
            totalmarks=totalmarks+marks;
        }

        percentage = (double)totalmarks/ sub;
        if(percentage>=90){
            grade='A';
        }
        else if(percentage>=80){
            grade= 'B';
        }
        else if(percentage>=70){
            grade= 'C';
        }
        else if(percentage>=60){
            grade= 'D';
        }
        else if(percentage>=50){
            grade= 'E';
        }
        else if(percentage>=35){
            grade= 'P';
        }
        else
            grade='F';


        System.out.println("****Your Result is as follows****");
        System.out.println("Total Marks Obtained in all subjects: "+totalmarks);
        System.out.println("Percentage Obtained: "+percentage);
        System.out.println("Your Grade is: "+grade);
        System.out.println("Best of Luck For Future :)");

    }
}