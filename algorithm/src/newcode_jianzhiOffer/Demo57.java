package newcode_jianzhiOffer;

import java.util.ArrayList;

/**
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,
 * ��ȻҲ׼����һЩС��Ϸ������,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,
 * �ñ��Ϊ0��С���ѿ�ʼ������ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,
 * ���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,
 * ���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��������������,�ĸ�С���ѻ�õ������Ʒ�أ�
 * (ע��С���ѵı���Ǵ�0��n-1)
 * @author purple
 *
 */
public class Demo57 {
	public static int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> list = new ArrayList();
        if(n==0 || m==0)return -1;
        for (int i = 0; i < n; i++) {
			list.add(i);
		}
        removeInt(list,m,0);
        return list.get(0);
    }

	public static void removeInt(ArrayList<Integer> list, int m,int start) {
		if(list.size()==1)return;
		else{
			int i = ((m-1)+start)%list.size();
			int nextIndex = i;
			if(i ==list.size()-1)nextIndex = 0;
			int n = list.remove(i);
			System.out.println(n);			
			removeInt(list,m,nextIndex);		
		}
		
	}
	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(5,2));
	}
}
