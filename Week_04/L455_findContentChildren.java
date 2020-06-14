package Week4;

import java.util.Arrays;

public class L455_findContentChildren {
	public static void main(String[] args) {
		int[] g = { 1, 2, 3 };
		int[] s = { 1, 1 };
		int ret = new L455_findContentChildren().findContentChildren(g, s);
		System.out.println(ret);
	}

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0, j = 0, num = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				num++;
				i++;
				j++;
			} else {
				j++;
			}
		}
		return num;
	}

}
