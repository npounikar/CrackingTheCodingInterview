package crackingthecoding.chap1;

public class RotateMatrixDifferentDimension {


	public static void main(String[] args) {

		int[][] a = new int[4][3];
		int degree = 360;

		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				a[i][j] = i;
			}
		}

		print(a);
		System.out.println("--------");

		int count = degree/90;
		for(int x = 0; x<count; x++){
			a = rotate(a);
		}
		print(a);
		
		System.out.println("--------");
		
	}
	
	//TODO HERE ONWARDS ------------------------------------------------------------------

	private static int[][] rotate(int[][] a) {

		int[][] b = new int[a.length][a.length];

		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				b[j][a.length-1-i] = a[i][j];
				System.out.println(a[i][j]);
				System.out.println("["+j+", "+(a.length-1-i)+"]"+" : "+b[j][a.length-1-i]);
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
