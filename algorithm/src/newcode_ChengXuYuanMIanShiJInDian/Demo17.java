package newcode_ChengXuYuanMIanShiJInDian;

import java.util.ArrayList;

/**
 * Ã¨¹·ÊÕÑøËù
 * @author purple
 *
 */
public class Demo17 {
	public ArrayList<Integer> asylum(int[][] ope) {
		// write code here
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> allList = new ArrayList<>();
		ArrayList<Integer> catList = new ArrayList<>();
		ArrayList<Integer> dogList = new ArrayList<>();
		for (int[] tmp : ope) {
			if (tmp[0] == 1) {
				if (tmp[1] > 0) {
					dogList.add(tmp[1]);
					allList.add(tmp[1]);
				} else if (tmp[1] < 0) {
					allList.add(tmp[1]);
					catList.add(tmp[1]);
				}
			} else if (tmp[0] == 2) {
				if (tmp[1] == 0) {
					if (dogList.size() <= 0 && catList.size() <= 0) {
					} else {
						if (dogList.size() <= 0) {
							int index = allList.indexOf(catList.get(0));
							res.add(catList.remove(0));
							allList.remove(index);

						} else if (catList.size() <= 0) {
							int index = allList.indexOf(dogList.get(0));
							res.add(dogList.remove(0));
							allList.remove(index);
						} else {
							int o = allList.remove(0);
							res.add(o);
							if (o > 0) {
								int index = dogList.indexOf(o);
								dogList.remove(index);
							} else {
								int index = catList.indexOf(o);
								catList.remove(index);
							}
						}
					}
				} else if (tmp[1] == 1) {
					if (dogList.size() > 0) {
						int index = allList.indexOf(dogList.get(0));
						res.add(dogList.remove(0));
						allList.remove(index);
					} 
				}else if (tmp[1] == -1) {
					if (catList.size() > 0) {
						int index = allList.indexOf(catList.get(0));
						res.add(catList.remove(0));
						allList.remove(index);
					}					
				}
			}

		}
		return res;
	}
}

