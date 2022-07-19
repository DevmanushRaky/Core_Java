
class BTest2{
    int a=10;
    static int b = 20;
    {   
        a++;
        b++;
        System.out.println("-----SubClass Instance block ------");
        System.out.println("The value of a : "+a);
        System.out.println("The value of b : "+b);
    }
}
public class DemoBlock2 {
    public static void main(String[] args) {
        BTest2 ob1 = new BTest2();
        BTest2 ob2 = new BTest2();
    }
}
