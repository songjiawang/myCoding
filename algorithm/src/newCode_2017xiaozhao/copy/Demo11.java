package newCode_2017xiaozhao.copy;

import java.util.Scanner;

import demo01.demo01;

/**
 * ²ÊÉ«±¦Ê¯ÏîÁ´
 * @author purple
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(Nums((str+str).toCharArray(),str.length()));
		}
	}
	
	public static int Nums(char[] ch,int n){
		int [] tmp = {-1,-1,-1,-1,-1};
		int min = 2*n;
		int tmpLen = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			switch (c) {
			case 'A': tmp[0] = i;break;
			case 'B': tmp[1] = i;break;
			case 'C': tmp[2] = i;break;
			case 'D': tmp[3] = i;break;
			case 'E': tmp[4] = i;break;
			default:
				break;
			}
			if(tmp[0]==-1||tmp[1]==-1 ||tmp[2]==-1 ||
					tmp[3]==-1 ||tmp[4]==-1){
				continue;
			}else{
				int maxI = Math.max(Math.max(Math.max(tmp[0],tmp[1]), 
						Math.max(tmp[2], tmp[3])), tmp[4]);
				System.out.println(maxI);
				int minI = 	Math.min(Math.min(Math.min(tmp[0], tmp[1]),
								Math.min(tmp[2],tmp[3])), tmp[4]);
				System.out.println(minI);
				tmpLen = maxI-minI+1;
				min = Math.min(min,tmpLen);
			}
		}
		return n-min;
		
		
	}
}
