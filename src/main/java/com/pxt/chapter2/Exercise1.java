package com.pxt.chapter2;

/** 此类包含未初始化的变量，打印以验证Java执行了默认初始化
 * @author Pengxuetao
 * @version 1.0
 */
public class Exercise1 {
	private int i;
	private char c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 e1 = new Exercise1();
		System.out.println("i="+e1.i+"*");
		System.out.println("c="+e1.c+"*");
	}

}
