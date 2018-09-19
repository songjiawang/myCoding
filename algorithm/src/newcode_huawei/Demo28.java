package newcode_huawei;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ËØÊı°éÂÂ
 * @author purple
 *
 */
public class Demo28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int num = sc.nextInt();
			int count = 0;
			ArrayList<Integer>list1 = new ArrayList();
			ArrayList<Integer>list2 = new ArrayList();
			
			while(num-->0){
				int tmp = sc.nextInt();
				if(tmp%2==0)list2.add(tmp);
				else list1.add(tmp);
			}
			int []flag = new int[list2.size()];
			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					if(isSuNum(list1.get(i)+list2.get(j))){
						if(flag[j]==0){
							flag[j]=i+1;break;
						}else{
							for (int k = 0; k < list2.size(); k++) {
								if(isSuNum(list1.get(flag[j]-1)+list2.get(k)) && flag[k]==0){
									flag[k] = flag[j];
									flag[j] = i+1;
									break;
								}
							}
						}
					}
				}
			}
			for(int i:flag){
				if(i!=0)count++;
			}
			System.out.println(count);
		}
	}
	static boolean isSuNum(int num){
		for (int i = 2; i*i <=num; i++) {
			if(num%i==0)return false;
		}
		return true;
	}
	
}
