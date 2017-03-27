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
		
		//扔硬币
		CoinFlipping.throwCoin(time);		
	}

}
