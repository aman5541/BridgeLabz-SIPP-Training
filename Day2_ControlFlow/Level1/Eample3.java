package Day2_ControlFlow.Level1;

class Example3 {
   int x = 10;

    static void m1( Example3 obj) {
         
        System.out.println("Before: " +obj. x); 
    }

    void m2() {
        System.out.println("Before: " + x);     
    }

    public static void main(String[] args) {
        Example3 obj = new Example3();   
        m1(obj);                        
        obj.x = 50;
        obj.m2();
        System.out.println("After: " + obj.x);
    }
}
