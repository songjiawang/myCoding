package leetcode;
/*
 * ����n���Ǹ�����a1,a2,...,an������ÿ������һ�������꣨i,ai���� n����ֱ�߶������߶ε������˵��ڣ�i,ai���ͣ�i,0���� �ҵ������߶Σ���x���γ�һ��������
 * ʹ���������ˮ�ڶ�ά����ϵ�У�
 * (i, ai) ��ʾ �� (i, 0) �� (i, ai) ��һ���߶Σ����������������߶κ� x �����һ��ľͰ��
 * �ҳ��ܹ�ʢˮ����ľͰ���������ݻ���
 */
public class Demo11 {
	/**
	 * ����ѭ���ı�����
	 * @param height
	 * @return
	 */
	//��ʱ
	 public int maxArea1(int[] height) {
		 int max=0;
	     for (int i = 0; i < height.length; i++) {
			for (int j = i+1; j < height.length; j++) {
				int temp;
				temp=Math.min(height[i], height[j])*(j-i);
				max=temp>max?temp:max;
			}
		}
		 
		 return max;   
	 }
	 
	 
	 public int maxArea2(int[] height) {
		 int max=0;
		 int left=0;
		 int rigth=height.length-1;
		 int minHeight = height[rigth]>height[left]?height[left]:height[rigth];
		 while(left!=rigth){
			 int temp=(rigth-left)*minHeight;
			 max=temp>max?temp:max;
			 if(height[left]>height[rigth]){
				 left++;
				 minHeight= height[rigth]>height[left]?height[left]:height[rigth];
			 }else{
				 rigth--;
				 minHeight= height[rigth]>height[left]?height[left]:height[rigth];
			 }
		 }
		 
		 return max;   
	 }
}
