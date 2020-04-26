
public class Function3 extends Function{
	public double fnValue(double x) {
		return (Math.sqrt((Math.pow(x, 4.0)) - (Math.pow(x,  2.0)) + 1));
	}
	public String answerString(double optVal, double x, double y, double z) {
		String answer = String.format("The closest point is: %.2f with x: %.2f and y: %.2f", optVal, x, y);
		return answer;
	}
	public double getXVal(double x) {
		return x;
	}
	public double getYVal(double x) {
		return (Math.pow(x, 2.0));
	}
	public double getZVal(double x) {
		return -1.0;
	}
	public String toString() {
		return "Find the closest point on a parabola to a given point";
	}
}
