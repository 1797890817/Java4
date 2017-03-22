package com.ddb.javacore.branch;

import java.util.Scanner;

import jdk.nashorn.internal.ir.debug.PrintVisitor;

public class BranchIfDemo2 {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入一个分数：");
		int score = input.nextInt();*/
		
		int country = 1;
		int privince = 2;
		if (country ==1) {
			System.out.println("你是中国人！");
			
			if(privince ==2 ){
				System.out.println("你是安徽人！");
				
			}else{
				System.out.println("你是外省人！");
			}
			
		} else {
			System.out.println("你是外国人！");
		}

		
	}

}
