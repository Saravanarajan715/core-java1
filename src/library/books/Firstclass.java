package library.books;

class Demo{
	private int age=22;
	public int getAge() {
		return age;
	}
}

public class Firstclass {
	public static void main(String[]args) {
		Demo obj=new Demo();
		System.out.println(obj.getAge());
	}

}
