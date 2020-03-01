import java.util.Scanner;
// change for pull
public class Main {
	//
	private static ISubscriber subscribers [] = {
			new SphereAreaSub()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
