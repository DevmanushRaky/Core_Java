 class CTest1{  //SubClass
    int x= 20;
    CTest1 () {   //Constructors
        System.out.println("----This is constractors in SubClass---");
        System.out.println("The value of x : "+x);
    }
    void dis(){  //instance method
        System.out.println("---instance method in subclass---");
        System.out.println("The value of x : "+x);
    }
 }
 class DemoConstructor1{
    public static void main(String[] args) {
        CTest1 ob = new CTest1();  //Constructor call
        ob.dis(); //method call
    }
 }