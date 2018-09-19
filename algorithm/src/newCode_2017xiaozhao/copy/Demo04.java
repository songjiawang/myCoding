package newCode_2017xiaozhao.copy;

import java.util.Scanner;
/**
 * 树的高度
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
				//测试用例给出的是多叉树，因此只保留2个有效的子节点
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
