import java.util.Scanner;

class DemoMethods3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the UserName:");
        String name = s.nextLine();// method_call

        System.out.println("Enter the MailId:");
        String mailId = s.nextLine();// method_call

        System.out.println("Enter the PhoneNo:");
        long phNo = s.nextLong();// method_call

        System.out.println("Enter the percentage:");
        float per = s.nextFloat();
        
        System.out.println("====Details====");
        System.out.println("UserName:" + name);
        System.out.println("MailId:" + mailId);
        System.out.println("PhoneNo:" + phNo);
        System.out.println("Percentage:" + per);
    }
}
