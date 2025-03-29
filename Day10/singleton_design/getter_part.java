package Day10.singleton_design;

public class getter_part {
	public static void main(String[] args) {
		Connection c1 = Connection.getobj("Mongo", "Tom");
		System.out.println(c1); //will give same address
		Connection c2 = Connection.getobj("neo4j", "Tim");
		System.out.println(c2); //will give same address
	}

}
