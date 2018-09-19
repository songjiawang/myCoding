package newcode_huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 编写一个程序，将输入字符串中的字符按如下规则排序。

规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。

       如，输入： Type   输出： epTy

规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。

     如，输入： BabA   输出： aABb

规则 3 ：非英文字母的其它字符保持原来的位置。

     如，输入： By?e   输出： Be?y

样例：

    输入：

   A Famous Saying: Much Ado About Nothing(2012/8).

    输出：

   A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).


 * @author purple
 *
 */
public class Demo26 {
	public static void main(String[] args) {
		//使用比较器
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char []ch = sc.nextLine().toCharArray();
			StringBuffer sb = new StringBuffer();
			ArrayList<Character>list = new ArrayList();
			for(char c:ch){
				if(Character.isLetter(c))
				list.add(c);
			}
			Collections.sort(list, new Comparator<Character>() {

				@Override
				public int compare(Character o1, Character o2) {
					// TODO Auto-generated method stub
					return Character.toLowerCase(o1)-Character.toLowerCase(o2);
					
				}
			});
			
			int i = 0;
			for(char c:ch){
				if(Character.isLetter(c)){
					sb.append(list.get(i));
					i++;
				}else{
					sb.append(c);
				}
			}
			System.out.println(sb.toString());
		}
		
		//非比较
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextLine()){
//			char []ch = sc.nextLine().toCharArray();
//			StringBuffer sb = new StringBuffer();
//			for (int i = 0+'a'; i < 26+'a'; i++) {
//				for (int j = 0; j < ch.length; j++) {
//					if(ch[j]==(char)i || ch[j]==(char)(i-32)){
//						sb.append(ch[j]);
//					}
//				}
//			}
//			for (int i = 0; i < ch.length; i++) {
//				if(!Character.isLetter(ch[i])){
//					sb.insert(i, ch[i]);
//				}
//			}
//			System.out.println(sb.toString());
//		}
	}
}
