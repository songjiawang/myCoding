package newcode_jianzhiOffer;
/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
 *n<=39
 */
public class Demo07 {
	 public int Fibonacci(int n) {
		 if(n==0)return 0;
		 if(n==1 || n ==2){
			 return 1;
		 }
		 else return Fibonacci(n-1)+Fibonacci(n-2);
		 
	 }
}
