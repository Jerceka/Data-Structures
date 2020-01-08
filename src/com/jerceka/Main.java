package com.jerceka;

public class Main {
	public static void main(String[] args) {
		System.out.println("java");
		MList l = new MList();
		l.add('a', 0);
		l.add('b', 1);
		l.add('c', 2);
		l.add('w', 1);
		l.add('x', 0);
		l.add('z', 5);
		l.print();
		l.remove(1);
		l.remove(3);
		l.remove(2);
		l.remove(1);
		l.remove(0);
		l.remove(0);
		System.out.println("");
//		l.add('w', 1);
		l.add('t',-9);
		l.add('z',56);
		l.print();
		System.out.println(l.number());
	}
}
