package jianzhioffer;
/**
 * ´óÊý¼õ·¨
 * @author CQIT
 *
 */
public class Demo02 {
	public static String BigNumNeg(String str1,String str2){
		boolean neg = false;
		String jianshu = str2;
		String beijianshu = str1;
		if(str1.length()<str2.length()){
			beijianshu = str2;
			jianshu = str1;
			neg = true;
		}
		char[]ch1= beijianshu.toCharArray();
		char[]ch2 = jianshu.toCharArray();
		int index1 = ch1.length-1;
		int index2 = ch2.length-1;
		char[]res = new char[beijianshu.length()];
		for (int i = 0; i < res.length; i++) {
			res[i] = '0';
		}
		int targetindex = res.length-1;
		int co = 0;
		while(index1>=0&&index2>=0){
			//int tmp1 = ch1[index1]-'0';
			//int tmp2 = ch2[index2]-'0';
			int tmp =  ch1[index1]-ch2[index2]-co;
			if(tmp<0){
				co = 1;
				tmp = tmp+10;
			}else{
				co=0;
			}
			res[targetindex] = (char)(tmp+'0');
			index1--;
			index2--;
			targetindex--;			
		}
		while(index1>=0){
			int tmp = ch1[index1]-'0'-co;
			if(tmp<0){
				co=1;
				tmp = tmp+10;
			}else{
				co = 0;
			}
			res[targetindex] = (char)(tmp+'0');
			index1--;
			targetindex--;		
		}
		while(index2>=0){
			int tmp = ch2[index2]-'0'-co;
			if(tmp<0){
				co=1;
				tmp = tmp+10;
			}else{
				co = 0;
			}
			res[targetindex] = (char)(tmp+'0');
			index2--;
			targetindex--;		
		}
		if(co==1 || neg){
			return "-"+new String(res);
		}else{
			return new String(res);
		}
									
	}
	public static void main(String[] args) {
		System.out.println(BigNumNeg("123","123"));
	}
}
