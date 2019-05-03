package day01;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		System.out.println(simpleArraySum(new int[] {1,2,3,4,10,11}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4,15,21,22,25}));
		System.out.println(simpleArraySum(new int[] {1,2,3,4}));
		int jml1=simpleArraySum(new int[] {5555,2398,1234});
		System.out.println(jml1);
		System.out.println(testCobaCoba(new int[] {13,5,2}));
		

	}
	
	static int simpleArraySum(int[] ar) {
		int hasil = 0;
		for (int i = 0; i < ar.length; i++) {
			hasil+=ar[i];
		}
        return hasil;

    }
	
	static int testCobaCoba(int[] cr) {
		int hasil = 0;
		for (int i = 0; i < cr.length; i++) {
			hasil+=cr[i];
		}
		return hasil;
	}

}
