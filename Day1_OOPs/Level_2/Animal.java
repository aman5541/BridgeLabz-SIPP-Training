
    

   public class Animal { 
      
      int age = 19;
      static int age1 =20;
           static void display(){
            System.out.println("static ");

           
           }
            void display1(){
               System.out.println(" Non static method");
            }
           
            public static void main(String[]args){
               Animal animal=new Animal();
               animal.display1();
               display();
               System.out.println(animal.age);
                System.out.println(age1);
            }

   }