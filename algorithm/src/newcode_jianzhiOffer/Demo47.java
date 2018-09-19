package newcode_jianzhiOffer;
/**
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
