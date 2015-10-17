package com.javapatterns.builder.effectivejava;

/**
 * 当初始参数非常多的时候，可以使用建造者模式（Builder)模式。
 * @ClassName: NutritionFacts
 * @Description: Effectiv Java示例
 * @date 2013-3-25 下午10:09:50
 */
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories = 0;
	private final int fat = 0;
	private final int carbohydrate = 0;
	private final int sodium = 0;

	/* 类（NutritionFacts）的构造器 */
	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;

		// Options parameter - initialized to default values.
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;

		// calories = builder.calories;
		// fat = builder.fat;
		// carbohydrate = builder.carbohydrate;
		// sodium = builder.sodium;

	}

	public static void main(String[] args) {

	}
}
