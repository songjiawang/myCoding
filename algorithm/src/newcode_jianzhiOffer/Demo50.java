package newcode_jianzhiOffer;
/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 * @author purple
 *
 */
public class Demo50 {
	public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n>0)&&((sum=sum+Sum_Solution(n-1))>0);
		return sum;
    }
}
