package newcode_huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��

���һ��������ҲҪ�пո�

��ϸ������

�����ӿ�˵����

public String getResult(long ulDataInput)

���������

long ulDataInput�������������

����ֵ��

String
 * @author purple
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String str = sc.nextLine();
		System.out.println(new Demo06().getResult(Long.parseLong(str)));
		}
		
	}
	public String  getResult(long ulDataInput){
		long tmp=ulDataInput;
		boolean flag = true;
		int i=0;
		StringBuffer str = new StringBuffer();
		if(ulDataInput==1){
			str.append(String.valueOf(1)+" ");
			return str.toString();
		}
		while(flag){
			for ( i = 2; i <= tmp/2; i++) {
				if(tmp%i==0){
					str.append(String.valueOf(i)+" ");
					tmp=tmp/i;
					
					break;
				}
			}
			
			if(tmp==1)flag=false;
			if(i>tmp/2 &&tmp!=1){
			  str.append(String.valueOf(tmp)+" ");
				flag=false;
			}
		}
		
		
		
		return str.toString();
	}
}
