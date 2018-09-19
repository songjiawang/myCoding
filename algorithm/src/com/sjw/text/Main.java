package com.sjw.text;
public class Main{
	public static void main(String[] args) {
		int n[] ={1,1,0,1,0,1,0,0,1,1};
		System.out.println(move(n));
	}
	public static int move(int[]n){
		int count = 0;
		int start = 0;
		int end = n.length-1;
		while(start<end){
			while(start<end&&n[start]==0)start++;
			while(start<end&&n[end]==1)end--;
			if(start<end){
				swap(n, start, end);
				count++;
				start++;
				end--;
			}
		}
		
		return count;
	}
	public static void swap(int[]n,int i,int j){
		int tmp = n[i];
		n[i] = n[j];
		n[j] = tmp;
	}
}