package newcode_jianzhiOffer;
/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * @author purple
 *
 */
public class Demo52 {
	public int StrToInt(String str) {
		if(str.length()==0)return 0;
		char [] ch = str.toCharArray();
        int sum = 0;
        int negtive = 1;
        if(ch[0]=='0')return 0;
        for (int i = 0; i < ch.length; i++) {
			if(i==0 && ch[i]=='+'){negtive=1;continue;}
			if(i==0 && ch[i]=='-'){negtive=-1;continue;}
			if(ch[i]>='0' && ch[i]<='9'){
        		sum = sum*10+(ch[i]-'0');
        	}else{
        		return 0;
        	}
		}
        	
        
        return sum*negtive;
    }
}
