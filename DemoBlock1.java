
class BTest1{  //SubClass
    static int x = 20;
    static{
        System.out.println("----SubClass----");
        System.out.println("The value of x :"+x);
    }
}

public class DemoBlock1 {  //Main Class
   static int z=10;
    public static void main(String[] args) {
       int x= 500;
        System.out.println("------This is main ------");
        System.out.println("The value of x:"+BTest1.x );
    }
    static{
        System.out.println("------MainClass Static block-----");
        System.out.println("The value of z :"+ z);
    }
    
}
