package newcode_jianzhiOffer;
/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * @author purple
 *
 */
public class Demo51 {
	public static int Add(int num1,int num2) {
        while(num2!=0){
        	int tmp=num1^num2;
        	int co = num1&num2;
        	num2 = co<<1;
        	num1 = tmp;
        }
        return num1;
    }
	 
	public static void main(String[] args) {
		System.out.println(Add(111,89));
	}
}
