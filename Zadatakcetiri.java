import java.util.Scanner;
public class Zadatakcetiri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi tekst: ");
		String tekst = sc.nextLine();
		
		for (int i = 0; i < tekst.length() -1 ; i++) {
			if (tekst.charAt(i) == tekst.charAt(i + 1)) {
				System.out.println("Ponovljeno slovo je :" + tekst.charAt(i));
			}
		}
		sc.close();
	}

}
