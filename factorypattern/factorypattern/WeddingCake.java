package factorypattern;

public class WeddingCake extends BakedGood {
	BakedGoodIngredientFactory ingredientFactory;
 
	public WeddingCake(BakedGoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		cake = ingredientFactory.createCake();
		filling = ingredientFactory.createFilling();
		frosting = ingredientFactory.createFrosting();
	}
}
