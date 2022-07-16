// input student details and display it
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter RollNo of student : ");
        long rollNo = s.nextLong();

        s.nextLine();  //  If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
        System.out.println("Enter Name of student : ");
        String name = s.nextLine();

        System.out.println("Enter Branch of student : ");
        String branch = s.nextLine();

        System.out.println("Enter EmailId of student : ");
        String emailId = s.nextLine();

        System.out.println("Enter  PhoneNO of student : ");
        long phNo = s.nextLong();


        // System.out.println();121231
        System.out.println("---------Details of Students-------  ");
        System.out.println(" Student RollNo :" + rollNo);
        System.out.println(" Student Name :" + name);
        System.out.println(" Student Branch:" + branch);
        System.out.println(" Student EmailId :" + emailId);
        System.out.println(" Student PhoneNo :" + phNo);

    }
}
