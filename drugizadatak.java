import java.util.Scanner;
public class drugizadatak {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,x3,x4,y1,y2,y3,y4;
		boolean prekriveno;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Uensi x1");
			x1 = sc.nextInt();
			System.out.println("Uensi x1");
			x2 = sc.nextInt();
			System.out.println("Uensi x1");
			x3 = sc.nextInt();
			System.out.println("Uensi x1");
			x4 = sc.nextInt();
			System.out.println("Uensi x1");
			y1 = sc.nextInt();
			System.out.println("Uensi x1");
			y2 = sc.nextInt();
			System.out.println("Uensi x1");
			y3 = sc.nextInt();
			System.out.println("Uensi x1");
			y4 = sc.nextInt();
		}
		if (x1<=x3 & x2 >= x4 & y1 <=y3 & y2 >= y4) {
			return true;
		}else {
			return false;
		}
		

	}

}
