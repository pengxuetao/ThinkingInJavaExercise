package com.pxt.chapter3;

import com.pxt.util.CoinFlipping;

/** 测试扔硬币的概率
 * @author Pengxuetao
 * @version 1.0 
 */
public class CoinFlippingDemo {

	public static void main(String[] args) {
		//扔硬币的次数
		int time = 100;
		
		//连续扔硬币
		for (int i = 0; i < time; i++) {
			CoinFlipping.throwCoin();
		}		
	}

}
