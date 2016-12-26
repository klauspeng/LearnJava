package com.liupeng.list;

import java.util.ArrayList;
import java.util.Vector;

/*
 * 集合 可重复
 */

public class ListDemo01 {
	public static void main(String[] args) {
//		arrayListTest();
		vectorTest();
	}

	public static void arrayListTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");// list可重复
		System.out.println(list);// a,b,b

		list.remove(0);
		System.out.println("-------删除之后-------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 判断集合是否为空
		System.out.println("集合是否为空" + list.isEmpty());
		System.out.println("判断a是否存在集合中" + list.indexOf("a"));
	}
	public static void vectorTest() {
		Vector<String> vector = new Vector<>();
		vector.add("c");
		vector.add("d");
		System.out.println(vector);
	}
	
	/*区别
	 * 
	 * ArrayList 异步，性能高 非线程安全
	 * Vector    同步，性能低 线程安全
	 * 
	 * 
	 */
}
