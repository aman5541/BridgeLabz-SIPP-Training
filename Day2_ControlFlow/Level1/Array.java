package Day2_ControlFlow.Level1;

public class Array {
    public static void main(String[] args) {
        int[][] matrix = new int [5] [7];
           

        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 0; j < matrix.length; j++) {       
                //System.out.print(matrix[i][j] + " ");
                 System.out.print(i + " " + j);
            }
            System.out.println();  
        }
    }
}

