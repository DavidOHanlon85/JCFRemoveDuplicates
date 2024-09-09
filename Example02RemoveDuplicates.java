/**
 * 
 */
package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */
public class Example02RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<Integer>();
		Collections.addAll(arrList, 2, 4, 5, 2, 3, 4, 2, 1, 2, 1, 6, 16);

		List<Integer> lnkList = new LinkedList<Integer>();
		Collections.addAll(lnkList, 3, 5, 4, 2, 3, 2, 1, 3, 4, 5);

		for (Integer i : lnkList) {
			if (arrList.contains(i)) {
				arrList.remove(i);
			}
		}

		System.out.println(arrList);

		System.out.println("Method call");

		removeDuplicates(arrList, lnkList);

	}

	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {
		originalList.removeAll(listToRemove);
		System.out.println(originalList);
	}

}
