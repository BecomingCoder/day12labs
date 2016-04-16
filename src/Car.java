
public class Car {
	
	public Wheel[] wheels;
	
	
	public Car(int count) {
		wheels = new Wheel[count];
		
		for (int i =0; i < count; i++) {
			wheels[i] = new Wheel();
		}
	}
	public Car() {
		
	}

}
