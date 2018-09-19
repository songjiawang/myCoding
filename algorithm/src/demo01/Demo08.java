package demo01;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 洗牌，将牌分成两部分，然后两部分的从最底部一次插入，模拟一般洗牌的步骤
 * @author purple
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[]card = new int[13];
			int num;
			for (int i = 0; i < card.length; i++) {
				card[i] =sc.nextInt();
			}
			num =sc.nextInt();
			int n[] = new int[num];
			for (int i = 0; i < n.length; i++) {
				n[i] = sc.nextInt();
			}
			int[] newCard = card;
			for (int i = 0; i < n.length; i++) {
				 newCard = wishCard(newCard,n[i]);
			}
			for(int i:newCard){
				System.out.print(i+" ");
			}
		}
			
	}	
	
	public static int[] wishCard(int[] card, int i) {
		int newCard[] = new int[card.length];
		int j = i-1;
		int k = card.length-1;
		int index = card.length-1;
		while(k>i-1 && j>=0){
			newCard[index] = card[j];
			newCard[index-1] = card[k];
			j=j-1;
			k=k-1;
			index = index-2;
		}
		if(j>=0){
			for (; j>=0; j--) {
				newCard[index] = card[j];
				index--;
			}
		}else if(k>i-1){
			for (; k>i-1; k--) {
				newCard[index] = card[k];
				index--;
			}
		}
		return newCard;
	}
}
