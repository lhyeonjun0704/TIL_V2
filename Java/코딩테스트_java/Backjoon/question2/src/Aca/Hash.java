package Aca;

import java.util.HashMap;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		System.out.println(hm1.size());
		
		hm1.put(new Integer(100), "A");
		hm1.put(new Integer(300), "B");
		hm1.put(new Integer(200), "C");
		
		System.out.println(hm1.get(100));
		
	}

}

// HashTable, LinkedHashMap, SortedMap, Treemap

// [hashmap]
// key, value ���, hasing ������� ���� �˻�
// hashing : key�� ����Ͽ� has function-hash code
// 