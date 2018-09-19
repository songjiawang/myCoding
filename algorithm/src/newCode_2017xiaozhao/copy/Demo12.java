package newCode_2017xiaozhao.copy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 保留最大数
 * @author purple
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextInt()){
			boolean falg = false;
			int num = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Character>list = new ArrayList<>();			
			char [] ch = String.valueOf(num).toCharArray();
			for (char c:ch) {
				list.add(c);
			}
			int i = 0;
			
			while(i<list.size()-1 && n>0){				
				if(list.get(i)<list.get(i+1)){
					list.remove(i);
					n--;
					i=0;
				}else{
					i++;
				}
			}
			if(n>0){
				while(n-->0){
					list.remove(list.size()-1);
				}
			}
			StringBuffer sb = new StringBuffer();
			while(!list.isEmpty()){
				sb.append(list.remove(0));
			}
			System.out.println(sb.toString());
		}
	}
}
