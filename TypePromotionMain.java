package week1.day4.type_promotion;

public class TypePromotionMain {

	public static void main(String[] args) {
		byte b = (byte) 245;		// We must cast because they get promoted to int for the calculation
		short s = (short) (b * b);	// (So, we would be assigning int to short)
		int i = s * s;
		float f = (float) (i * i + .001);
		double d = f * f;
		System.out.println("And we have: " + Double.toString(d));
	}
}
