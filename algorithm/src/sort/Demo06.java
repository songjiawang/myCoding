package sort;
/**
 * ��������(��������)(nlogn)
 * @author purple
 *
 */
public class Demo06 {
	public static void fastSort(int []array,int start,int end){
		int pivot;
		if(start<end){
			pivot =partition(array,start,end);
			fastSort(array,start,pivot-1);
			fastSort(array,pivot+1,end);
		}
		
	}
	//��i ��j ֮������������� ���������λ��
	//�������ñȽ�->����ķ�����С�ڻ�׼��Ԫ�ط�����ߣ����ڻ�׼��Ԫ�ط����ұߣ�������Ҫ�����ıȽϺ��ƶ�����
	public static int partition(int [] array, int i, int j){
		int pivot = array[i];//ʹ�õ�һ��Ԫ����Ϊ��׼
		while(i<j){
			while(array[j]>pivot && i<j) j--;//���������ҵ���һ��С��pivot��Ԫ��
			if(i<j){
				int tmp = array[j];
				array[j]=array[i];
				array[i]=tmp;
				i++;
			}
			while(array[i]<pivot && i<j)i++;//���������ҵ���һ������pivot��Ԫ��
			if(i<j){
				int tmp = array[i];
				array[i]=array[j];
				array[j]=tmp;
				j--;
			}
		}
		return i;		
	}

	 public static void main(String[] args) {
 		int[]array = {5,1,6,7,4,3,2,7,4};
 		fastSort(array,0,array.length-1);
 		for(int i:array){
 			System.out.print(i+"");
 		}
 	}
}
