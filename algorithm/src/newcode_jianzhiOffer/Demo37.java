package newcode_jianzhiOffer;
/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������
 * 1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 * @author purple
 *
 */
public class Demo37 {
	public int NumberOf1Between1AndN_Solution(int n) {
	    int count = 0;
		for (int i = 1; i <= n; i++) {
			count =count+count1(i);
		}
		return count;
    }
	public int count1(int n){
		if(n%10==1){
			if(n/10==0){
				return 1;
			}else return 1+count1(n/10);
		}else{
			if(n/10==0)return 0;
			return 0+count1(n/10);
		}
		
	}
}
