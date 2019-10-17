package factorypattern;

public interface BakedGoodIngredientFactory {
 
	public Cake createCake();
	public Filling createFilling();
	public Frosting createFrosting();
	public Decorations[] createDecorations();
	public Message createMessage();
 
}
