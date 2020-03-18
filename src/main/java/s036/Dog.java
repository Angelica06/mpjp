package s036;

public class Dog {
	String name;
	
	public Dog() { //è un costruttore, che mi crea un oggetto
	    name = "No name";
		System.out.println("A new dog has been created");
	}
	public Dog (String n) {
		//name = n
		System.out.println("A new dog has been created");
	}
	
	public void bark() {
		System.out.println(name + ": yap");
	}
}
