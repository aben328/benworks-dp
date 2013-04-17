package com.cbf4life.cor.wrong;

import java.util.ArrayList;
import java.util.Random;

import com.cbf4life.cor.IWomen;

/**
 * Client 是怎么组装的
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 我们后人来看这样的社会道德
 */
@SuppressWarnings("all")
public class Client {

	public static void main(String[] args) {
		// 随机挑选几个女性
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}

		// 定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();

		/* 迪米特法则相违背。我们在 Client 类中写了 if…eles 的判断条件，你看这个条件体内都是一个接口
		 * IHandler 的三个实现类，谁能处理那个请求，怎么处理，直接在实现类中定义好不就结了吗？你的类我知
		 * 道的越少越好，别让我猜测你类中的逻辑，想想看，把这段 if…else 移动到三个实现类中该怎么做？ */
		for (IWomen women : arrayList) {
			if (women.getType() == 1) { // 未结婚少女，请示父亲
				System.out.println("\n--------女儿向父亲请示-------");
				father.HandleMessage(women);
			} else if (women.getType() == 2) { // 已婚少妇，请示丈夫
				System.out.println("\n--------妻子向丈夫请示-------");
				husband.HandleMessage(women);
			} else if (women.getType() == 3) { // 母亲请示儿子
				System.out.println("\n--------母亲向儿子请示-------");
				son.HandleMessage(women);
			} else {
				// 暂时啥也不做
			}
		}

	}

}
