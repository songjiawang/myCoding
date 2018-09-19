package newcode_huawei;
/**
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，
 * W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String [] str = sc.nextLine().split(";");
		int [] index ={0,0};
		for(String s:str){
			if(isTrueAct(s)){
				char c = s.charAt(0);
				int n = Integer.parseInt(s.substring(1, s.length()));
				switch(c){
				case 'S':index[1] = index[1]-n;break;
				case 'W':index[1] = index[1]+n;break;
				case 'A':index[0] = index[0]-n;break;
				case 'D':index[0] = index[0]+n;break;
				default: break;
				}
			}
		}
		System.out.println(index[0]+","+index[1]);
		}
	}
	public static boolean isTrueAct(String str){
		//if(str.length()==0)return false;
		String regEx="^[WSAD][0-9]*[0-9]$";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}
