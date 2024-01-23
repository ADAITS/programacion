public class FactorialRecursivo {

	public static int factorial(int n){
		if(n > 2){
			return n * factorial(n-1);
		}
		if(n == 0) return 1;
		return n;
	}

	public static void main(String[] args) {
		System.out.println(factorial(0) == 1);
		System.out.println(factorial(1) == 1);
		System.out.println(factorial(2) == 2);
		System.out.println(factorial(3) == 6);
		System.out.println(factorial(4) == 24);
		System.out.println(factorial(5) == 120);
		System.out.println(factorial(6) == 720);
	}
}