package day9;

public class ObjectDemo1 {

	public static void main(String[] args) {
	System.out.println(new ObjectDemo1());

	ObjectDemo1 obj = new ObjectDemo1();
	System.out.println(obj);
	
	ObjectDemo1 objj;
	objj = new ObjectDemo1();
	System.out.println(objj);
	
	System.out.println(new ObjectDemo1().hashCode());
	System.out.println(obj.hashCode());
	System.out.println(objj.hashCode());
	
	System.out.println("day.ObjectDemo1@" + Integer.toHexString(obj.hashCode()));
	
	
	}

}
