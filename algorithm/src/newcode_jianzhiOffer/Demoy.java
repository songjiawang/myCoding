package newcode_jianzhiOffer;
/*
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
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
