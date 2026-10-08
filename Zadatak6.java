
public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static int max(int a,int b,int c) {
			
			
			int najveci = a + b;
			if (a + c > najveci) {
				najveci = a + c;
			}else
			if (b + c > najveci) {
				najveci = b + c;
			}
			return najveci;
	}

}
