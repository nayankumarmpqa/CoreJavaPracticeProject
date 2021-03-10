package setCollectionConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs);

		hs.add("Indai");
		hs.add("UK");
		hs.add("Nepal");

		HashSet<String> hs2 = new HashSet<String>();
		System.out.println("hs2 is " + hs2);

		hs2.add("2Indai");
		hs2.add("2UK");
		hs2.add("2Nepal");
		hs2.add(null);
		hs2.add(null);
		System.out.println("hhhhh0 " + hs2);

		System.out.println(hs.addAll(hs2)); // here I am adding 2 hashsets

		System.out.println(hs);

		System.out.println(hs.add("Indai"));

		System.out.println(hs.contains("UK"));

		hs.add("Indai2");
		hs.add("UK2");
		hs.add("Nepal2");
		// hs.add(3, "new_elemt_at_index3"); // in hashset we can not add
		// new_elemt_at_index3
		System.out.println(hs);

		Iterator<String> i = hs.iterator();

		System.out.println(i.hasNext());
		// System.out.println(i.next()+"-----");

		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}


/*
 * Collection Type  2 Set
A set is a collection of items that can NOT have duplicate elements.
No guarantee for the order of iteration. It has random order.
Below 3 classes implements Set Interface:
-HashSet
-LinkedHashSet
-TreeHashSet
-----------------------
HashSet: described below:

It is a java util package’s class. 
it has a dynamic size unlike a normal array..
It can NOT have or add duplicate elements.
hs.add(); You can add new elements.
hs.add(3, "new_elemt_at_index3"); You can NOT add value to any index at any time
hs.remove(); to remove any element.
hs.get(2); // hashset does not have this method
hs.contains(“uk”); to find and print boolean(true/false) results after checking the list.
It has the Iterator interface and method to use.

*/
