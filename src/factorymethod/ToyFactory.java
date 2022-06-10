package factorymethod;

public class ToyFactory {

	public ToyType createProduct(String productName) {
		if(productName == "DOLL") {
			return new Doll();
		}
		if(productName == "BALL") {
			return new Ball();
		}
		if(productName == "CAR") {
			return new Car();
		}
			if(productName == "WHEEL") {
				return new Wheel();
			}
		System.out.println("Unknown toy");
		return null;
		
	}

	public ToyType toytype(String toytype) {
		ToyType product = createProduct(toytype);
		product.prepare();
		return product;
	}

}
