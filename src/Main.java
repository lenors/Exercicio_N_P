import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		if(N < 0){
			System.out.println("Niggativo");
		}else{
			System.out.println("Positivo");
		}

		System.out.println(N);

		sc.close();
	}
}