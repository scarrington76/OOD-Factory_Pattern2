package factorypattern;

public class NorthernBakedGoodIngredientFactory implements BakedGoodIngredientFactory {
 
	public Cake createCake() {
		return new Marblecake();
	}
 
	public Filling createFilling() {
		return new Cherryfilling();
	}
 
	public Frosting createFrosting() {
		return new Fondant();
	}
 
	public Decorations[] createDecorations() {
		Decorations decorations[] = { new M_and_Ms(), 
		                      new Sprinkles(), 
		                      new NutGoodies() };
		return decorations;
	}
 

	public Message createMessage() {
		return new Northernstyle();
	}
}
