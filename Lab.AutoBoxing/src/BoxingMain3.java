public class BoxingMain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = new Integer(3);
		Integer j = null;
		int z = i + j;
		Integer z_obj = i + j;
		System.out.println(z);
		System.out.println(z_obj);
	}

}
