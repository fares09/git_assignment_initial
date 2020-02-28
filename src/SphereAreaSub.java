
public class SphereAreaSub implements ISubscriber{

	
	public void notifySubscriber(String input) { // input will be a single integer for all functions.
		int r = Integer.parseInt(input);// radius
		double area;
		area = 4 * 3.14 * (r*r); // 4Pi*r^2.
		System.out.println(area);
	}

	
}
