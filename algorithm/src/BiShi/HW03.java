package BiShi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			System.out.println(bigNumberProduct(str1,str2));
		}

	}
	public static ArrayList<Integer> bigNumberAdd(ArrayList<Integer>prodect,ArrayList<Integer>tmp,int target) {
        int out = 0, count = 0;
        int index1 = 0;
        int index2 = 0;
        
        ArrayList<Integer> tmpList = new ArrayList();	    
        while (index1 < tmp.size() || index2 < prodect.size()) {
            int chs1Tmp = 0, chs2Tmp = 0;
            if (index1 < tmp.size() && count >=target) {
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
        return tmpList;
	}
	public static String bigNumberProduct(String str1,String str2){
		char[]chs1 = str1.toCharArray();
		char[]chs2 = str2.toCharArray();
		ArrayList<Integer> prodect = new ArrayList(); 
	    for(int i = chs2.length - 1; i >= 0; i--){
	        int co = 0;
	        ArrayList<Integer> tmp = new ArrayList();
	        for(int j = chs1.length - 1; j >= 0; j--){
	        	int r = (chs1[j]-'0')*(chs2[i]-'0')+co;
	            int res = r % 10;
	            co = r / 10;
	            tmp.add(res);
	        }
	        if(co > 0){
	            tmp.add(co);
	        }
	        int target = chs2.length - 1 - i;       
//	        int out = 0, count = 0;
//	        int index1 = 0;
//	        int index2 = 0;
//	        
//	        ArrayList<Integer> tmpList = new ArrayList();	    
//	        while (index1 < tmp.size() || index2 < prodect.size()) {
//	            int chs1Tmp = 0, chs2Tmp = 0;
//	            if (index1 < tmp.size() && count >= target) {
//	                chs1Tmp = tmp.get(index1++);
//	            }
//	            if (index2 < prodect.size()) {
//	                chs2Tmp = prodect.get(index2++);
//	            }
//	            int sum = out + chs1Tmp + chs2Tmp;
//	            tmpList.add(sum % 10);     
//	            out = sum / 10;
//	            count++;
//	        }
//	        if(out != 0){
//	            tmpList.add(out);
//	        }
	        prodect = bigNumberAdd(prodect,tmp,target);
	    } 
	    StringBuffer sb = new StringBuffer();
		for(int c:prodect){
			sb.append(c);
		}
		sb.reverse();
	    return sb.toString();
	}
}
