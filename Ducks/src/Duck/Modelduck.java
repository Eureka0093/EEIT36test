package Duck;

import Duck.flybehavior.FlyRocketPowered;
import quackbehavior.MuteQuack;

public class Modelduck extends Duck{
	public Modelduck() {
		flyBehavior=new FlyRocketPowered() ;
		quackBehavior=new MuteQuack();
	}
	
	public void display() {
		System.out.println("§Ú¬O¼Ò«¬Àn");
	}
}
