package foo;

public class CalculatePI {

	// Calculating π with the Gregory-Leibniz formula
	
	private static double makePI(int iter){	
		int dummy = 0;
		double result = 4.0;
		int denom = 1;
		boolean isPlus = false;

		for(int i=0; i<iter ;i++){
			denom +=2;
			if(isPlus)
				result += (4.0/denom);
			else
				result -= (4.0/denom);
			
			isPlus = !isPlus; 
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makePI(1000000000));
		
	}

}
