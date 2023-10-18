
public class animal {
         public static void main(String[] args) {
         Lion lion=new Lion();
         lion.sound();
         Tiger tiger=new Tiger();
         tiger.sound();
        	 
         }
}
abstract class Animal1{
	public abstract void sound();
}
class Lion extends Animal1{
	public void sound() {
		System.out.println("Lion roars");
	}
}
class Tiger extends Animal1{
	public void sound() {
		System.out.println("Tiger roars");
	}
	}
	
