package factorypattern;

public class BakedGoodTestDrive {
 
	public static void main(String[] args) {
		Bakery northStore = new NorthernBakery();
		Bakery southStore = new SouthernBakery();
 
		BakedGood bakedgood = northStore.orderBakedGood("birthday");
		System.out.println("Tom ordered a " + bakedgood + "\n");
 
		bakedgood = southStore.orderBakedGood("birthday");
		System.out.println("Ed ordered a " + bakedgood + "\n");

		bakedgood = northStore.orderBakedGood("kids");
		System.out.println("Tom ordered a " + bakedgood + "\n");
 
		bakedgood = southStore.orderBakedGood("kids");
		System.out.println("Ed ordered a " + bakedgood + "\n");

		bakedgood = northStore.orderBakedGood("wedding");
		System.out.println("Kathy ordered a " + bakedgood + "\n");
 
		bakedgood = southStore.orderBakedGood("wedding");
		System.out.println("Kathy ordered a " + bakedgood + "\n");

	}
}
