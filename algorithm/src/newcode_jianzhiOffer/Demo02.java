package newcode_jianzhiOffer;
/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Demo02 {
	public static String replaceSpace(StringBuffer str) {
    	if(str.length()==0)return str.toString();
    	for (int i = 0; i < str.length();) {
			if(str.charAt(i)==' '){
				//str.deleteCharAt(i);
				str.replace(i, i+1, "%20");
				i=i+3;
			}else{
				i++;
			}
		}
    	
		return str.toString();
    }
	
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer(" ni  hao ");
		System.out.println(replaceSpace(str));
	}
}
