package newcode_jianzhiOffer;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
 */
public class Demo09 {
	public int JumpFloorII(int target) {
        int count=0;
        if(target==0)return 1;
        for (int i = 1; i <=target; i++) {
			count=count+JumpFloorII(target-i);
		}
        return count;
        
    }
}
