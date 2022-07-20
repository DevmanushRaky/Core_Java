class CTest2{
    int x= 10;
    static int y= 20;    
    static{
        System.out.println("---This is Static block in SUbclass---");
        System.out.println("The value of y: "+y);
    }
    {
        System.out.println("---This is instance Block---");
        System.out.println("The value of x: "+x);
    }
    CTest2(){
        System.out.println("--This is Constructor---");
        System.out.println("The value of x:"+ x);
    }
}

public class DemoConstructor2 {
    public static void main(String[] args) {
        CTest2 ob = new CTest2();
    }
}
