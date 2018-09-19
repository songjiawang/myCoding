package newcode_jianzhiOffer;
/**
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,
 * 决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 * “So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。
 * 为了方便起见,你可以认为大小王是0。
 * @author purple
 *
 */
public class Demo56 {
	public static boolean isContinuous(int [] numbers){
		if(numbers.length!=5)return false;
		
		//*****直接选择排序排序
		int min = 0;//最小元素索引
		for (int i = 0; i < numbers.length-1; i++) {
			min = i;
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j]<numbers[min]) min = j;
			}
			if(min!=i){
				int tmp = numbers[i];
				numbers[i] = numbers[min];
				numbers[min]=tmp;
			}
		}		
		//****end
		
		for(int i:numbers){
			System.out.print(i+" ");
		}
		int count=0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==0){count++;continue;}		
		}
		System.out.println(count);
		int tmp = numbers[count];
		for (int i = count+1; i < numbers.length; i++) {
			if(numbers[i]>tmp){
				if(numbers[i]-tmp==1){
					tmp=numbers[i];}
				else{
					if(numbers[i]-tmp-1<=count){
						count = count-(numbers[i]-tmp-1);
						tmp = tmp=numbers[i];
					}else{
						return false;
					}
				}
			}else{
				return false;
			}
		}
		return true;
		
		
    }
	public static void main(String[] args) {
		int[]a = {1,3,0,7,0};
		System.out.println(isContinuous(a));
	}
}
