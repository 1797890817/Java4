package com.ddb.javacore.branch;

import java.util.Scanner;

public class BranchIfDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个分数：");
		int score = input.nextInt();
/*
		// 单分支if
		if (score == 100) {
			System.out.println("奖励你一个记事本！");
		}

		// 双分支
		if (score >= 60) {
			System.out.println("恭喜你，考试通过！");
		} else {
			System.out.println("考试不及格，请补考！");
		}

		if (score >= 90) {
			System.out.println("非常好！");
		}
		
		if (score >= 80) {
			System.out.println("良好！");
		}
		
		// 多分支
		if (score >= 90) {
			System.out.println("非常好！");
		} else if (score >= 80) {
			System.out.println("良好！");
		} else if (score >= 70) {
			System.out.println("很好！");
		} else if (score >= 60) {
			System.out.println("好！");
		} else if (score == 60) {
			System.out.println("及格！");
		} else if (score < 60) {
			System.out.println("不及格！");
		}
*/
		// switch
		switch (score) {
		case 90:
			System.out.println("非常好！");
			break;
		case 80:
			System.out.println("良好！");
			break;
		case 70:
			System.out.println("很好！");
			break;
		case 60:
			System.out.println("好！");
			break;
		default:
			System.out.println("不及格！");
			break;
		}

	}

}
