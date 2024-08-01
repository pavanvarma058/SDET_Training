package day8;
import java.io.*;

class StreetAnimal {
	int i=10;
	StreetAnimal(){
		System.out.println("Animal constructor called");
	}
}

class Cat extends StreetAnimal implements Serializable {
	int j=20;
	Cat(){
		System.out.println("Dog Constructor called");
	}
}


public class SerializableWRTInheritance1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat d1 = new Cat();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cat d2 = (Cat) ois.readObject();
		System.out.println(d2.i+".........."+d2.j);

	}

}
