package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Demo10 {
	public static boolean isMatch(String s, String p) {
		if(s.length()==0)return false;
		if(p.length()==0)return false;
		char[] str = s.toCharArray();
		char[] mt = p.toCharArray();
		
		boolean xing = false;
		List<Statue> list = new ArrayList<Statue>();

		for (int i = mt.length - 1; i >=0; i--) {
			if (mt[i] == '*') {
				xing = true;
				continue;
			}
			Statue st = null;
			if (xing) {
				xing = false;
				st = new Statue(true, mt[i]);
				list.add(0, st);
			} else {
				st = new Statue(false, mt[i]);
				list.add(0, st);
			}
		}
		int i = 0;
		int j = 0;
		System.out.println(list.get(0).value);
		System.out.println("ƥ�䳤" + list.size());
		while (i < str.length && j < list.size()) {
			if (str[i] == list.get(j).value || list.get(j).value == '.') {
				if (!list.get(j).Xinged) {
					System.out.println("��" + i + "���ַ�ƥ�䵽��,���ظ�");
					j++;
					i++;
				
					continue;

				} else {
					System.out.println("��" + i + "���ַ�ƥ�䵽�ˣ��ظ�");
					i++;
					continue;
				}
			} else if (str[i] != list.get(j).value && list.get(j).value != '.') {
				if (list.get(j).Xinged) {
					j++;

					continue;
				} else {
					System.out.println("��" + i + "���ַ�û��ƥ�䵽��");
					return false;
				}
			}

		}

		if (i == str.length) {
			if (j == list.size()) {
				return true;
			} else {
				for (;j < list.size(); j++) {
					
					if (!list.get(j).Xinged) {
						if(list.get(j).value==list.get(j-1).value && list.get(j-1).Xinged){
							
						}else{System.out.println("��ʣ���ƥ��");
							return false;
							}		
					}
				}
			}
		} else {
			System.out.println("��ʣ����ַ�");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isMatch("aaa", "ab*a*c*a"));
	}
}

class Statue {
	public boolean Xinged = false;
	public char value;

	public Statue(boolean xinged, char value) {
		super();
		Xinged = xinged;
		this.value = value;
	}

}
