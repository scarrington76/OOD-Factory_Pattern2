package factorypattern;

public class Kidscake extends BakedGood {
	BakedGoodIngredientFactory ingredientFactory;
 
	public Kidscake(BakedGoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		cake = ingredientFactory.createCake();
		filling = ingredientFactory.createFilling();
		frosting = ingredientFactory.createFrosting();
		decorations = ingredientFactory.createDecorations();
	}
}
