package Day9;

public class employee {
	String name;
	int age;
	String EID;
	String email;
	int salary;
	
	employee(String name, int age){
		this.name=name;
		this.age=age;}
	employee(String name, int age,String EID,String email){
		this(name,age);
		this.EID=EID;
		this.email=email;
	}
	
	void printData() {
		if(this.name!=null)
			System.out.println(this.name);
		if(this.age!=0)
			System.out.println(this.age);
		if(this.EID!=null)
			System.out.println(this.EID);
		if(this.email!=null)
			System.out.println(this.email);
		if(this.salary!=0)
			System.out.println(this.salary);
	}
	
	void printData1() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.EID);
		System.out.println(this.email);
		System.out.println(this.salary);
		
	}
	}