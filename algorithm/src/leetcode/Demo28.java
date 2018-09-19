package leetcode;
/*
 * 从一个String中找到另一个String 返回索引 或者-1
 */
public class Demo28 {
	 public int strStr(String haystack, String needle) {
	     if(needle.length()==0)return 0;
	     if(haystack.length()==0)return -1;
	     
	     
	     
	     char[]c1 = haystack.toCharArray();
	     char[]c2=needle.toCharArray();
	     int count=0;
	     for (int i = 0; i < c1.length-c2.length+1; i++) {
	    	 count=0;
			if(c1[i]==c2[0]){
				int temp=i;
				for (int j = 0; j < c2.length && temp<c1.length; j++,temp++) {
					if(c1[temp]!=c2[j]){
						break;
					}else{
						count++;
					}
					
				}
				if(count==c2.length){
					return i;
				}
			}
		}
	       
		 return -1;
	 }
}
