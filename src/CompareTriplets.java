import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


public class CompareTriplets {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();

	}

	static List<Integer> compareTripletes(List<Integer> a, List<Integer> b) {
		List<Integer> hasil = new ArrayList<>();
		hasil.add(0,0);
		hasil.add(1,0);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				int x = hasil.get(0);
				x++;
				hasil.set(0, x);
			}
			if (a.get(i) < b.get(i)) {
				int x = hasil.get(0);
				x++;
				hasil.set(0, x);
			}
		}
		return hasil;
	}
	
	static void plusMinus(int[] array) {
		double a = 0, b = 0, c =0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				a++;
			} else if(array[i]<0) {
				b++;
			}else {
				c++;
			}
		}
		System.out.println(a/array.length);
		System.out.println(b/array.length);
		System.out.println(c/array.length);
	}
	
	static void stairCase(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j>=n-1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			
		}
		System.out.println();
	}
	
	static void miniMaxSum (int[] arr) {
		Arrays.sort(arr);
		long min = 0, max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
			max += arr[i + 1];
		}
		System.out.println(min + " " + max);
	}

}
