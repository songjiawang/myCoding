package newcode_huawei;

/**
 * 字符串合并处理
 * @author purple
 *
 */
public class Demo31 {
	public static void main(String[] args) {
		ProcessString("dec","fab");
	}
	
	public static void ProcessString(String str1,String str2){
		char [] tmp = (str1+str2).toCharArray();
		int min = 0;
		for (int i = 0; i < tmp.length; i=i+2) {
			min = i;
			for (int j = i+2; j < tmp.length; j=j+2) {
				if(tmp[j]<tmp[min]){
					min = j;
				}
			}
			if(min!=i){
				char t = tmp[i];
				tmp[i] = tmp[min];
				tmp[min] = t;
			}
		}
		for (int i = 1; i < tmp.length; i=i+2) {
			min = i;
			for (int j = i+2; j < tmp.length; j=j+2) {
				if(tmp[j]<tmp[min]){
					min = j;
				}
			}
			if(min!=i){
				char t = tmp[i];
				tmp[i] = tmp[min];
				tmp[min] = t;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tmp.length; i++) {
			//if(String.valueOf(tmp[i]).matches("[0-9|A-F|a-F]")){
			//	String bStr =Integer.toBinaryString(Integer.v)
			//}
		}
		
	
	}


}
