package Duck;

import Duck.flybehavior.FlyBehavior;
import quackbehavior.QuackBehavior;

public abstract class Duck {   //宣告兩個行為介面型態的參考變數.在同一個程式包裡面的鴨子子類別都會繼承他們
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {   //委託給行為類別
		flyBehavior.fly();
	}
	
	public void performQuack() {  //委託給行為類別
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("所有的鴨子都會游泳,甚至是誘餌鴨");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
}
