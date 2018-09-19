package demo01;
/*
 * "song jia wang"->"wang jia song"
 */
public class Demo07 {
	public static String solution(String str){
		String[] splitStr = str.split(" ");
		StringBuffer res = new StringBuffer();
		for (int i = splitStr.length-1; i>=0; i--) {
			if(res.length()!=0)
				res.append(" ");
			res.append(splitStr[i]);
		}							
		return res.toString();
	}
	
	public static String solution2(String str){
		char[]c = str.toCharArray();
		c=reShift(c,0,c.length-1);
		System.out.println(new String(c));
		int start=0;
		int end=0;
		for (int i = 0; i < c.length;i++ ) {
			if(c[i]==' '){
				end=i-1;
				reShift(c,start,end);
				start=i+1;
			}else if(i==c.length-1){
				end=i;
				reShift(c,start,end);
			}		
		}
				
		return new String(c);
	}
	
	public static char[] reShift(char []c,int start,int end){
		int index = (start+end)/2;
		for (int i = start; i <=index; i++) {
			char temp=c[i];
			c[i]=c[end];
			c[end]=temp;
			end--;
		}
		return c;
	}
	
	public static void main(String[] args) {
		char[]c={'1','2','3','4','5'};
		String str = "song jia wang";
		System.out.println(solution2(str));
	}
}
