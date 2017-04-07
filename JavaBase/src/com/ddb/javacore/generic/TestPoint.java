package com.ddb.javacore.generic;

import java.util.Date;

public class TestPoint {

	public static void main(String[] args) {
		//Point<int> point1 = new Point<int>(200, 400);	//不可以使用基本类型
		Point<Integer> point1 = new Point<Integer>(200, 400);
		point1.setX(point1.getX() + 100);
		point1.showInfo();

		Point<Double> point3 =new Point<Double>();
		point3.setX(3.6);
		point3.setY(7.2);
		point3.showInfo();
		
		Point<Date> point2 = new Point<Date>();
	/*	point2.setX(new Date(888888));
		point2.setY(new Date(999999));*/
		point2.setX(new Date(1L));
		point2.setY(new Date(1L));
		point2.showInfo();
		
		/*Point point =new Point();
		point.setX(123);
		point.setY("256");
		point.showInfo();*/
		
	}

}
