package HW;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n>1000)n=1000;
			int[]nums = new int[n];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = i;
			}
			System.out.println(remove(nums,n));
			
		}
		
	}
	public static int remove(int[]nums,int len){
		int res = 0;
		int index = 0;
		int tmp = len;
		while(true && len>=2){
			index=(index+1)%len;
			while(nums[index]==-1)index=(index+1)%len;
			if(tmp==1)return index;
			index=(index+1)%len;
			
			while(nums[index]==-1)index=(index+1)%len;
			nums[index]=-1;
			tmp--;
			index=(index+1)%len;
			while(nums[index]==-1)index=(index+1)%len;
			
		}
		return 0;
	}
}
