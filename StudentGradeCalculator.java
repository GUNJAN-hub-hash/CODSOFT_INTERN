import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args) {
       Scanner S = new Scanner(System.in);
       System.out.println("Student Grade Caculator: ");
       System.out.println("Enter No of Subjects: ");
       int a = S.nextInt();
       int Total = 0;
       for(int i=0;i<a;i++){
        System.out.println("Enter Marks Obtained in "+(i+1)+": ");
        int Marks = S.nextInt();
        Total+=Marks;
           } 
           double avgp = (double)Total/a;
           char Grade;
           if(avgp>=90){
                Grade = 'O';
           }
           else if(avgp>=80){
            Grade = 'A';
           }
           else if(avgp>=70){
            Grade = 'B';
           }
           else if(avgp>=60){
            Grade = 'C';
           }
           else if(avgp>=50){
            Grade = 'D';
           }
           else if(avgp>=40){
            Grade = 'E';
           }
           else{
            Grade = 'F';
           }
           System.out.println("Total Marks Scored: "+Total);
           System.out.println("Avarage Percentage Gained is: "+avgp+"%");
           System.out.println("Grade: "+Grade);
    }
}