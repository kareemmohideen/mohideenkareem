package kareem;
//explicit and implicit type casting

public class primitivedata2 {
	int a=5;
	long b=a;
	long l=4;
	int c=(int)l;
	short s=3;
	byte k=(byte)s;
	
	public static void main(String[] args) {
		primitivedata2 prim2 = new primitivedata2();
		System.out.println(prim2.c);
		System.out.println(prim2.k);
		System.out.println(prim2.b);
		
	}
	
	

}
