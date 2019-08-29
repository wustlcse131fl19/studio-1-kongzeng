package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");

		boolean isOrdered1 = x > y;
		boolean isOrdered2 = y > z;
		boolean isOrdered = isOrdered1 == isOrdered2;
		System.out.println(isOrdered);


	}

}
