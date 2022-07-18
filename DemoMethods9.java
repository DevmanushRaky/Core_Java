import java.util.Scanner;

class Greatest{
    int greater(int x , int y , int z){
        if(x>y && x>z){
             return x;
        }
        else if(y>x && y>z){
            return y;
        }
        else{
            return z;
        }
    }
}
class Smallest{
    int smaller(int x , int y , int z){
        if(x<y && x<z){
             return x;
        }
        else if(y<x && y<z){
            return y;
        }
        else{
            return z;
        }
    }
}
public class DemoMethods9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Number :");
        int x = sc.nextInt();
        System.out.print("Enter your Second Number :");
        int y = sc.nextInt();
        System.out.print("Enter your Third Number :");
        int z = sc.nextInt();
        System.out.println("-------Your Choice-------:");
        System.out.println("1.Greatest\n2.Smallest");
        System.out.print("Enter your Choice :");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                    Greatest g = new Greatest();
                    int v1 = g.greater(x, y, z);
                    System.out.println("Greater Value : "+v1);
                    break;
            case 2:
                    Smallest s = new Smallest();
                    int v2 = s.smaller(x,y,z);
                    System.out.println("Smallest Value : "+v2);
                    break;
            default:
                    System.out.println("Invalid Choice...");
        }
         
        //another solution for find maximum number using Math.max method
        
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = Math.max(c,Math.max(a,b));
        System.out.println("The maximum value is :" +max);
        */
        
        
    }

}
