package M01N1F3;

public class M01N01F3 {
static boolean traspas;

public static void main(String[] args) {
		int b= 2020;
		for (int i = 1948; i <= b; i += 4) {
			System.out.println(i);
		}
		
				
		if (b % 100 != 0 && b % 4 == 0 || b % 100 == 0 && b % 400 == 0) {
			traspas = true;
			String cert = "El meu any de naixement és de traspàs.";
			System.out.print(cert);
		} else {
			traspas = false;

			String fals = "El meu any de naixement no és de traspàs.";
			System.out.print(fals);
		}
		
		
		
	}

}
