package mapCollectionConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println(hm); // no value output: {}

		hm.put(01, "kvalue1");
		hm.put(02, "kvalue2");
		hm.put(03, "kvalue3");
		hm.put(04, "kvalue4");
		hm.put(06, "kvalue6");
		hm.put(05, "kvalue5");
		hm.put(05, "kvalue5");// it will not put duplicate values

		System.out.println(hm.get(3));// this will print value at key num 3.

		System.out.println(hm + "-----"); // output: {1=kvalue1, 2=kvalue2, 3=kvalue3, 4=kvalue4,5=kvalue5,6=kvalue6}
		System.out.println(hm.remove(05)); // output: will give the value at mentioned key
		System.out.println(hm.remove(06));
		System.out.println(hm); // output: {1=kvalue1, 2=kvalue2, 3=kvalue3, 4=kvalue4,}

		Set hmnewset = hm.entrySet();

		Iterator ithmset = hmnewset.iterator();
		while (ithmset.hasNext()) {

			Map.Entry me = (Map.Entry) ithmset.next();
			System.out.println("Key is " + me.getKey() + " & Value is " + me.getValue());
			// OR we can print separatly
			// System.out.println(me.getValue());
			// System.out.println(me.getKey());

		}

	}

}


/*
 * Collection Type 3 Map
A set is a collection of items that can NOT have duplicate elements.
No guarantee for the order of iteration
Below 3 classes implements Map Interface:
- HashMap
- LinkedHashMap
- TreeMap
---------------------------------------
HashMap: Details given below
 
It is a java util package’s class. 
it has a dynamic size unlike a normal array..
It can NOT have or puts duplicate elements.
hs.put(key,value); You can add new elements.however, You can NOT add value to any index at any time
hm.remove(03); to remove any key value pair at key as 3.
hm.get(3); // this will print value at key num 3.
hs.contains(“uk”); //No such method
It has the Iterator interface and method to use.

 * */
 