package Day27;

public class Generic_Demo {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.data = 20;
		System.out.println(b1.data);
		Box<Double> b2 = new Box<>();
		b2.data = 20.21;
		System.out.println(b2.data);

		Wrap<Integer, Boolean> w1 = new Wrap<>();
		w1.key = 10;
		w1.value = true;
		System.out.println("Key->" + w1.key + " || Value->" + w1.value);

		Box2<Integer> b3 = new Box2<>();
		b3.data = 20;
		System.out.println(b3.data);

//Box2<String> b4=new Box2<>();   giving error because String is neither Number class nor child of Number  

	}

}

class Box<T> {
	T data;
}

class Wrap<K, V> {
	K key;
	V value;
}

class Box2<T extends Number> {
	T data;
}