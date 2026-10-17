import java.util.Scanner;
public class Zadataktri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi tekst:");
		String tekst = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(tekst);
		String obrnuto = sb.reverse().toString();
		
		if(tekst.equalsIgnoreCase(obrnuto)) {
			System.out.println("Tekst je palindrom");
		}else {
			System.out.println("Tekst nije palindrom");
		}
		
		sc.close();
		
	}

}
