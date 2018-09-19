package newCode_2017xiaozhao.copy;
/**
 * Êý´®
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
public class Demo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			Integer [] num = new Integer[n];
			
			int i  = 0;
			while(n-->0){
				num[i] = sc.nextInt();
				i++;
			}
			System.out.println(num[0]+"  "+num[1]);
			Arrays.sort(num,new OneComparator());
			String str = "";
			for(int t:num){
				str = str+""+t;
			}
			System.out.println(str);
		}
	}
	
}
class OneComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		String num1 = String.valueOf(o1);
		String num2 = String.valueOf(o2);
		String s1 = num1+num2;
		String s2 = num2+num1;
		int res = Integer.parseInt(s1)-Integer.parseInt(s2);
		if(res==0)return 0;
		else if(res>0){
			return -1;
		}else{
			return 1;
		}
		
		
	}
	
	
	
}
