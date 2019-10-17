package factorypattern;

public class SouthernBakedGoodIngredientFactory implements BakedGoodIngredientFactory 
{

	public Cake createCake() {
		return new Coconutcake();
	}

	public Filling createFilling() {
		return new Peachfilling();
	}

	public Frosting createFrosting() {
		return new Sugarfrosting();
	}

	public Decorations[] createDecorations() {
		Decorations decorations[] = { new Pecans(), 
		                      new Sprinkles(), 
		                      new Strawberries() };
		return decorations;
	}

	public Message createMessage() {
		return new Southernstyle();
	}
}
