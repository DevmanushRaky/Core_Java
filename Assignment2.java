import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the subject1 marks : ");
        int s1 = sc.nextInt();
        System.out.println("Enter the subject2 marks : ");
        int s2 = sc.nextInt();
        System.out.println("Enter the subject3 marks : ");
        int s3 = sc.nextInt();
        System.out.println("Enter the subject4 marks : ");
        int s4 = sc.nextInt();
        System.out.println("Enter the subject5 marks : ");
        int s5 = sc.nextInt();
        System.out.println("Enter the subject6 marks : ");
        int s6 = sc.nextInt();

        int totMarks;
        totMarks= s1+s2+s3+s4+s5+s6;
        float per = (float) totMarks/6;
        System.out.println("-----Your Marks in six subject following -----");
        System.out.println("Subject 1 "+ s1);
        System.out.println("Subject 2 "+ s2);
        System.out.println("Subject 3 "+ s3);
        System.out.println("Subject 4 "+ s4);
        System.out.println("Subject 5 "+ s5);
        System.out.println("Subject 6 "+ s6);
        System.out.println("Total marks of the 6 subject is = "+ totMarks);
        System.out.println("Percentage of the 6 subject is = "+ per);
    }
}
