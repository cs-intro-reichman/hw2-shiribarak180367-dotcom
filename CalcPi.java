// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double num = Double.parseDouble(args[0]);
		double piJava = Math.PI ;
		double sign = 1.0;
		double term = 0.0;
        for (int i = 0; i < num; i++) {
			term += sign * (1.0 / (2 * i + 1));
			sign = -1.0 * sign;
		}

		
		double result = term * 4.0;
	
		System.out.println("pi acording to Java: " + piJava);
		System.out.println("pi, approximated:    " + result );

		


	}
}
