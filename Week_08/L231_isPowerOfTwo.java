package Week8;

public class L231_isPowerOfTwo {
	public static void main(String[] args) {
		int n = 1;
		boolean ret = new L231_isPowerOfTwo().isPowerOfTwo(n);
		System.out.println(ret);
	}

	public boolean isPowerOfTwo(int n) {
		return (n > 0) && ((n & (n - 1)) == 0);

	}

}
