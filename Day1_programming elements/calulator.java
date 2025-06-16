import java.util.Scanner;
public class calulator {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
         System.out.println("first number");
         double input1 = input.nextDouble();

          System.out.println("Operator");
          char operator = input.next().charAt(0);
        
         System.out.println("Second number");
          double input2 = input.nextDouble();

          ;
          double result;
          switch (operator){ 

            case '+':
            result = input1 + input2;
            System.out.println(result);
            break;
             
            case '-':
            result = input1 - input2;
            System.out.println(result);
            break;

             case '*':
            result = input1 * input2;
            System.out.println(result);
            break;

          case '/' :
            result = input1 / input2;
            System.out.println(result);
            break; 

          default:
              System.out.println("invalid operator");

          



         
    }

}

