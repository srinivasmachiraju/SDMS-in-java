class Rough {
	public static void main(String [] args){
		B b=new B();
		System.out.println(b.i);
	}
}

class A{
	protected int i;
	A(){
	i=4;
	}
}

class B extends A{
	
}