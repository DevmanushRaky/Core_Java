public class DemoMethods2 {

    int add ( int x, int y){        //return type instance method with parameter
        int z = x+y;
        return z;
    }
    float avg ( int x, int y){      //return type instance method with parameter
        float z = (float)(x=y)/2;
        return z;
    }
    public static void main(String[] args) {
        int v1=7;     // primitive datatype local variable
        int v2=5;     // primitive datatype local variable 

        DemoMethods2 ob = new DemoMethods2();   // ob is Non-Primitive DataType Local variable

        int r1= ob.add(v1, v2);    //method call with parameter
        float r2= ob.avg(v1, v2);  //method call with parameter
        System.out.println("Sum =" + r1);
        System.out.println("Avg =" + r2);

    }
    
}
