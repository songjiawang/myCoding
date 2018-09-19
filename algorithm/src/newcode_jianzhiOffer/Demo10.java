package newcode_jianzhiOffer;
/*
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
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
