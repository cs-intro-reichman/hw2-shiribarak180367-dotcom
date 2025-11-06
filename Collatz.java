// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Validate arguments
		if (args.length == 0) {
			System.out.println("Usage: java Collatz <N> [v]");
			System.out.println("If 'v' is provided as second argument, prints every number in each sequence.");
			return;
		}

		int N;
		try {
			N = Integer.parseInt(args[0]);
			if (N <= 0) {
				System.out.println("Please provide a positive integer for N.");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer: " + args[0]);
			return;
		}

		boolean verbose = args.length > 1 && "v".equals(args[1]);

		for (int seed = 1; seed <= N; seed++) {
			long n = seed;
			int count = 1;

			if (verbose) {
				System.out.print( n + " ");
	
			} 
			if (n== 1){
				n = 3 * n + 1;
				count++;
				if (verbose) System.out.print( n + " ") ; 
			}

			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
				} else {
					n = 3 * n + 1;
				}
				count++;
				if (verbose) {
					System.out.print(n + " ");
				}
			}

			if (verbose) {
				System.out.println("(" + count + ")");
			}
		}
	
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
				
			
		}
	}


			
	
		




