package newcode_jianzhiOffer;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class Demo11 {
	public int NumberOf1(int n) {
		int count=0;
		while(n!=0){
			if((n&1)==1)count++;
			n=n>>>1;
			
//>>> �޷������ƣ��Ҷ˲�0��>>�з��������Ҷ˲�����λ
		}
		return count;
    }
}
