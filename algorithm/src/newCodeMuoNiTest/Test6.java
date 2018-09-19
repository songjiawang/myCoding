package newCodeMuoNiTest;

import java.util.Scanner;

/**
 * 最高分是多少
 * @author purple
 *
 */
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String[] str = sc.nextLine().split(" ");
			
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int[]data = new int[n];
			int i = 0;
			String[] str1 = sc.nextLine().split(" ");
			for (int j = 0; j < str1.length; j++) {
				data[j] = Integer.parseInt(str1[j]);
			}
			
			
			
			
			while(m-->0){	
				String[] str2 = sc.nextLine().split(" ");
				String c =str2[0];
				
				int start = Integer.parseInt(str2[1]);
				int end = Integer.parseInt(str2[2]);
				
				if(c.equals("Q")){
					System.out.println(select(data,start,end));
				}else{
					update(data,start,end);
				}
			}
			
		}
		
		
	}

	public static void update(int[] data, int index, int k) {
		// TODO Auto-generated method stub
		data[index-1] = k;
	}

	public static int select(int[] data, int start, int end) {
		// TODO Auto-generated method stub
		int max = 0;
		int minI = Math.min(start, end);
		int maxI = Math.max(start, end);
		for (int i = minI-1; i <=maxI-1; i++) {
			max = Math.max(data[i], max);
		}
		return max;
	}
}
