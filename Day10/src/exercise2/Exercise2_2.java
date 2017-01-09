package exercise2;

public class Exercise2_2 {
	
	public static void main(String[] args){
		
		System.out.println(fib(8));
        System.out.println(fibTwo(8));

    }
	
		public static int fib(int n) {
			if ((n == 1) || (n == 2)) {
			
			return 1;
		
			} else {
		
				int result = fib(n-1) + fib(n-2); // method calls itself
				return result;
		
			}
		}
		
		
		public static int fibTwo(int n) {
            int x, y, z;

            if (n == 0) {
                return 0;

            } else {
                x = 1;
                y = 1;
                for (int i = 3; i <= n; i++) {
                    z = x + y;
                    x = y;
                    y = z;
                }
                return y;

            }
        }


}
