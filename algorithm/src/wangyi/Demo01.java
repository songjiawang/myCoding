package wangyi;

import java.util.Vector;

public class Demo01 {
	
	public static int f(int n, int m) {
        n = n % m;
        Vector v = new Vector();
        for (;;) {         
            v.add(n);
            n *= 10;
            n = n % m;
            if (n == 0)
                return 0;
            if (v.indexOf(n) >= 0)
                return v.size() - v.indexOf(n);
        }
    }
	
	public static int f2(int n,int m){
		int len = 0;
		int shang = 0;
		shang = n/m;
		if(shang/10!=0){
			len++;
			shang = shang/10;
		}
		return len;
	}
	public static void main(String[] args) {
		System.out.println(f(32,2));
		
	}
}
