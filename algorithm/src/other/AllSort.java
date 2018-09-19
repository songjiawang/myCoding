package other;

import java.util.LinkedList;

public class AllSort {
	
	public static void main(String[] args) {
		allSort("abc");
	}
	
	public static void allSort(String str){
		LinkedList<String>list = new LinkedList<String>();
		list.add(str);	
		for (int i = 0; i < str.length(); i++) {
			int size  = list.size();
			while(size-->0){
				char[] tmp = list.pop().toCharArray();
				for (int j = i; j < tmp.length; j++) {
					String s = swap(tmp,i,j);
					//if(!list.contains(s)){
						list.add(s);
						System.out.println("µÚ"+i+" "+s);
					//}
					
				}
				
			}
		}
			
		//for(String s:list){
		//	System.out.println(s);
		//}
		while(!list.isEmpty()){
			System.out.println(list.pop());
		}
		
	}
	public static String swap(char[]n,int i,int j){
		char tmp = n[i];
		n[i] = n[j];
		n[j] = tmp;
		return new String(n);
	}
}
