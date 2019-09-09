package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("NY");
		arrayList.add("LA");
		arrayList.add("NJ");

		System.out.println("show my work");

		arrayList.remove(2); //remove elements

		for (String st : arrayList) {
			System.out.println(arrayList);
		}

			Iterator<String> it = arrayList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}


