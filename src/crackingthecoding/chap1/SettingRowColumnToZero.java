package crackingthecoding.chap1;

import java.util.ArrayList;

public class SettingRowColumnToZero {

	public static void main(String[] args) {
		int[][] a = new int[4][3];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				a[i][j] = i+1;
			}
		}
		a[2][2] = 0;
		print(a);
		System.out.println("--------");
		print(setZero(a));
	}


	private static int[][] setZero(int[][] a) {
		ArrayList<Element> list = new ArrayList<Element>();
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				if(a[i][j] == 0) {
					Element e = new Element(i,j);
					list.add(e);
				}
			}
		}
		for(int m = 0; m<list.size(); m++) {
			Element e = list.get(m);
			for(int x = 0; x<a[0].length; x++) {
				a[e.i][x] = 0;
			}
			for(int y = 0; y<a.length; y++) {
				a[y][e.j] = 0;
			}
		}
		return a;
	}


	private static void print(int[][] a) {
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}
