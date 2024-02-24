public class CounterDemo{
	public static void main(String[] args) {
		Counter c;
		c = new Counter();
		c.increment();
		c.increment(3);

		int temp = c.getCount();
		System.out.println("Value of c-instance is " + temp);

		c.reset();
		Counter d = new Counter(5);
		d.increment();
		Counter e = d;
		temp = e.getCount();
		e.increment(2);
	}
}
