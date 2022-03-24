package ua.lviv.iot.first2;

public class Main {

	public static void main(String[] args) {
		Person[] arr = new Person[12];
		for (int i=0; i<12; i++) {
			if (i%3 == 1) arr[i] = new Teacher();
			else if (i%3 == 2) arr[i] = new Cleaner();
				else arr[i] = new Student();
		}
		for (Person p: arr) {
			p.print();
			if (p instanceof Teacher) ((Teacher)p).salary();
			else if (p instanceof Cleaner) ((Cleaner)p).salary();
		}
	}

}

abstract class Person{
	String name = "Bob";
	abstract void print();
}

class Student extends Person{
	private static final String TYPE_PERSON = "Student";
	Student(){
		System.out.println(TYPE_PERSON);
	}
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name);
	}
}

abstract class Stuff extends Person{
	abstract void salary();
	public void print() {
		System.out.println("I am a " + name);
	}
}

class Teacher extends Stuff{
	private static final String TYPE_PERSON = "Teacher";
	Teacher(){
		System.out.println(TYPE_PERSON);
	}
	public void salary() {
		System.out.println("Teacher::salary was called");
	}
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name);
	}
}
class Cleaner extends Stuff{
	private static final String TYPE_PERSON = "Cleaner";
	Cleaner(){
		System.out.println(TYPE_PERSON);
	}
	public void salary() {
		System.out.println("Cleaner::salary was called");
	}
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " " + name);
	}
}