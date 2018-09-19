package leetcode;
/*
 * 给定n个非负整数a1,a2,...,an，其中每个代表一个点坐标（i,ai）。 n个垂直线段例如线段的两个端点在（i,ai）和（i,0）。 找到两个线段，与x轴形成一个容器，
 * 使其包含最多的水在二维坐标系中，
 * (i, ai) 表示 从 (i, 0) 到 (i, ai) 的一条线段，任意两条这样的线段和 x 轴组成一个木桶，
 * 找出能够盛水最多的木桶，返回其容积。
 */
public class Demo11 {
	/**
	 * 两层循环的暴力法
	 * @param height
	 * @return
	 */
	//超时
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
