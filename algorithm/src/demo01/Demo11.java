package demo01;

import java.util.Scanner;

/**
 * 回文序列
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
{1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
现在给出一个数字序列，允许使用一种转换操作：
选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
 * @author purple
 *
 */
public class Demo11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int [] array = new int[n];
			int i = 0;
			while(n-->0){
				array[i] = sc.nextInt();
				i++;
			}
			i=0;
			int j = array.length-1;
			int count = 0;
			while(i<j){
				if(array[i]==array[j]){
					i++;
					j--;
					continue;
				}else{
					if(array[i]>array[j]){
						array[j-1] = array[j-1]+array[j];
						j = j-1;
						count++;
						continue;
					}else{
						array[i+1] = array[i+1]+array[i];
						i=i+1;
						count++;
						continue;
					}
				}
			}
			System.out.println(count);
		}
	}
}
