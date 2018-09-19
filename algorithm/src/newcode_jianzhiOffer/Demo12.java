package newcode_jianzhiOffer;
/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Demo12 {
	public double Power(double base, int exponent) {
        if(exponent==0)return 1;
        if(base==0)return 0;
        double sum=1;
        if(exponent>0){
        	while(exponent!=0){
        		sum=sum*base;
        		exponent--;
        	}
        	return sum;
        	
        }else{
        	while(exponent!=0){
        		sum=sum*base;
        		exponent++;
        	}
        	return 1/sum;
        }
		
	}
}
