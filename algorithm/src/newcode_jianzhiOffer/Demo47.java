package newcode_jianzhiOffer;
/**
 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 * ��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 * @author purple
 *
 */
public class Demo47 {
	public String ReverseSentence(String str) {
       if(str.length()==0)return "";
		char [] ch = str.toCharArray();
       
       reOneWord(ch,0,ch.length-1);
       int start=0;
       int end=0;
       int i=0;
       while(i<ch.length){
    	   while(i<ch.length && ch[i]==' ' )i++;
    	   start = end =  i;
    	  
    	   while(i<ch.length && ch[i]!=' '  )i++;
    	   end = i;
    	  if(start<ch.length)
    	   reOneWord(ch,start ,end-1);
    		  
    	   
    	   
    	   
       }
       return new String(ch);
       
    }
	
	public void reOneWord(char[] ch,int start,int end){
		for (int i = 0; i <=(end-start)/2; i++) {
			char tmp = ch[start+i];
			ch[start+i]=ch[end-i];
			ch[end-i] = tmp;
	       }
	}
}
