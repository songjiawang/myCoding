package newcode_huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author purple
 *
 */
public class Demo16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []str = sc.nextLine().split(" ");
		int MONEY = Integer.parseInt(str[0]);
		int NumOfThings = Integer.parseInt(str[1]) ;
		ArrayList<Thing> list = new ArrayList();
		int i = 1;
		int SumPrize = 0;
		int MaxSum = 0;
		Set<Integer>set = new HashSet();
		while(NumOfThings-->0){
			String s[] = sc.nextLine().split(" ");
		f	list.add(new Thing(i,Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2])));			
		}
		Collections.sort(list);
		for(Thing t:list){
			if(set.contains(t.no))continue;
			else{
				if(t.k==0){
					if(t.prize+SumPrize<MONEY){
						set.add(t.no);
						MaxSum = MaxSum+t.pw;
						SumPrize = SumPrize+t.prize;
					}
					
				}else{
					Thing tmp = list.get(t.k-1);
					if(!set.contains(tmp.no)){
						if(t.prize+tmp.prize+SumPrize<MONEY){
							set.add(t.no);
							set.add(tmp.no);
							MaxSum = MaxSum+t.pw+tmp.pw;
							SumPrize = t.prize+tmp.prize+SumPrize;
						}
					}else{
						set.add(t.no);
						MaxSum = MaxSum+t.pw;
						SumPrize = SumPrize+t.prize;
					}
				}							
			}
		}
		System.out.println(MaxSum);
	}

}
class Thing implements Comparable<Thing>{
	int no;
	int prize;
	int k;
	int weight ;
	int wp;
	int pw;
	public Thing(int no,int prize,int weight,int k) {
		this.no = no;
		this.prize = prize;
		this.k =k;
		this.weight = weight;
		this.wp = weight/prize;
		this.pw = prize*weight;
		
	}
	@Override
	public int compareTo(Thing o) {
		// TODO Auto-generated method stub
		if(o.wp<wp)return 1;
		else if(o.wp>wp)return -1;
		else return 0;
		
	}
}