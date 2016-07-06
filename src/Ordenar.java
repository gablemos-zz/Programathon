import java.util.Scanner;

public class Ordenar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantidades de valores: ");
		
		int n = s.nextInt();
		
		int[] valores = new int[n];
		
		for (int i = 0; i< valores.length; i++){
			valores[i] = s.nextInt();
		}
		
		ordenar(valores, n);
		System.out.println(valores);
		s.close();
	}
	static int ordenar(int[] A, int n){
		if(A.length == 1)
			return A[0];
		int x= A.length;
		
		return 0;
	}
}
