package newcode_jianzhiOffer;
/**
 * ��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
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
