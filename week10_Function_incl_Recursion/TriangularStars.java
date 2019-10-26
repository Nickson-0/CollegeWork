package week10_Function_incl_Recursion;

public class TriangularStars {
	public static int MAX_NUMBER = Integer.MAX_VALUE;
	public static int MINIMUM_VALUE_TRIANGLE_NUMBER = 0;

	public static void main(String[] args) {
		int triangleNumber = 0;
		System.out.println("The triangulars stars are: ");
		for (int i = 0; triangleNumber >= MINIMUM_VALUE_TRIANGLE_NUMBER; i++) {
			triangleNumber = determineTriangleNumber(i, triangleNumber);
			if (isStarNumber(triangleNumber)) {
				System.out.println(triangleNumber);
			}

		}

	} 

	public static boolean isStarNumber(int index) {
		boolean value = false;
		int starNumber = 1;
		for (int n = 1; ((starNumber <= MAX_NUMBER) && (starNumber >= 1)); n++) {
			starNumber = 6 * n * (n - 1) + 1;
			if (index == starNumber) {
				value = true;
			}
		}
		return value;

	}

	public static int determineTriangleNumber(int n, int triangleNumber) {

		return triangleNumber + n;
	}
}