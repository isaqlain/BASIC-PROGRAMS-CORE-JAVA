package P7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ListEx {

	public static void main(String[] args) {
		String[] items = { "sword", "arc", "wand", "hammer" };
		List<String> itemList = new ArrayList<String>();
		for (String it : items)
			itemList.add(it);

		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(99);
		values.add(77);
		values.add(2);
		values.add(88);

		values.add(2, 55);
		values.remove(3);

		Collections.sort(values); // Sorting the elements present in the list
		values.forEach(System.out::println); // Stream API .. Lambda Expression
		System.out.println("No of elements present in the List " + values.size()); // No of Elements present in the list
	}
}
