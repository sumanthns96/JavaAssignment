import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Assignment18 {

	public static void main(String[] args) {
		int[] array = { 12, 34, 56, 234, 111, 11, 22, 45 };
		int[] reverseArray = new int[array.length];
		int[] resultArray = new int[array.length];
		int j = 0;
		int sum = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			while (num != 0) {
				sum += num % 10;
				num = num / 10;
			}
			hmap.put(i, sum);
			sum = 0;
		}
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			Integer num = (Integer) (mentry.getValue());
			reverseArray[j++] = num;
		}
		Arrays.sort(reverseArray);
		for (int i = 0; i < reverseArray.length; i++) {
			Set set1 = hmap.entrySet();
			Iterator iterator1 = set.iterator();
			while(iterator1.hasNext()) {
				Map.Entry mentry1 = (Map.Entry) iterator1.next();
				if (reverseArray[i] == (int) (mentry1.getValue())) {
					resultArray[i] = array[(int) mentry1.getKey()];	
					
				}
			}
		}
		for (int i = 0; i < resultArray.length; i++)
			System.out.println(resultArray[i]);

	}

}
