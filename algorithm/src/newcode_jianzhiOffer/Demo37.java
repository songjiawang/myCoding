package newcode_jianzhiOffer;
/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有
 * 1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数。
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
