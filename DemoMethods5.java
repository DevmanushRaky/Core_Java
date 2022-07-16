
import java.util.Scanner;

//subclass
class EmpTotSalary{  //return type Instance method with para memory in object
    float calculate(int bSal){
        float totSal = bSal+(0.93f*bSal)+(0.61f*bSal);
        return totSal;
    }
}
//main class
public class DemoMethods5 {
    public static void main(String[] args) {
      Scanner s= new Scanner (System.in);
      System.out.print("Enter your Basic Salary :" );   
      int bS=s.nextInt();
      if(bS>=12000){
        EmpTotSalary ob = new EmpTotSalary();
        float tSal=ob.calculate(bS);
        System.out.println("Your Basic Salary : "+bS);
        System.out.println("Your Total Salary : "+tSal);
      }
      else{
        System.out.println("Please enter salary above 12000 your input invalid");
      }

    }
}
