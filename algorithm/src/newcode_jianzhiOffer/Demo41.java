package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�
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
