package com.pxt.util;

import java.util.Date;
import java.util.Random;

/** 模拟扔硬币工具类
 * 模拟扔硬币的概率，正反面50%
 * @author Pengxuetao
 * @version 1.0
 */
public class CoinFlipping {
	
	/** 硬币正反面常量
	 * HEAD为正面，TAIL为反面
	 */
	private static final int HEAD = 1;
	private static final int TAIL = 2;
	
	/** 生成扔硬币的正反面概率
	 * @param time为扔硬币次数
	 * @return 没有返回值
	 */
	public static void throwCoin(int time) {
		//生成1和2的随机整数
		Random random = new Random();
		int randomInt;

		/** 正反面统计次数
		 * headCount为正面统计次数，tailCount为反面统计次数
		 */
		int headCount = 0;
		int tailCount = 0;
		
		//连续扔硬币
		for (int i = 0; i < time; i++) {
			randomInt = random.nextInt(2)+1;
			if (randomInt==HEAD) {
				System.out.println(new Date()+" 这次是正面○!");
				headCount++;
			} else if (randomInt==TAIL) {
				System.out.println(new Date()+" 这次是反面●!");
				tailCount++;
			} else {
				System.out.println("随机数有误！");
			}
		}		

		System.out.println("一共抛出"+(headCount+tailCount)+"次，○正面出现"+headCount+"次，●反面出现"+tailCount+"次");
	}
	
}
