package BiShi;

import java.util.Arrays;
import java.util.Scanner;

public class ZhaoShangBank03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] turn={0,1,5,-1,-1,2,9,-1,8,6};
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if(isHaoNum(i, turn))count++;
			}
			System.out.println(count);
			
		}
	}
	public static boolean isHaoNum(int n,int[]turn){
		String str = String.valueOf(n);
		char[]chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			int tmp = chs[i]-'0';
			if(turn[tmp]==-1){
				return false;
			}else{
				chs[i] = (char)(turn[tmp]+'0');
			}
		}
		String s = new String(chs);
		if(str.equals(s)){
			return false;
		}else{
			return true;
		}
	}
}
	
