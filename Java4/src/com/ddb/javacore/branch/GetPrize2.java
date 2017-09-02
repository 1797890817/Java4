package com.ddb.javacore.branch;

public class GetPrize2 {
	public static void main(String[] args) {
		int score1 = 100; // 张浩的Java成绩
		int score2 = 72; // 张浩的音乐成绩
		boolean check = (score1 > 98 && score2 > 80) || (score1 == 100 && score2 > 70);
		if (check) {
			System.out.println("老师说:不错，奖励一个MP4！");
		}
	}
}
