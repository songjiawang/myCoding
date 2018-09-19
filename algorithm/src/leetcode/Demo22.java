package leetcode;
/*
 * 输出n个括号组成的所有完璧的String list
 */
import java.util.ArrayList;
import java.util.List;

public class Demo22 {
	 public List<String> generateParenthesis(int n) {
		 List<String> list = new ArrayList<String>();
		 callback(n,0,0,list,"");
		 return list;		 
	 }
	 public void callback(int max,int open,int close,List list, String str){
		 if(str.length()==max*2){
			 list.add(str);
			 return; 
	 	}
	 	if(open<max){
	 		callback(max,open+1,close,list,str+"(");
	 		}
	 	if(close<open){
	 		callback(max,open,close+1,list,str+")");
	 	}
	}
}
