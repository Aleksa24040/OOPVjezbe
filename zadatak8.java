
public class zadatak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//racunanje koliko cifara ima neki broj
		public static int brCifara(int n) { 
			int brCifara = 0;
			
			while( n > 0) {
				brCifara += 1;
				
				n = n / 10;
			}
			return brCifara;
		
	}
		public static boolean isNarcisstic(int n) {
		
		int brCif = brCifara(n);
		int suma = 0;
		while ( n > 0) {
			int cifra = n%10;
			suma += Math.pow(cifra, brCif);
			n = n / 10;
		)
		}
			if ( n == suma) {
				return true;
			}else {
				return false;
			}
		}

}
