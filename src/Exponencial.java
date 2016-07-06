import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");		
		int x = s.nextInt();
		
		System.out.println("Digite o exponencial(n):");
		int n = s.nextInt();
		
		int e = exponencial(x, n);
		System.out.println(x + " elevado a " + n + " = " + e);
				
		s.close();
	}
	static int exponencial(int x, int n){
		if (n == 0)
			return 1;
		
		return x*exponencial(x,n-1);
	}
}
