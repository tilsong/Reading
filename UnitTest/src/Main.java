public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	private static long count = 0L;

	public static String hi() {
		Hello hello = new Hello();
		hello.setId(++count);

		if(hello.getId() > 1){
			throw new IllegalStateException("MORE CALLED");
		}
		return "hello";
	}

	public String hello() {
		return"hello";
	}
}