package leetcode;
/*
 * �ж�һ��int�ǲ��ǻ���  ��1234321�� ��Ҫʹ�ö����space
 */
public class Demo09 {
	public boolean isPalindrome(int x) {
        boolean res = true;
		if(x<0)return false;
        int factor=x;
        int remainder = 0;
        long back=0;
        while(factor!=0){
        	remainder = factor%10;
        	back = back*10+remainder;
        	factor = factor/10;
        }
        if(back!=x){res=false;}
        else res = true;
        return res;
    }
}
