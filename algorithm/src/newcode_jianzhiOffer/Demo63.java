package newcode_jianzhiOffer;
/**
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
 *  ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 * @author purple
 *
 */
public class Demo63 {
	public boolean isNumeric(char[] str) {
        boolean hasFirstSign = false;
        boolean hasESign = false;
        boolean hasE = false;
        boolean haspoint = false;
        if(str.length==0)return false;
        int i = 0;
       while(i<str.length){
    	   if((str[i]=='+' || str[i]=='-') && i==0){
    		   hasFirstSign = true;
    	   }else if((str[i]=='+' || str[i]=='-') && hasE && (str[i-1]=='e' || str[i-1]=='E')){
    		   hasESign = true;
    	   }else if(str[i]=='.' && !haspoint && !hasE && (i+1<str.length && (str[i+1]>='0' || str[i+1]<='9'))){
    		   haspoint = true;
    	   }else if((str[i]=='e' || str[i]=='E') && !hasE && (i+1<str.length && (str[i+1]>='0' || str[i+1]<='9'))){
    		   hasE = true;
    	   }
    	   else if(str[i]>='0' && str[i] <='9'){
    		   
    	   }else return false;
    	   i++;
    	   
       }
       return true;
    }
	
	
	
	
	
	
	
	
	
	
}
