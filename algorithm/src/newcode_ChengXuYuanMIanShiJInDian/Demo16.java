package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;

/**
 * Ë«Õ»ÅÅÐò
 * @author purple
 *
 */
public class Demo16 {
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
		// write code here
		int top = 0;
		ArrayList<Integer> res = new ArrayList<>();
		while (top < numbers.length) {
			if (res.size() == 0 || numbers[top]>res.get(0)) {
				res.add(0, numbers[top]);
				top++;
			} else {
				int tmp = numbers[top];
				top++;
				while (!res.isEmpty() && res.get(0) > tmp) {
					top--;
					numbers[top] = res.remove(0);
				}
				res.add(0, tmp);
			}
		}

		return res;
	}
}
