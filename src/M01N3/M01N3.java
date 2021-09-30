package M01N3;

public class M01N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int i = 0; i < arr.length/2; i++) {
			int aux = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = aux;
		}

		for (int t: arr) {
			System.out.println(t);
		}
		
	}

}
