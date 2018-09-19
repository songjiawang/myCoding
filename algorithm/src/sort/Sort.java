package sort;

public class Sort {
	/**
	 * 交换排序类
	 * 冒泡排序：时间复杂度O(n^2),空间复杂度(1),稳定
	 * 
	 * @param n
	 */
	public static void bubbleSort(int[]n,int len){
		boolean flag = true;
		//冒泡len-1次
		for (int i = 0; i <len; i++) {
			if(!flag)return;//如果有一次冒泡没有进行交换，说明已经排序成功，不需要继续冒泡
			flag = false;
			//从上往下冒泡
			for (int j = len-2; j >=i; j--) {
				if(n[j]>n[j+1]){
					swap(n,j,j+1);
					flag=true;
				}
			}
		}
	}
	/**
	 * 交换排序类
	 * 简单选项排序(每次从为排序的序列中遍历出最小的交换到有序区的末尾)
	 * 时间复杂度O(n^2)空间复杂度O(1),稳定
	 * @param n
	 * @param len
	 */
	public static void selectSort(int[]n,int len){
		int min=0;//有序区末尾索引
		for (int i = 0; i < n.length; i++) {
			min = i;
			//从无序区中选择最小的元素索引
			for (int j = i+1; j < n.length; j++) {
				if(n[j]<n[min]){
					min = j;
				}
			}
			if(min!=i){
				swap(n,min,i);
			}
		}
	}
	/**
	 * 插入排序类
	 * 直接插入排序
	 * 选择无序区的头数据，从有序区的末尾向有序区的头比较插入，若小于比较元素，继续向前插入。
	 * 时间复杂度O(n^2)空间复杂度O(1),稳定
	 * @param n
	 * @param len
	 */
	public static void insertSort(int[]n ,int len){
		//无序区默认从1开始，第0个元素有序
		for (int i = 1; i < n.length; i++) {
			//若是发现当前位置(j+1)的值小于前面的位置(j),进行交换，继续向前比较。
			for (int j = i-1; j>=0 && n[j+1]<n[j]; j--) {
				swap(n,j+1,j);
			}
		}
	}
	/**
	 * 插入排序类
	 * 希尔排序(缩小增量排序)
	 * 将相隔某个增量的序列进行直接插入排序——》缩小增量——》相隔某个增量的序列直接插入排序——》直到增量为1
	 * 时间复杂度O(nlgn)空间复杂度O(1),不稳定
	 * @param n
	 * @param len
	 */
	public static void shellSort(int[]n ,int len){
		//d为增量
		for (int d = len/2; d >=1; d--) {
			
			//将相隔增量的序列进行直接插入排序
			for (int i = d; i < n.length; i++) {
				for (int j = i-d; j>=0 && n[j+d]<n[j]; j=j-d) {
					swap(n,j,j+d);
				}
				
			}
		}
	}
	/**
	 * 二路幷归
	 * 将相邻的两个有序的子序列合并成一个有序的子序列
	 * @param n
	 * @param start
	 * @param mid
	 * @param end
	 * @return
	 */
	public static void mergeTwo(int[]n,int start,int mid,int end){
		//建立临时存放数组
		int[]tmp = new int[end-start+1];
		int i = start,j = mid+1,k=0;
		//归并幷排序
		while(i<=mid && j<=end){
			tmp[k++] = n[i]>n[j]?n[j++]:n[i++];
		}
		//将剩余部分补充道tmp后
		for (int k2 = i; k2 <=mid; k2++) {
			tmp[k++]=n[k2];
		}
		for (int k2 = j; k2 <=end; k2++) {
			tmp[k++]=n[k2];
		}
		
		//归并完成后将tmp的数据复制回元数组
		for (int k2 = 0; k2 < tmp.length; k2++) {
			n[start++] = tmp[k2];
		}
		
	}
	public static void merge(int[]n,int d){
		int i=0;
		for (i = 0; i+2*d-1 < n.length; i=i+2*d) {
			mergeTwo(n,i,i+d-1,i+2*d-1);
		}
		//处理余下不够2*d的序列
		//如果剩余序列大于d，即有一个半，继续归并，否则返回
		if(i+d-1<n.length){
			mergeTwo(n,i,i+d-1,n.length-1);
		}
		
		//for(int i2:n){
		//	System.out.print(i2+" ");
		//}	
		//System.out.println("\n");
		
	}
	/**
	 * 归并排序
	 * 时间复杂度O(nlgn)空间复杂度O(n),稳定
	 * @param n
	 * @param len
	 */
	public static void mergerSort(int[]n,int len){
		for (int i = 1; i <len; i=2*i) {
			merge(n,i);
		}
	}
	/**
	 * 交换排序类
	 * 快速排序
	 * 通过一趟排序将序列分成两部分，使得前一部分均比后部分值小，然后递归排序两个子序列
	 * 时间复杂度O(nlgn)空间复杂度O(n),不稳定
	 * @param n
	 */
	public static void quickSort(int[]n,int len){
		qSort(n,len,0,len-1);
	}
	public static void qSort(int[]n,int len,int start,int end){
		int pos;
		if(start<end){
			//返回轴位置
			pos = partition(n, start, end);
			//递归排序两部分
			qSort(n,len,start,pos-1);
			qSort(n,len,pos+1,end);
		}
	}
	/**
	 * 选定一个轴，将序列分成两部分，前部分均比轴小，后部分均比轴大
	 * 返
	 * @param n
	 * @param len
	 * @return 最终轴的位置
	 */
	public static int partition(int[]n,int start,int end){
		int pos = start;//选取n[start]为轴的值
		while(start<end){
			while(start<end && n[pos]<=n[end]){
				end--;
			}
			if(start<end){
				swap(n,end,pos);
				pos = end;
			}
			
			while(start<end && n[pos]>=n[start]){
				start++;
			}
			if(start<end){
				swap(n,pos,start);
				pos = start;
			}
			
		}
		return pos;
	}
	
	/**
	 * 将根节点为head的子树调节为大根堆
	 * @param tree
	 * @param head
	 * @param upper
	 */
	public static void heapAdject(int[]tree,int head,int upper){
		int child = 2*head;
		int target = head;
		while(child<upper){
			if(child+1<upper && tree[child+1]>tree[child]){
				child = child+1;
			}
			if(tree[target]>=tree[child]){
				break;
			}else{
				int tmp = tree[target];
				tree[target] = tree[child];
				tree[child] = tmp;
				target = child;
				child = 2*child;
			}
		}
	}
	/**
	 * 堆排序,时间复杂度nlogn 空间复杂度1，不稳定
	 * @param n
	 */
	public static void heapSort(int[]n){
		//将数组n调节为一个大根堆
		for (int i = (n.length-1)/2; i >0; i--) {
			heapAdject(n,i,n.length);
		}
		for (int i = n.length; i >1; i--) {
			swap(n,1,i-1);
			heapAdject(n, 1,i-1);
		}
	}
	/**
	 * 交换函数
	 * @param n
	 * @param i
	 * @param j
	 */
	public static void swap(int[]n,int i,int j){
		int tmp = n[i];
		n[i] = n[j];
		n[j] = tmp;
	}
	public static void main(String[] args) {
		int[]array = {0,18,67,48,15,89,3,60,95};
		//bubbleSort selectSort insertSort shellSort mergerSort quickSort
		//70,24,300,246,573,24,8434,2457,24,8464,234,75,23,7,24
		heapSort(array);
		//int k = partition(array,0,array.length-1);
		for(int i:array){
			System.out.print(i+" ");
		}
		//System.out.println("key="+k);
	}
	
}
