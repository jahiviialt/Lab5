package cs101;

public class Interval {

	// 1. Make a private instance variable `left` of type double
	private double left;

	// 2. Make a private instance variable `right` of type double
	private double right;

	// 3. Write a public constructor for the Interval class.
	// It should take in 2 parameters: a double `left` and a double `right`
	// Remember constructors do not need return types
	// It should throw an error if left > right, or if either are infinite/errors
	// Some of this is already done for you
	public Interval(double left, double right) {
		if (Double.isInfinite(left) || Double.isInfinite(right))
			throw new IllegalArgumentException("Endpoints must be finite");
		if (Double.isNaN(left) || Double.isNaN(right))
			throw new IllegalArgumentException("Endpoints cannot be NaN");
		if (left > right) {
			throw new IllegalArgumentException("Illegal interval");
		}

		// add your code here to set the appropriate instance variables

	}

	// 4. Write a public method called `getLeft`
	// It should take in 0 parameters
	// It should return the `left` double value
	// The function signature is already written for you
	public double getLeft() {
		return 0.0; // you will need to replace 0.0
	}

	// 5. Write a public method called `getRight`
	// It should take in 0 parameters
	// It should return the `right` double value

	// 6. Write a public method called `length`
	// It should take in 0 parameters
	// It should return the length of the interval
	// (the distance between right and left)

	// 7. Write a public method called `contains`
	// It should take in 1 parameter: a double `x`
	// It should return a boolean that indicates whether or not `x`
	// is in the interval defined by (left, right)
	// This should include the left and right endpoints

	// 8. Write a public method called `intersects`
	// It should take in 1 parameter: an Interval `b`
	// It should return a boolean that indicates whether this interval
	// overlaps at all with Interval `b`.

	// 9. Write a public method called `toString`
	// It should take in 0 parameters
	// It should return (NOT print!) a String representation of this Interval
	// For example, for an Interval where left is 0.0 and right is 2.0,
	// this method should return "[0.0, 2.0]". The space, comma, and brackets
	// should match

}
