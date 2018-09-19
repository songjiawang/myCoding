package newcode_jianzhiOffer;

public class Demo36 {
	 public int FindGreatestSumOfSubArray(int[] array) {
	  if(array.length==0)return -1;
	  int max = array[0];
	  int sum = 0;
	  for (int i = 0; i < array.length; i++) {
		
			sum = array[i];
			max = array[i]>max?array[i]:max;
			for (int j = i+1; j < array.length; j++) {
				sum = sum+array[j];
				max = sum>max?sum:max;
			}
		
			
			
	  }       
	 
	 
	 return max;
	 }
}
