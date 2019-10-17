package factorypattern;

public class SouthernBakery extends Bakery {

	protected BakedGood createBakedGood(String item) {
		BakedGood bakedgood = null;
		BakedGoodIngredientFactory ingredientFactory =
		new SouthernBakedGoodIngredientFactory();

		if (item.equals("wedding")) {

			bakedgood = new WeddingCake(ingredientFactory);
			bakedgood.setName("Wedding Cake");

		} else if (item.equals("kids")) {

			bakedgood = new Kidscake(ingredientFactory);
			bakedgood.setName("Children's Cake");

		} else if (item.equals("birthday")) {

			bakedgood = new BirthdayCake(ingredientFactory);
			bakedgood.setName("Birthday Cake");

		}
		return bakedgood;
	}
}
