package newcode_jianzhiOffer;
/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class Demo10 {
	public static int RectCover(int target) {
		if(target==0)return 0;
		return cover1(target);
    }
	public static int cover1(int n){
		int count=0;
		if(n==0){
			return 1;
		}
		if(n>=2){
			count=count+cover1(n-2);
			count=count+cover1(n-1);
		}
		if(n==1){
			count = count+cover1(n-1);
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(RectCover(4));
	}
}
