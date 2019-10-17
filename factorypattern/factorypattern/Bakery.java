package factorypattern;

public abstract class Bakery {
 
	protected abstract BakedGood createBakedGood(String item);
 
	public BakedGood orderBakedGood(String type) {
		BakedGood bakedgood = createBakedGood(type);
		System.out.println("--- Making a " + bakedgood.getName() + " ---");
		bakedgood.prepare();
		return	bakedgood;
	}
}
