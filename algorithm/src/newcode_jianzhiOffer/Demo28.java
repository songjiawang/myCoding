package newcode_jianzhiOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
 * Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}��
 * ��ô��Ӧ������ǵ�һ���ظ�������2��
 * @author purple
 *
 */
public class Demo28 {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
	    Set<Integer> set = new  HashSet<Integer>();
	    if(length<=0){
	    	duplication[0]=-1;
	    	return false;
	    	
	    }
	    for(int i:numbers){
	    	if(set.contains(i)){
	    		duplication[0]=i;
	    		return true;
	    	}else{
	    		set.add(i);
	    	}
	    }
	    duplication[0]=-1;
		return false;
    }
}
