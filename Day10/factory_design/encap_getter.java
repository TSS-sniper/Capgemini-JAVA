package Day10.factory_design;
// this is known as factory design method
public class encap_getter {

	public static void main(String[] args) {
		encap_setter e = encap_setter.getobject("Nigesh", 39);
			
		//e.setAge(900);
		//e.setName("TSS");
		
		System.out.println(e.getAge());
		System.out.println(e.getName());

	}

}
