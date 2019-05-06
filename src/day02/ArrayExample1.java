package day02;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5};
		System.out.println(array[0]);
		System.out.println(array[4]);
		int hasil = 0;
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
			hasil=hasil+array[a];
		}
	}

}
