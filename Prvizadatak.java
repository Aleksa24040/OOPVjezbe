import java.util.Scanner;

public class Prvizadatak {
	public static int sifra(int n) {
		
		int a = n / 100;
		int b = (n / 10) % 10;
		int c = n % 10;
		
		int proizvod = a*b*c;
		int zbir = a+b+c;
		int sifra = proizvod - zbir;
		return sifra;
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.print("Unesite trocifren n=broj ");
			int broj = sc.nextInt();
			int rezultat = sifra(broj);
			System.out.println(rezultat);
		}
	
		
	}

}
