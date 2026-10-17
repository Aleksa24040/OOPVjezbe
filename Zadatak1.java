import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi recenicu: ");
		String recenica = sc.nextLine();
		
		String[] rijeci = recenica.trim().split("\\s+");
		
		if(recenica.trim().isEmpty()) {
			System.out.println("Broj rijeci: 0");
		}else {
			System.out.println("Broj rijeci:" + rijeci.length);
		}
		sc.close();
	}

}
