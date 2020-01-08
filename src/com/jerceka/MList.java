package com.jerceka;

public class MList {
	private List b = null;
	public void print() {
		List i = b;
		while(i != null) {
			System.out.print(i.a);
			i = i.list;
		}
	}
	public int number() {
		List i = b;
		int c = 0;
		while(i != null) {
			i = i.list;
			c++;
		}
			return c;
	}
	public void add(char v,int d) {
		List newNode = new List(v);
		if(d==0) {
			newNode.list = b;
			b = newNode;
			
		}else if(d<0||d>number()){
			System.out.println("No");
		}else {
				List i = b;
				for(int count=0;count<d-1;count++) {
					i = i.list;
				}
				newNode.list = i.list;
				i.list = newNode;
			}
	}
	public void remove(int index) {
		if(index==0) {
			b = b.list;
		}else {
			List i = b;
			for(int count=0;count<index-1;count++) {
				i = i.list;
			}
			List j = i.list;
			i.list = j.list;
		}
	}
}
