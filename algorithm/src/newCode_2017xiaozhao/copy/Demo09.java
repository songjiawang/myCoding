package newCode_2017xiaozhao.copy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * ´üÊó¹ýºÓ
 * 
 * @author purple
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int []power = new int[n];
			int len = n;
			int i = 0;
			LinkedList<Integer> res = new LinkedList<>();
			while(n-->0){
				power[i] = sc.nextInt();
				i++;
			}
			jump(power,res,0,len,0);
			Collections.sort(res);
			if(res.size()==0){
				System.out.println(-1);
			}else{
				System.out.println(res.peek()+1);
			}
		
		}
	}
	
	public static void jump(int []power ,LinkedList<Integer> res,int n,int len,int count){
		if(n==len-1){
			res.add(count);
			return;
		}
		
		if(n>=len)return;
		
		if(power[n]==0){
			return;
		}
		for (int i = 1; i <=power[n]; i++) {
			jump(power,res,n+i,len,count+1);
		}
		
	} 
}
