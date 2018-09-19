package newcode_huawei;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С��������
 * �������źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
Input Param 
     n               ����������ĸ���     
 inputArray      n�����������ɵ����� 

Return Value
     OutputArray    ����������������
 * @author purple
 *
 */
public class Demo03 {
	
	public static void sort(Integer [] array){
		   int end=0;//��ʼ���������� �� 0-end
		   for (int i = 1; i < array.length; i++,end++) {
			   int tmp = array[i];
			   for (int j = 0; j <=end; j++) {
				   if(tmp<array[j]){//�Ƚ�
					   for (int k = end; k >=j; k--) {
						   array[k+1]=array[k];//���к���
					   }
					   	array[j]=tmp;//����	
					   	break;//������һ��С��tmp�����룬��ͬ�ȽϺ����ʦ��С��tmp ��Ϊ����Ŀ϶�С��tmp
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
