package listCollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();

		System.out.println(a); // arraylist is blank

		a.add("Nayan");

		System.out.println(a); // now array has 1 element

		a.removeAll(a); // now array is blank

		System.out.println(a);

		a.add("Nayan");
		a.add("Roop");
		a.add("Mahi");
		a.add("Roop"); // adding duplicate element
		a.add(3, "elemnt 3 aded");
		System.out.println(a);

		System.out.println(a.contains("Roopa")); // it gives a boolean result

		a.add(0, "Nayan0"); // adding the element at the given index

		System.out.println(a); // output: [Nayan0, Nayan, Roop, Mahi, Roop]
		
		System.out.println(a.remove("Nayan1")); // it gived boolean result if given element not present to delete

		System.out.println(a); // output still: [Nayan0, Nayan, Roop, Mahi, Roop]

		
		System.out.println(a.indexOf("Mahi")); // if element not present it gives -1
		System.out.println(a.isEmpty());
		System.out.println(a.size()); //gives the list size
		System.out.println(a.contains("Mahi"));// it gived boolean result
		
		a.add("Liza");
		a.add("Anshu");
		a.add("Nitin");
		
		System.out.println(a); // it will print the complete list
		
		
		Iterator<String> itl = a.iterator();
	while(itl.hasNext()) {
		System.out.println(itl.next());
	}
	}

}






/*
 * Collections :
Type 1 List
A list is a sequenced collection of duplicate/unique both elements..
It may contain duplicate elements.
Below 3 classes implements List Interface:
- ArrayList
- LinkedList
- Vector

--------------------------------------
ArrayList - Described below 
It is a java util package’s class. 
it has a dynamic size unlike a normal array..
a.add(); You can add value to any index at any time. By pushing down other if any.
a.remove(); to remove any element.
a.get(2); find what is at the 2nd index.0-1-2
a.contains(“nayan”); to find and print boolean(true/false) results after checking the list.


 * */
