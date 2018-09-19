package sort;
/**
 * ֱ�Ӳ�������(��С����)O(n^2)
 * �ӵڶ���Ԫ�ؿ�ʼ����ÿ��Ԫ�ز��뵽ǰ���Ѿ��ź���������У�ֱ�����
 * @author purple
 *
 */
public class Demo01 {
   public static void sort(int [] array){
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
   
   public static void sort_1(int [] array){
	   for (int i = 1; i < array.length; i++) {
		   int tmp = array[i];
			   for (int j = i-1; j >=0 && array[j+1]<array[j]; j--) {
				array[j+1]=array[j];
				array[j]=tmp;				
			}
		   
	   }
   }
   
   public static void main(String[] args) {
	int[]array = {1,2,4,2,9,4,7};
	sort_1(array);
	for(int i:array){
		System.out.print(i+"");
	}
}
}
