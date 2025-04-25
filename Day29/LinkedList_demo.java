package Day29;

import java.util.LinkedList;

public class LinkedList_demo {

	public static void main(String[] args) {
		LinkedList<Student> st=new LinkedList<>();
		System.out.println(st.isEmpty());
        st.add(new Student("Sam",1,67));
        st.add(new Student("Ram",2,77));
        st.add(new Student("tom",3,87));
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.poll());
        System.out.println(st.size());
        System.out.println(st.contains(new Student("tom",3,87)));
        st.clear();
        System.out.println(st);
	}

}
