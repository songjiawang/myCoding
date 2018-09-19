package newcode_ChengXuYuanMIanShiJInDian;
/**
 * 构建高度最小的查找二叉树（BST）
 * @author purple
 *
 */
public class Demo20 {
	public int buildMinimalBST(int[] vals) {
        // write code here
		return countSubBST(vals,0,vals.length-1);
    }
	public int countSubBST(int vals[],int start,int end){
		if(start>end){
			return 0;
		}
		if(start==end){
			return 1;
		}else{
			int mid = (start+end)/2;
			return 1+Math.max(countSubBST(vals,start,mid-1), countSubBST(vals,mid+1, end));
		}
	}
}
