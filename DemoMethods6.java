import java.util.Scanner;

public class DemoMethods6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the subject1 marks : ");
        int s1 = sc.nextInt();
        System.out.print("Enter the subject2 marks : ");
        int s2 = sc.nextInt();
        System.out.print("Enter the subject3 marks : ");
        int s3 = sc.nextInt();
        System.out.print("Enter the subject4 marks : ");
        int s4 = sc.nextInt();
        System.out.print("Enter the subject5 marks : ");
        int s5 = sc.nextInt();
        System.out.print("Enter the subject6 marks : ");
        int s6 = sc.nextInt();
        sc.close();
        System.out.println("-----Your Marks in six subject following -----");
        System.out.println("Subject 1 marks "+ s1);
        System.out.println("Subject 2 marks "+ s2);
        System.out.println("Subject 3 marks "+ s3);
        System.out.println("Subject 4 marks "+ s4);
        System.out.println("Subject 5 marks "+ s5);
        System.out.println("Subject 6 marks "+ s6);

        int totMarks;
        totMarks= s1+s2+s3+s4+s5+s6;
        float per = (float) totMarks/6;
        System.out.println("Total marks of the six subject is = "+ totMarks);
        System.out.println("Percentage of the six subject is = "+ per);
        StudentResult grade = new StudentResult();
        String var =grade.calculate(per);
        System.out.println(var);
        
    }
}

class StudentResult{
    String calculate(float per){
        if(per>=70 && per<=100) {
            return "Distriction";
        }
        else if (per>=60 && per<70) {
            return "First";
        }
        else if (per>=50 && per<60){
            return "Second";
        } 
        else if (per>=35 && per<50){
            return "Third";
        } 
        else {
            return "Fail";
        }
    }

}
