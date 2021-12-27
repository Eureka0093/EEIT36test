package Duck;

import Duck.flybehavior.FlyBehavior;
import quackbehavior.QuackBehavior;

public abstract class Duck {   //�ŧi��Ӧ欰�������A���Ѧ��ܼ�.�b�P�@�ӵ{���]�̭����n�l�l���O���|�~�ӥL��
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {   //�e�U���欰���O
		flyBehavior.fly();
	}
	
	public void performQuack() {  //�e�U���欰���O
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("�Ҧ����n�l���|��a,�ƦܬO�����n");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior=qb;
	}
}
