import java.util.Scanner;

public class Mergesort {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantidade de valores:");
		int qtd = s.nextInt();
		
		System.out.println("Digite " + qtd + " valores:");
		int[] x = new int[qtd];
		
		for(int i = 0; i<x.length;i++){
			x[i] = s.nextInt();
		}
		
		mergesort(qtd, x);
		
		for(int i = 0; i<x.length;i++){
			System.out.print(x[i] + " "); 
		}
		s.close();		
	}
	static int[] mergesort(int n, int[] x){
		if (n == 1)
			return x;
		
		if (n == 2){
			if(x[0] > x[1]){
				int t = x[0];
				x[0] = x[1];
				x[1] = t;
			}
			return x;
		}
		
		else if( n > 2){
			
			int m = n/2;
			
			int[] a = new int[(m-1)];
			int[] b = new int[(n-m)];
			
			for(int i = 0; i<(m-1);i++){
				a[i] = x[i];
			}
			
			for(int i = m; i<(n-1);i++){
				b[i-m] = x[i];
			}
			
			mergesort(m,a);
			mergesort((n-m), b);
			
			int i,j = 0;
			i=0;
			
			for(int k = 0; k<(n-1); k++){
				
				if(a[i] <= b[i]){
					x[k] = a[i];
					i++;
				}
				
				else{
					x[k] = b[j];
					j++;
				}
				
			}
			return x;
		}
		
		return x;
	}

}
