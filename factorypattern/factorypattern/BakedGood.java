package factorypattern;

public abstract class BakedGood {
	String name;

	Cake cake;
	Filling filling;
	Decorations decorations[];
	Frosting frosting;
	Message message;

	abstract void prepare();


	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (message != null) {
			result.append(message);
			result.append(" ");
		}
		if (cake != null) {
			result.append(cake);
			result.append(" with ");
		}
		if (filling != null) {
			result.append(filling);
			result.append(", ");
		}
		if (frosting != null) {
			result.append(frosting);
			result.append("\n");
		}
		if (decorations != null) {
			result.append("Toppings include: ");
			for (int i = 0; i < decorations.length; i++) {
				result.append(decorations[i]);
				if (i < decorations.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		
		return result.toString();
	}
}
