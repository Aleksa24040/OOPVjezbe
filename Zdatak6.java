import java.util.Scanner;

public class Zdatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi prvi string: ");
		String prvi = sc.nextLine();
		
		System.out.println("Unesi drugi string: ");
		String drugi = sc.nextLine();
		
		if(prvi.equalsIgnoreCase(drugi)) {
			System.out.println("Podudaraju se stringovi.");
		}else {
			System.out.println("Ne podudaraju se stringovi.");
		}
		sc.close();
	}

}
