package newcode_huawei;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序
 * ，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
Input Param 
     n               输入随机数的个数     
 inputArray      n个随机整数组成的数组 

Return Value
     OutputArray    输出处理后的随机整数
 * @author purple
 *
 */
public class Demo03 {
	
	public static void sort(Integer [] array){
		   int end=0;//初始的有序序列 从 0-end
		   for (int i = 1; i < array.length; i++,end++) {
			   int tmp = array[i];
			   for (int j = 0; j <=end; j++) {
				   if(tmp<array[j]){//比较
					   for (int k = end; k >=j; k--) {
						   array[k+1]=array[k];//序列后移
					   }
					   	array[j]=tmp;//插入	
					   	break;//若存在一个小于tmp，插入，不同比较后面的师傅小于tmp 因为后面的肯定小于tmp
				}
			}
		}
	   }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Set<Integer>set = new HashSet<Integer>();
		int count=1;
		while(count<=num){
			set.add(in.nextInt());
			count++;
		}
		
		Integer []res = set.toArray(new Integer[set.size()]);
		sort(res);
		for(Integer i:res){
			System.out.println(i);
		}
		
	}
}
