package newcode_jianzhiOffer;
/**
 * 将两个排序后的a2插入到排序后的a1
 * @author CQIT
 *
 */
public class Demo66 {
	public static void sortOneToOther(int[]a1,int n,int[] a2){
		if(a2.length==0)return;
		int len1 = a1.length;
		int len2 = a2.length;
		if(len2+n>len1) throw new RuntimeException("zero not enougth");
		if(n==0){
			for (int i = 0; i < a2.length; i++) {
				a1[i] = a2[i];
			}
			return;
		}
		
		int p1 = n+a2.length-1;
		int p2 = n-1;
		int p3 = len2-1;
		while(p3>=0){
			if(a1[p2]>=a2[p3]){
				a1[p1] = a1[p2];
				p1--;
				p2--;
			}else{
				a1[p1] = a2[p3];
				p3--;
				p1--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[]a1 = {0,0,0,0,0};
		int[]a2 = {4,7,10,11,14};
		sortOneToOther(a1,0,a2);
		for(int i:a1){
			System.out.print(i+" ");
		}
		
	}
}
