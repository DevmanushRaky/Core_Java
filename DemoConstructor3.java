class CTest3{
    // this is constructor declared with return type so
    //  this will be considerd as normal method and must be called as object name

    void CTest3(){         
        System.out.println("This is Constructor");
    }
    // static CTest3(){       there is no concept of static constructor     
    //     System.out.println("This is Constructor");
    // }
}
public class DemoConstructor3 {
    public static void main(String[] args) {
        
        CTest3 ob = new CTest3();
        ob.CTest3();
    }
}
