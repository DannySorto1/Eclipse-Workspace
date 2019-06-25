package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {

		Map<Integer, String> BestBuy = new LinkedHashMap<>();
		BestBuy.put(122342, "PS4");
		BestBuy.put(374834, "Canon Sd1");
		BestBuy.put(123459, "IphoneX");
		BestBuy.put(129023, "Smart Tv");

		System.out.println(BestBuy);

		for (Map.Entry<Integer, String> BB : BestBuy.entrySet()) {
			System.out.println(BB.getKey() + ":" + BB.getValue());
		}
		System.out.println("///////////////////");

		Iterator<Map.Entry<Integer, String>> NewBB = BestBuy.entrySet().iterator();
		while (NewBB.hasNext()) {
			Map.Entry<Integer, String> bb = NewBB.next();
			System.out.println(bb.getKey() + "=" + bb.getValue());
		}

	}
}
