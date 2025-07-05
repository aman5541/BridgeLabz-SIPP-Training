public  class ArrayChecker {
	
	int arr[] = {1,2,4,53,9,6,8,2,15,54,67,2,54,5,2,1};
	
	
	
	  public void counter() {
	        int[][] freq = new int[arr.length][2]; 
	        
	        int size = 0;
	        
	        

	        for (int i = 0; i < arr.length; i++) {
	            boolean found = false;

	            for (int j = 0; j < size; j++) {
	                if (freq[j][0] == arr[i]) {
	                    freq[j][1]++;
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                freq[size][0] = arr[i];
	                freq[size][1] = 1;
	                size++;
	            }
	        }
	        System.out.println("Number\tCount");
	        for (int i = 0; i <size; i++) {
	            System.out.println(freq[i][0] + "\t" + freq[i][1]);
	        }
	        System.out.println("Repeating Numbers:");
	        for (int i = 0; i < size; i++) {
	            if (freq[i][1] > 1) {
	                System.out.println(freq[i][0] + " appears " + freq[i][1] + " times");
	            }
	        }
	        };
	        
	        
	 public int repeatingElement(){
		 for(int i=0; i<arr.length;i++) {
			  for (int j = i + 1; j < arr.length; j++) {
	               if (arr[i] == arr[j]) {
	            	   
	            	  return arr[i];
	            	   
	               }
			   }
			  
	      } 
		
		  
		  
	        
	        return -1;
	 };     
	 
	 public void display() {
		
		 
	 }

	public static void main(String[] args) {
		
		ArrayChecker check = new ArrayChecker();
		
		System.out.println("count of repeating element : ");
		check.counter();
		
		System.out.println("Number which are Reapting in the array : " + check.repeatingElement());
		
		
		

	
	}
	

}
