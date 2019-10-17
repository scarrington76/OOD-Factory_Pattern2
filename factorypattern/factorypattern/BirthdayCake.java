package factorypattern;

public class BirthdayCake extends BakedGood {
	BakedGoodIngredientFactory ingredientFactory;
 
	public BirthdayCake(BakedGoodIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		cake = ingredientFactory.createCake();
		filling = ingredientFactory.createFilling();
		frosting = ingredientFactory.createFrosting();
		decorations = ingredientFactory.createDecorations();
		message = ingredientFactory.createMessage();
	}
}
