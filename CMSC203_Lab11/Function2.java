
public class Function2 extends Function{
	public double fnValue(double x) {
		if (x >= 0 && x <= 4) {
			return (x / 3) + 2 * (Math.sqrt((Math.pow(x, 2)) - (8 * x) + 25));
		}
		else {
			return Double.MAX_VALUE;
		}
	}
	public String answerString(double optVal, double x, double y, double z) {
		String answer = String.format("Minimum distance is %.2f with AB distance: %.2f and BD distance: %.2f with the BC distance: %.2f", optVal, x, y, z);
		return answer;
	}
	public double getXVal(double x) {
		return x;
	}
	public double getYVal(double x) {
		return (4 - x);
	}
	public double getZVal(double x) {
		double z = Math.sqrt(Math.pow(3.0, 2)+(Math.pow((4-x), 2.0)));
		return z;
	}
	public String toString() {
		return "Find the minimus distance a dog can run and swim to fetch the ball";
	}
}
