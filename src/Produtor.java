import java.util.Scanner;
public class Produtor {
	public static void main(String[] args) {
		int meses[] = new int[12];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====DEMANDAS DO M�S=====");
		for(int i=0; i<12; i++) {
			System.out.println("M�s "+(i+1)+":");
			meses[i] = sc.nextInt();
		}
		
	}
}