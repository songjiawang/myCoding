package newcode_jianzhiOffer;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
 */
public class Demo08 {
	 public static int JumpFloor(int target) {
		
		 return jump(target);	
		 
	 }
	 public static int  jump(int n){
		 int count=0;
		 if(n<=0) return 1;
		 if(n>=2){
			 count= count+jump(n-2);
			 count=count+jump(n-1);
		 }
		 if(n==1){
			 
			 count=count+jump(n-1);
		 }
		 
		 return count;
	 }
	 public static void main(String[] args) {
		System.out.println(JumpFloor(2));
	}
}
