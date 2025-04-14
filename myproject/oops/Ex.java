package oops;
abstract class Animal1 {
	public abstract void sound();
}
class dog extends Animal1
{
	public void sound()
	{
		System.out.println("the dog is barking");
	}
	
public class main{
	

	public static void main(String[] args) {
		Animal1 d=new dog();
		d.sound();
	}

}

}