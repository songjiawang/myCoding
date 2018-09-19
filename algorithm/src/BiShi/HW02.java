package BiShi;
/**
 * 找字符串中最后出现的非重复的字符
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class HW02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			System.out.println(find(str.toCharArray()));
		}
		
	}
	public static Character find(char[]chs){
		int[] tmp = new int[258];
		Character earlyChar=null;
		for (int i = 0; i < chs.length; i++) {			
				tmp[chs[i]]++;				
		}
		
		for (int i = chs.length-1; i >= 0; i--) {
			if(tmp[chs[i]]==1){
				return chs[i];
			}
		}
		return null;
	}
	public static Character find2(char[]chs){
		LinkedList<Character>list1 = new LinkedList();	
		LinkedList<Character>list2 = new LinkedList();
		for (int i = 0; i < chs.length; i++) {
			if(!list1.contains(chs[i])){
				if(!list2.contains(chs[i])){
					list1.add(chs[i]);
					list2.add(chs[i]);
				}
				
			}else{
				list1.remove(list1.indexOf(chs[i]));
			}
			
		}
		if(list1.size()==0)return null;
		else{
			return list1.getLast();
		}
		
	}
	public static Character find3(char[]chs){
		Set<Character>set = new HashSet();
		for (int i = 0; i < chs.length; i++){
			set.add(chs[i]);
		}
			for (int i = chs.length-1; i >=0; i--) {
				if(!set.contains(chs[i])){
					return chs[i];
				}
			}
			return null;
			
	}
	
}
