package Week8;

public class L191_hammingWeight {
	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		int ret = new L191_hammingWeight().hammingWeight(n);
		System.out.println(ret);
	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n &= (n - 1);
		}
		return count;

	}

}
