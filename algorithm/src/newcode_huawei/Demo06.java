package newcode_huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）

最后一个数后面也要有空格

详细描述：

函数接口说明：

public String getResult(long ulDataInput)

输入参数：

long ulDataInput：输入的正整数

返回值：

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
