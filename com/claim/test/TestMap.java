package com.claim.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void sys(Object obj) {
		System.out.println(obj);
		System.out.println("new branch test for git release_branch");

	}

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, 3);
		m.put(2, 4);
		m.put(4, 1);
		System.out.println(123);
		Set set = m.keySet();
		Iterator it = set.iterator();
		//m.remove(1);
		//m.clear();
		sys(m.isEmpty());
		System.out.println("m.size:"+m.size());
		while (it.hasNext()) {
			sys(it.next());
		}
	}
}
