package ua.lviv.iot.first1;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[10];
		for (int i=0; i<10; i++) {
			if (i%2 == 0) arr[i] = new Cat();
			else arr[i] = new Dog();
		}
		for (Animal a: arr) {
			a.feed();
			a.voice();
			System.out.println();
		}
	}

}
interface Animal{
	void voice();
	void feed();
}
class Cat implements Animal{
	@Override
	public void voice() {
		System.out.println("Meow");
	}
	@Override
	public void feed() {
		System.out.println("Cat ate a fish");
	}
}
class Dog implements Animal{
	@Override
	public void voice() {
		System.out.println("Bark");
	}
	@Override
	public void feed() {
		System.out.println("Dog ate a bone");
	}
}