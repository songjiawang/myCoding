package newcode_jianzhiOffer;
/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,
 * ������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13�������5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
 * ��So Lucky!����LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�
 * Ϊ�˷������,�������Ϊ��С����0��
 * @author purple
 *
 */
public class Demo56 {
	public static boolean isContinuous(int [] numbers){
		if(numbers.length!=5)return false;
		
		//*****ֱ��ѡ����������
		int min = 0;//��СԪ������
		for (int i = 0; i < numbers.length-1; i++) {
			min = i;
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j]<numbers[min]) min = j;
			}
			if(min!=i){
				int tmp = numbers[i];
				numbers[i] = numbers[min];
				numbers[min]=tmp;
			}
		}		
		//****end
		
		for(int i:numbers){
			System.out.print(i+" ");
		}
		int count=0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0){count++;continue;}		
		}
		System.out.println(count);
		int tmp = numbers[count];
		for (int i = count+1; i < numbers.length; i++) {
			if(numbers[i]>tmp){
				if(numbers[i]-tmp==1){
					tmp=numbers[i];}
				else{
					if(numbers[i]-tmp-1<=count){
						count = count-(numbers[i]-tmp-1);
						tmp = tmp=numbers[i];
					}else{
						return false;
					}
				}
			}else{
				return false;
			}
		}
		return true;
		
		
    }
	public static void main(String[] args) {
		int[]a = {1,3,0,7,0};
		System.out.println(isContinuous(a));
	}
}
