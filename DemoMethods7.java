import java.util.Scanner;

class Addition{  //Sub-Class
    int add(int x, int y){ //return type Instance method with parameter memory in object
        return x+y;
    }
}
class Subtraction{  //Sub-Class
    int sub(int x, int y){  //return type Instance method with parameter memory in object
        return x-y;
    }
}
class Multiplication{ //Sub-Class
    int mul(int x, int y){  //return type Instance method with parameter memory in object
        return x*y;
    }
}
class Division{ //Sub-Class
    float div(int x, int y){  //return type Instance method with parameter memory in object
        return x/y;
    }
}
class ModDivision{  //Sub-Class
    int modDiv(int x, int y){  //return type Instance method with parameter memory in object
        return x%y;
    }
}

public class DemoMethods7 {  //Main Class
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your First Number : ");
    int v1= s.nextInt();
    System.out.print("Enter your Second Number : ");
    int v2= s.nextInt();
    System.out.println("-----Your Choice please select one-----");
    System.out.println("1.addition\n2.subtraction\n3.Multiplication\n4.Division\n5.ModDivision");
    System.out.print("Enter your Choice : ");
    int choice = s.nextInt();

    switch(choice){
        case 1:
            Addition ad = new Addition();
            int result = ad.add(v1, v2);
            System.out.println("Sum :" +result);
            break;
        case 2:
            Subtraction su = new Subtraction();
            int sub = su.sub(v1, v2);
            System.out.println("Subtrcation :" +sub);
            break;
        case 3:
            Multiplication mu = new Multiplication();
            int mul = mu.mul(v1, v2);
            System.out.println("Multiplication : "+mul);
            break;
        case 4:
            Division d = new Division();
            float div =d.div(v1, v2);
            System.out.println("Division: "+ div);
            break;
        case 5:
            ModDivision m = new ModDivision();
            int modDiv = m.modDiv(v1, v2);
            System.out.println("ModDivision :"+ modDiv);
            break;
        default:
            System.out.println("Invalid choice");
    }//end of choice

 }   
}
