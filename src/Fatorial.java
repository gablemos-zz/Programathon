import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor");
						
		int f = fatorialRecursivo(s.nextInt());
		
		System.out.println("O fatorial é " + f);
		
		s.close();
	}
	
	static int fatorialRecursivo(int num){
		if (num == 0)
			return 1;
		
		return num*fatorialRecursivo(num-1);
	}
}
