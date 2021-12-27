package Duck;

import Duck.flybehavior.FlyWithWing;
import quackbehavior.Quack;

public class MallarDuck extends Duck{
	public MallarDuck() {
		flyBehavior=new FlyWithWing() ;
		quackBehavior=new Quack();
	}
	
	public void display() {
		System.out.println("§Ú¬O¼Ò«¬Àn");
	}
}