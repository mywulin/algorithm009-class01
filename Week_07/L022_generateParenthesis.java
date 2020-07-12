package Week7;

import java.util.ArrayList;
import java.util.List;

public class L022_generateParenthesis {
	public static void main(String[] args) {
		int n = 3;
		List<String> ret = new L022_generateParenthesis().generateParenthesis(n);
	}

	List<String> ret = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		genera(0, 0, n, "");
		return ret;
	}

	private void genera(int left, int right, int n, String s) {
		if (left >= n && right >= n) {
			ret.add(s);
			return;
		}
		if (left < n) {
			genera(left + 1, right, n, s + "(");
		}
		if (right < left) {
			genera(left, right + 1, n, s + ")");
		}
	}

//	public List<String> generateParenthesis(int n) {
//		generate(0, 2 * n, "");
//		return ret;
//	}
//
//	private void generate(int level, int max, String s) {
//		if (level >= max) {
//			ret.add(s);
//			System.out.println(s);
//			return;
//		}
//
//		generate(level + 1, max, s + "(");
//		generate(level + 1, max, s + ")");
//
//	}

}
