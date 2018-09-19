package BiShi;

import java.util.ArrayList;
import java.util.Collections;

public class HW04 {
	public static void main(String[] args) {
		System.out.println(bigNumberMultiply("235","678"));
	}

	public static String bigNumberMultiply(String str1,String str2){
		char[]chs1 = str1.toCharArray();
		char[]chs2 = str2.toCharArray();
		ArrayList<Integer> prodect = new ArrayList(); 
	    for(int i = chs2.length - 1; i >= 0; i--){
	        int co = 0;
	        ArrayList<Integer> tmp = new ArrayList();
	        for(int j = chs1.length - 1; j >= 0; j--){
	        	int r = (chs1[i]-'0')*(chs2[j]-'0')+co;
	            int res = r % 10;
	            co = r / 10;
	            tmp.add(res);
	        }
	        if(co > 0){
	            tmp.add(co);
	        }
	        int out = 0, count = 0;
	        int index1 = 0;
	        int index2 = 0;
	        int target = chs2.length - 1 - i;       
	        ArrayList<Integer> tmpList = new ArrayList();	    
	        while (index1 < tmp.size() || index2 < prodect.size()) {
	            int chs1Tmp = 0, chs2Tmp = 0;
	            if (index1 < tmp.size() && count >= target) {
	                chs1Tmp = tmp.get(index1++);
	            }
	            if (index2 < prodect.size()) {
	                chs2Tmp = prodect.get(index2++);
	            }
	            int sum = out + chs1Tmp + chs2Tmp;
	            tmpList.add(sum % 10);     
	            out = sum / 10;
	            count++;
	        }
	        if(out != 0){
	            tmpList.add(out);
	        }
	        prodect = tmpList;
	    } 
	    StringBuffer sb = new StringBuffer();
		for(int c:prodect){
			sb.append(c);
		}
		sb.reverse();
	    return sb.toString();
	}
}
