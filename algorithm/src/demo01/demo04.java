package demo01;

import java.util.Arrays;

/**
 * 我是网络公司的一名普通程序员，英文名Steven，发音比较像“师弟”，自从入职培训自我介绍后，大家就称我为“二师弟”，我喜欢看科幻小说，
 * 也喜欢做梦，有一次梦到外星球，发现外星人使用的并非10进制/16进制等，有些星球居然使用N进制（据统计N都在2~35之间），
 * 现在我们将首先给您一个数字表示N进制，然后给出两个数字的字符串，请算出其求和结果并输出，如果输入不能正常计算则输出-1。
 * @author purple
 *
 */
public class demo04 {
	/**
	 * 将字符转化为数字
	 * @param c
	 * @return
	 */
	public static int charShiftToInt(char c){
		if(c>='a' && c<='z'){
			return c-87;
		}else if(c>='0' && c<='9'){
			return c-(int)'0';
		}else{
			return -1;
		}
	
	}
	/*
	 * 将数字转化成字符
	 */
	public static char intShiftChar(int a,int N){
		if(a>=0 && a<=9){
			return (char)((int)'0'+a);
		}else if(a>9 && a<N){
			return(char)(a+'a'-10);
		}else{
			return '#';
			}
				
	}
	public static String add(String a,String b,int N){
		char[]n1 = a.toCharArray();
		char[]n2 = a.toCharArray();
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		int []indexN1 = new int[a.length()];
		int []indexN2 = new int[b.length()];
		
		for(int i=0;i<a.length();i++){
			indexN1[i]=charShiftToInt(n1[i]);
		}
		for(int j=0;j<b.length();j++){
			indexN2[j]=charShiftToInt(n2[j]);
		}
		System.out.println(Arrays.toString(indexN1));
		System.out.println(Arrays.toString(indexN2));
	//	int maxLength = a.length()>b.length()?a.length():b.length();
		int co=0;
		boolean flag=true;
		
		int i=a.length()-1;
		int j=b.length()-1;
		int []result =new int[(i>j?i:j)+1];
		int k=result.length-1;
		int sum=0;
		while(flag){
			if(i>=0 && j>=0){
				if((sum=indexN1[i]+indexN2[j]+co)>N){
					result[k]=sum%N;
					co=1;
				}else{
					result[k]=indexN1[i]+indexN2[j]+co;
					co=0;
				}
			}else if(i<0){
				for(;k>=0;k--){
					result[k]=indexN1[k];
				}
				flag=false;
			}else{
				for(;k>=0;k--){
					result[k]=indexN2[k];
				}
				flag=false;
			}	
			
			i--;
			k--;
			j--;
			
		}
		
		char[]res = new char[result.length];
		for(int l=0;l<res.length;l++){
			res[l]=intShiftChar(result[l], N);
		}
		String r = new String(res);
		return r;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add("12345678","123456",16));
		//System.out.println(intShiftChar(16, 16));
	}
}
