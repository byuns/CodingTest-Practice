package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Heo");
		nameList.add("Choi");
		nameList.add("Lee");
		
		System.out.println("- ���� �� " + nameList);
		Collections.sort(nameList);
		Collections.reverse(nameList);
		
		System.out.println("- ���� �� " + nameList);
	}

}
