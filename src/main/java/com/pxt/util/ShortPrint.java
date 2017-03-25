package com.pxt.util;

/** 简短打印工具类
 * 简化System.out.print()
 * @author Pengxuetao
 * @version 1.0
 */
public class ShortPrint {
	
	/** 向控制台打印字符串
	 * @param s,接收准备打印的字符串
	 * @return 没有返回值
	 */
	public static void print(String s) {
		System.out.print(s);
	}
	
	/** 向控制台打印字符串并换行
	 * @param s,接收准备打印的字符串
	 * @return 没有返回值
	 */
	public static void println(String s) {
		System.out.println(s);
	}
}
