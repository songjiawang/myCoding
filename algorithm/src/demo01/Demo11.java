package demo01;

import java.util.Scanner;

/**
 * ��������
 * ���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
{1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�
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
