
import java.util.Scanner;
public class DemoMethods4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter User Name: ");
        String userName = s.nextLine();
        System.out.println("Enter Password: ");
        String passWord = s.nextLine();
        System.out.println("Enter First Name: ");
        String firstName = s.nextLine();
        System.out.println("Enter Phone Number: ");
        long phNo = Long.parseLong(s.nextLine());
        System.out.println("Enter Email ID: ");
        String emailId = s.nextLine();

        System.out.println("-----Details------");
        System.out.println(" User Name : "+ userName);
        System.out.println(" Password : "+ passWord);
        System.out.println(" First Name : "+ firstName);
        System.out.println(" Phone number : "+ phNo);
        System.out.println(" Email Id : "+ emailId);
    }
}
