package Day2_ControlFlow.Level1;

class Example {
     
    void display() {
        System.out.println("Non-static Method");
    }

   

    public static void main (String[] args) {
       Example obj = new Example();
       obj.display();  
    }

        
}