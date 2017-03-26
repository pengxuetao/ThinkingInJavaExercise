package com.pxt.util;

import java.util.Date;
import java.util.Random;

/** 模拟扔硬币工具类
 * 模拟扔硬币的概率，正反面50%
 * @author Pengxuetao
 * @version 1.0
 */
public class CoinFlipping {
	
	/** 生成扔硬币的正反面概率
	 * @param 没有参数
	 * @return 没有返回值
	 */
	public static void throwCoin() {
		//生成1和2的随机整数
		Random random = new Random();
		int i = random.nextInt(2)+1;

		if (i==1) {
			System.out.println(new Date()+" 这次是正面○!");
		} else if (i==2) {
			System.out.println(new Date()+" 这次是反面●!");
		} else {
			System.out.println("随机数有误！");
		}
	}
	
}
