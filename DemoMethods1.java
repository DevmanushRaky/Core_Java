public class DemoMethods1 {
     int x=10;          //instance variable memory in object
     static int y=20;   // static variable memory in object

     void m1(){   //instance method or non-static memory in object
        System.out.println("Instance method access static and instance variable directly");
        System.out.println("The Instance variable x="+x);
        System.out.println("The static variable y="+y);
     }
    static void m2(){     //static method memory in class
        System.out.println("Static method access static variable directly");
        // System.out.println("The Instance variable x="+x);     static method cann't access instance variable directly
        System.out.println("The static variable y="+y);
     }

    public static void main(String[] args) {   //static method memory in class

        DemoMethods1 ob = new DemoMethods1();
        ob.m1();   //instance method call
        DemoMethods1.m2();  //static methos call
        
    }
}
