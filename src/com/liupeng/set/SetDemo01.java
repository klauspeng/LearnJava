package com.liupeng.set;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * set 接口
 * 不能加入重复元素，但可以排序
 * 常用子类 散列存放HashSet;有序存放TreeSet
 */

public class SetDemo01 {

	public static void main(String[] args) {
		hashSetTest();
		treeSetTest();
	}

	public static void hashSetTest() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("e");
		System.out.println(hashSet);// [d, e, b, c, a] 无序
	}

	public static void treeSetTest() {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("e");
		System.out.println(treeSet);// [a, b, c, d, e] 有序
	}
}
