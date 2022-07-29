package sec01.exam05;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		//}
	}
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
/*예제를 실행하면 14라인에서 ClassCastException이 발생합니다. 그 이유는 9라인에서 Cat 객체를
매개값으로 주어서 Dog타입으로 변환할 수 없기 때문입니다.