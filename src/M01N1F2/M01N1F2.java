package M01N1F2;

public class M01N1F2 {
	public static void main(String[] args) {
		// calcul anys de traspas desde 1948 a 1971
		// modificat perque 1948 ara es una variable
		/* Any de trasp�s = m�ltiple de 4.
		   Excepci�: Si �s m�ltiple de 100, tamb� ho ha de ser de 400.
		   Condici�:
		   - �s m�ltiple de 4 i no ho �s de 100.
		   - �s m�ltiple de 100 i de 400.
		 */
		
			final int a = 1948;
			int contador=0;
			
			for(int b=a; b<=1971;b++) {
				if(((b % 4 ==0) &&(b %100 != 0))||(b%400==0)) {
					
					contador++;
				}
			}
			System.out.println ("Els anys de traspas son "+contador);
			
		}
	
}
