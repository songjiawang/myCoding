package newCode_2017xiaozhao.copy;

import java.util.Scanner;
/**
 * ���ĸ߶�
 * @author purple
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int [] deep = new int[n];
			int [] nums = new int[n];
			int max = 1;
			deep[0] = 1;
			n=n-1;
			while(n-->0){
				
				int parent = sc.nextInt();
				int child = sc.nextInt();
				//���������������Ƕ���������ֻ����2����Ч���ӽڵ�
				nums[parent] = nums[parent]+1;
				if(nums[parent]<=2){
			
				deep[child] = deep[parent]+1;
				max = max>deep[child]?max:deep[child];	
				}		
			}
			System.out.println(max);
		}
		
	}
}
