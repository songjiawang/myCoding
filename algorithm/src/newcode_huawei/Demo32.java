package newcode_huawei;

import java.util.Scanner;

/**
 * ×Ö·û´®µ¹ÅÅ I am a student-¡·student a am I
 * @author purple
 *
 */
public class Demo32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			char[] str  = sc.nextLine().toCharArray();
			tureString(str,0,str.length-1);
			int begin = 0;
			int end = 0;
			int i = 0;
			while(i<str.length){
				while(i<str.length&&!Character.isLetter(str[i]))i++;
				begin = i;
				while(i<str.length && Character.isLetter(str[i]))i++;
				end = i-1;
				tureString(str,begin,end);
				i++;				
			}
			StringBuffer sb = new StringBuffer();
			boolean hasSpace = false;
			for (int j = 0; j < str.length; j++) {
				if(!Character.isLetter(str[j])){
					if(hasSpace)
						hasSpace=false;
					else{
						sb.append(' ');
						hasSpace = true;
					}
				}else{
					hasSpace = false;
					sb.append(str[j]);
				}
			}
			System.out.println(sb.toString().trim());
		}
		
	}
	static void tureString(char[] str,int begin,int end){
		for (int i = 0; i <=(end-begin)/2; i++){
			char tmp = str[begin+i];
			str[begin+i] = str[end-i];
			str[end-i] = tmp;
		}
	}
}
