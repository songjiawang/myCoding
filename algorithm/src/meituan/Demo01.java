package meituan;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int[][]e = new int[n+1][n+1];
			for (int i = 0; i < n-1; i++) {
				int k = sc.nextInt();
				int j  = sc.nextInt();
				e[k][j] = 1;
				
			}
			boolean[]book = new boolean[n+1];
			int res[] = new int[1];
			res[0] = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				count(book,res,e,i,0,n,0);
			}
			System.out.println(res[0]);
		}
	}

	private static void count(boolean[] flag, int[] res, int[][] map, int index,int currentNum,int n,int currentPath) {
		// TODO Auto-generated method stub
		   int i;
		    if (n == currentNum) //�ж��Ƿ񵽴���Ŀ�����
		    {


		        if (res[0] > currentPath)  //������С·��
		        {
		        	res[0] = currentPath;
		        }
		        return;
		    }


		    for (i = 1; i <= n; ++i)  //��1�ų��е�n�ų������γ���
		    {
		        //�жϵ�ǰ����cur������i�Ƿ���·�����жϳ���i�Ƿ������߹���·����
		        if (map[currentNum][i] != 1 && flag[i] == false)
		        {
		        	flag[i] = true;//��ǳ���i�Ѿ���·����
		           
		        	count(flag,res,map,i,currentNum+1,n,currentPath+1);
		            flag[i] = false;         /// ֮ǰһ��̽����Ϻ�,ȡ���Գ��� i �ı���Ա���һ��·��ѡ�񶥵�
		           
		        }
		    }

	}
	
	
}
