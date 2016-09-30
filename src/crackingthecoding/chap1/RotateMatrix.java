package crackingthecoding.chap1;

public class RotateMatrix {

	public static void main(String[] args) {

		int[][] a = new int[4][4];
		int degree = 360, degreeInPlace = 180, count = 0;

		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				a[i][j] = i;
			}
		}

		print(a);
		System.out.println("--------");

		count = degree/90;
		for(int x = 0; x<count; x++){
			a = rotate(a);
		}
		print(a);

		count = degreeInPlace/90;
		System.out.println("--------");
		for(int x = 0; x<count; x++){
			a = rotateInPlace(a);
		}
		print(a);
	}



	private static int[][] rotateInPlace(int[][] matrix) {
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				
				//save top
				int top = matrix[first][i];
				
				// left -> top
				matrix[first][i] = matrix[last-offset][first];

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top;
			}
		}

		return matrix;
	}



	private static int[][] rotate(int[][] a) {

		int[][] b = new int[a.length][a.length];

		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				b[j][a.length-1-i] = a[i][j];
			}
		}


		return b;
	}

	private static void print(int[][] a) {
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
