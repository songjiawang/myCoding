package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @author purple
 *
 */
public class Demo41 {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer>list = new ArrayList();
        for(int i:array){
        	if(list.contains(i)){
        		list.remove(list.indexOf(i));
        	}else{
        		list.add(i);
        	}
        }
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
}
