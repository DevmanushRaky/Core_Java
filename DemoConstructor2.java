import java.util.Scanner;
class CTest2{
    int x= 10;
    static int y= 20;    
    static{
        System.out.println("---This is Static block in SUbclass---");
        System.out.println("The value of : "+y);
    }
    {
        System.out.println("---This is instance Block---");
        System.out.println("The value of x: "+x);
    }
    CTest2(int x){
        System.out.println("--This is Constructor---");
        System.out.println("The value of x:"+ x);
    }
    void dis(int x){
        System.out.println("----This is non-static method (Instance method) ---- ");
        System.out.println("The value of x: "+x);
    }
}

public class DemoConstructor2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value for constructer : ");
        int v1 = s.nextInt();
        System.out.print("Enter value for method : ");
        int v2 = s.nextInt();
        CTest2 ob = new CTest2(v1); //constructor call with parameter
        ob.dis(v2);
    }
}
