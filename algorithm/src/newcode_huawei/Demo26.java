package newcode_huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * ��дһ�����򣬽������ַ����е��ַ������¹�������

���� 1 ��Ӣ����ĸ�� A �� Z ���У������ִ�Сд��

       �磬���룺 Type   ����� epTy

���� 2 ��ͬһ��Ӣ����ĸ�Ĵ�Сдͬʱ����ʱ����������˳�����С�

     �磬���룺 BabA   ����� aABb

���� 3 ����Ӣ����ĸ�������ַ�����ԭ����λ�á�

     �磬���룺 By?e   ����� Be?y

������

    ���룺

   A Famous Saying: Much Ado About Nothing(2012/8).

    �����

   A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).


 * @author purple
 *
 */
public class Demo26 {
	public static void main(String[] args) {
		//ʹ�ñȽ���
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
		
		//�ǱȽ�
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
