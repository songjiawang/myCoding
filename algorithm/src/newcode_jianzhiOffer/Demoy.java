package newcode_jianzhiOffer;
/*
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Demoy {
	public String LeftRotateString(String str,int n) {
        if(str.length()==0)return "";
		char[]c= str.toCharArray();
        while(n>0){
        	char temp=c[0];
        	for (int i = 1; i < c.length; i++) {
				c[i-1]=c[i];
			}
        	c[c.length-1]=temp;
        n--;
        }
		return new String(c);
    }
}
