package org.example;

public class MyRandom {

	private int i = (int) (System.currentTimeMillis()% 10000);

	/**
	 * Generates a new pseudorandom number using a special case of the
	 * <a href="https://en.wikipedia.org/wiki/Middle-square_method"> Middle-square
	 * method</a> which uses at most four digits.
	 * 
	 * @return
	 */
	public int nextInt() {
		i = i * i;
		i /= 100;
		i %= 10000;
		return i;
	}

}
