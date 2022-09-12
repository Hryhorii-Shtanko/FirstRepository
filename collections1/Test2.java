package collections1;

public class Test2  {

	  public static void main(String[] args) {
		    int[] array = {20, -10, 15, -7, -8, 45};
		    double max= array[0];
		    double min= array[0];
		    
		    for(int i = 0; i < array.length; i ++) {
		    	if(array[i]>max) {
		    		max = array[i];
		    	}
		    	if(array[i]<min) {
		    		min = array[i];
		    	}
		    } 
		    	System.out.println(min + " "+ max);
		    	
		    
//		    	System.out.print(array[i]+ " ");
//		    }
//		    System.out.println();
//		    Arrays.sort(array);
//		    for(int i = 0; i < array.length; i ++) {
//		    	System.out.print(array[i]+ " ");
//		    }
//System.out.println();
//  System.out.println(array);
//		    int index1 =Arrays.binarySearch(array, 15); 
//		    System.out.println(index1);
//		    
//		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
//		    int sum = 0;
//		    for(int i = 0; i<array.length;i++) {
//		      // MISSING IF STATEMENT //
//		    	if(array[i] > 0) {
//		        sum+=array[i];
//		      }}
//		    System.out.println(sum);
}
		   
		  
		}

//
//public static void main(String[] args) {
//   int a = 5;
//   int b = 7;
//   swap(a,b);
//   System.out.println(a + ", " + b);
//}
//public static void swap(int a, int b) {
//   int temp = a;
//   a = b;
//   b = temp;
//}