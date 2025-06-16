package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in) ;
      System.out.println("Enter the number");
      int natural = sc.nextInt();
      int sum=0;
      System.out.println("sum using formula");
      int fsum =  natural*(natural+1)/2;
      System.out.println(fsum);
      System.out.println("sum using for loop");
      for( int i=1 ; i
      <=natural;i++){
          sum= sum+i;
          
      }
       System.out.println(sum);
          
          if (fsum == sum){
            System.out.println("Finall Ouput:"+sum);
          } 
          else{
            System.out.println("not matched Output");
          }
          
    }
    
}
