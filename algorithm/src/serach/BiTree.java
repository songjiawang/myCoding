package serach;

import java.util.Scanner;

/**
 * 二叉排序树（2查查找树）：任何右子树<子树根<左子树
 * 
 * @author purple
 *
 */
public class BiTree {
	public int val;
	public BiTree leftNode;
	public BiTree rightNode;
	
	//删除BST
	public static boolean deleteBST(BiTree head,BiTree pre,int n){
		if(head==null)return false;
		
		if(head.val==n){
			return delete(head,pre);
		}else if(head.val>n){
			return deleteBST(head.leftNode,head,n);
		}else{
			return deleteBST(head.rightNode,head,n);
		}
	}
	//删除BST的某个节点
	public static boolean delete(BiTree head,BiTree pre) {
		if(head.leftNode==null){
			if(pre.leftNode==head){
				pre.leftNode = head.rightNode;
			}else if(pre.rightNode==head){
				pre.rightNode = head.rightNode;
			}else if(pre==head){
				head.val = head.rightNode.val;
				head.leftNode = head.rightNode.leftNode;
				head.rightNode = head.rightNode.rightNode;
				//head = head.rightNode;
			}
		}else if(head.rightNode==null){
			if(pre.leftNode==head){
				pre.leftNode =head.leftNode;
			}else if(pre.rightNode==head){
				pre.rightNode = head.leftNode;
			}else if(pre==head){
				head.val = head.leftNode.val;
				head.rightNode = head.leftNode.rightNode;
				head.leftNode = head.leftNode.leftNode;
			}
		}else{
			BiTree  tmp = head.leftNode;
			pre = head;
			while(tmp.rightNode!=null){
				pre = tmp;
				tmp = tmp.rightNode;
			}			
			head.val = tmp.val;
			pre.rightNode = tmp.leftNode;
			
			
		}
		return true;
		
		// TODO Auto-generated method stub
		
	}
	//中序遍历BST
	public static void train(BiTree head){
		if(head!=null){
			train(head.leftNode);
			System.out.print(head.val+" ");
			train(head.rightNode);
		}
	}
	//查找
	public static boolean searchBST(int n,BiTree head){
		while(head!=null){
			if(head.val>n){
				head = head.leftNode;
			}else if(head.val==n){
				return true;
			}else{
				head = head.rightNode;
			}
		}		
		return false;
	}
	//插入二叉查找树
	public static BiTree builderBiTree(BiTree head,int n){
		BiTree res = null;
		if(head==null){
			res = new BiTree(n);
			return res;
		}
		res = head;
		BiTree node = new BiTree(n);
		while(true){
			if(head.val>n){
				if(head.leftNode!=null){
					head = head.leftNode;
				}else{
					head.leftNode = node;
					return res;
				}
			}else{
				if(head.rightNode!=null){
					head = head.rightNode;
				}else{
					head.rightNode = node;
					return res;
				}
			}
		}	
		
		
	}
	public BiTree(int val) {
		this.val = val;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int[] n = {3,5245,242,56,4526,5731,5,672,345,245};
		BiTree bst =null;
		for(int i:n){
			bst = BiTree.builderBiTree(bst, i);
		}
		BiTree.train(bst);
		deleteBST(bst, bst, 3);
		System.out.println("\n");
		BiTree.train(bst);
		
	}
}

	