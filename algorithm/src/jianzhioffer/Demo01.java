package jianzhioffer;
/**
 * 打印1到n的最大n位数
 * @author CQIT
 *
 */
public class Demo01 {
	public static void print1ToMaxOfNDi(int n){
		char[]ch = new char[n];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = '0';
		}
		while(!sum(ch)){
			myPrint(ch);
		}
		
		
	}
	private static void myPrint(char[] ch) {
		// TODO Auto-generated method stub\
		boolean start = false;
		for (int i = 0; i < ch.length; i++) {
			if(!start && ch[i]!='0'){
				start = true;
			}
			if(start){
				System.out.print(ch[i]);
			}
		}
		System.out.print("\n");
	}
	private static boolean sum(char[] ch) {
		// TODO Auto-generated method stub
		boolean res = true;
		for (int i = ch.length-1; i >=0; i--) {
			if(ch[i]!='9'){
				ch[i] = (char) (ch[i]+1);
				res = false;
				break;
			}else{
				ch[i]='0';
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		print1ToMaxOfNDi(2);
		
	}
}
