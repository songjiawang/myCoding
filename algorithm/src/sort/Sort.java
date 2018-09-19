package sort;

public class Sort {
	/**
	 * ����������
	 * ð������ʱ�临�Ӷ�O(n^2),�ռ临�Ӷ�(1),�ȶ�
	 * 
	 * @param n
	 */
	public static void bubbleSort(int[]n,int len){
		boolean flag = true;
		//ð��len-1��
		for (int i = 0; i <len; i++) {
			if(!flag)return;//�����һ��ð��û�н��н�����˵���Ѿ�����ɹ�������Ҫ����ð��
			flag = false;
			//��������ð��
			for (int j = len-2; j >=i; j--) {
				if(n[j]>n[j+1]){
					swap(n,j,j+1);
					flag=true;
				}
			}
		}
	}
	/**
	 * ����������
	 * ��ѡ������(ÿ�δ�Ϊ����������б�������С�Ľ�������������ĩβ)
	 * ʱ�临�Ӷ�O(n^2)�ռ临�Ӷ�O(1),�ȶ�
	 * @param n
	 * @param len
	 */
	public static void selectSort(int[]n,int len){
		int min=0;//������ĩβ����
		for (int i = 0; i < n.length; i++) {
			min = i;
			//����������ѡ����С��Ԫ������
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
	 * ����������
	 * ֱ�Ӳ�������
	 * ѡ����������ͷ���ݣ�����������ĩβ����������ͷ�Ƚϲ��룬��С�ڱȽ�Ԫ�أ�������ǰ���롣
	 * ʱ�临�Ӷ�O(n^2)�ռ临�Ӷ�O(1),�ȶ�
	 * @param n
	 * @param len
	 */
	public static void insertSort(int[]n ,int len){
		//������Ĭ�ϴ�1��ʼ����0��Ԫ������
		for (int i = 1; i < n.length; i++) {
			//���Ƿ��ֵ�ǰλ��(j+1)��ֵС��ǰ���λ��(j),���н�����������ǰ�Ƚϡ�
			for (int j = i-1; j>=0 && n[j+1]<n[j]; j--) {
				swap(n,j+1,j);
			}
		}
	}
	/**
	 * ����������
	 * ϣ������(��С��������)
	 * �����ĳ�����������н���ֱ�Ӳ������򡪡�����С�������������ĳ������������ֱ�Ӳ������򡪡���ֱ������Ϊ1
	 * ʱ�临�Ӷ�O(nlgn)�ռ临�Ӷ�O(1),���ȶ�
	 * @param n
	 * @param len
	 */
	public static void shellSort(int[]n ,int len){
		//dΪ����
		for (int d = len/2; d >=1; d--) {
			
			//��������������н���ֱ�Ӳ�������
			for (int i = d; i < n.length; i++) {
				for (int j = i-d; j>=0 && n[j+d]<n[j]; j=j-d) {
					swap(n,j,j+d);
				}
				
			}
		}
	}
	/**
	 * ��·�չ�
	 * �����ڵ���������������кϲ���һ�������������
	 * @param n
	 * @param start
	 * @param mid
	 * @param end
	 * @return
	 */
	public static void mergeTwo(int[]n,int start,int mid,int end){
		//������ʱ�������
		int[]tmp = new int[end-start+1];
		int i = start,j = mid+1,k=0;
		//�鲢������
		while(i<=mid && j<=end){
			tmp[k++] = n[i]>n[j]?n[j++]:n[i++];
		}
		//��ʣ�ಿ�ֲ����tmp��
		for (int k2 = i; k2 <=mid; k2++) {
			tmp[k++]=n[k2];
		}
		for (int k2 = j; k2 <=end; k2++) {
			tmp[k++]=n[k2];
		}
		
		//�鲢��ɺ�tmp�����ݸ��ƻ�Ԫ����
		for (int k2 = 0; k2 < tmp.length; k2++) {
			n[start++] = tmp[k2];
		}
		
	}
	public static void merge(int[]n,int d){
		int i=0;
		for (i = 0; i+2*d-1 < n.length; i=i+2*d) {
			mergeTwo(n,i,i+d-1,i+2*d-1);
		}
		//�������²���2*d������
		//���ʣ�����д���d������һ���룬�����鲢�����򷵻�
		if(i+d-1<n.length){
			mergeTwo(n,i,i+d-1,n.length-1);
		}
		
		//for(int i2:n){
		//	System.out.print(i2+" ");
		//}	
		//System.out.println("\n");
		
	}
	/**
	 * �鲢����
	 * ʱ�临�Ӷ�O(nlgn)�ռ临�Ӷ�O(n),�ȶ�
	 * @param n
	 * @param len
	 */
	public static void mergerSort(int[]n,int len){
		for (int i = 1; i <len; i=2*i) {
			merge(n,i);
		}
	}
	/**
	 * ����������
	 * ��������
	 * ͨ��һ���������зֳ������֣�ʹ��ǰһ���־��Ⱥ󲿷�ֵС��Ȼ��ݹ���������������
	 * ʱ�临�Ӷ�O(nlgn)�ռ临�Ӷ�O(n),���ȶ�
	 * @param n
	 */
	public static void quickSort(int[]n,int len){
		qSort(n,len,0,len-1);
	}
	public static void qSort(int[]n,int len,int start,int end){
		int pos;
		if(start<end){
			//������λ��
			pos = partition(n, start, end);
			//�ݹ�����������
			qSort(n,len,start,pos-1);
			qSort(n,len,pos+1,end);
		}
	}
	/**
	 * ѡ��һ���ᣬ�����зֳ������֣�ǰ���־�����С���󲿷־������
	 * ��
	 * @param n
	 * @param len
	 * @return �������λ��
	 */
	public static int partition(int[]n,int start,int end){
		int pos = start;//ѡȡn[start]Ϊ���ֵ
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
	 * �����ڵ�Ϊhead����������Ϊ�����
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
	 * ������,ʱ�临�Ӷ�nlogn �ռ临�Ӷ�1�����ȶ�
	 * @param n
	 */
	public static void heapSort(int[]n){
		//������n����Ϊһ�������
		for (int i = (n.length-1)/2; i >0; i--) {
			heapAdject(n,i,n.length);
		}
		for (int i = n.length; i >1; i--) {
			swap(n,1,i-1);
			heapAdject(n, 1,i-1);
		}
	}
	/**
	 * ��������
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
