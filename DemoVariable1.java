public class DemoVariable1 {

    static int a=10; // memory in class static variable
    int b=20; // memory in object instance variable
    public static void main(String[] args) {

        DemoVariable1 ob = new DemoVariable1(); //creating object
    
        int c=30;
        System.out.println("The value of a ="+a);
        System.out.println("The value of a ="+ob.b);
        System.out.println("The value of a ="+c);
    }
}
