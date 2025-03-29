package Day10.factory_design;

public class encap_setter {
	
	private int age;
	private String name;
	
	private encap_setter(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	// this is known as factory design method
	public static encap_setter getobject(String name, int age) {
		return new encap_setter(name,age);
		
	}
	
	
}
