package newcode_jianzhiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Demo32 {
	public ArrayList<String> Permutation(String str) {
		char [] ch = str.toCharArray();
		Set<String> set = new TreeSet();
		Permutation(ch,0,set);
		ArrayList<String> list = new ArrayList();
		list.addAll(set);
		return list;
    }
	public void Permutation(char ch[],int begin, Set set){
	  if(ch==null || ch.length==0 )return;
	  set.add(String.valueOf(ch));
	  for (int i = begin+0; i < ch.length; i++) {
		swap(ch,begin,i);
		Permutation(ch,begin+1,set);
		swap(ch,begin,i);
	}
	  	  
	}
	
	public void swap(char[] ch,int i, int j){
		char tmp  = ch[i];
		ch[i]=ch[j];
		ch[j]=tmp;
	}
}
