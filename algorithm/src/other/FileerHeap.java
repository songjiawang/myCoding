package other;

public class FileerHeap {
	public static void HeapAdject(int[]tree,int head,int upper){
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
	
	public static void main(String[] args) {
		int[] tree = {0,18,67,48,15,89,3,60,95};
		for (int i = (tree.length-1)/2; i >0; i--) {
			HeapAdject(tree,i,tree.length);
		}
		
		for (int i = 0; i < tree.length; i++) {
			
		}
		for(int i:tree){
			System.out.print(i+" ");
		}
		
	}
}
