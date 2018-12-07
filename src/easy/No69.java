package easy;

public class No69 {
	/*牛顿迭代法求平方根:x(n+1) = x(n)-f(x(n))/f'(x(n))
	*求根公式： x = (x+c/x)/2;c为所求数，x为根
	*
	*/
	public static int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
			n = (n+x/n)/2;
		}
        return (int)n;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(No69.mySqrt(2147395600));
		System.out.println(46340*46340);
	}

}
