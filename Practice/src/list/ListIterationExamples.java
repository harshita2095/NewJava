package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterationExamples {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Havi"); list.add("Khushi"); list.add("Mum"); list.add("Dad");
		
		//first way
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		//second way
		list.forEach(System.out::println);
	}

}
