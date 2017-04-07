package com.ddb.javacore.generic;

public class Point<T> {
	//public class Point<T extends Number> {
	private T x;
	private T y;

	public Point() {
	}

	public Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public void showInfo() {
		System.out.println("x=" + x + ", y=" + y);
	}

}
