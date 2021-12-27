package Duck;

import Duck.flybehavior.FlyRocketPowered;

public class TestDuck {

	public static void main(String[] args) {
		Duck model=new MallarDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.performQuack();

	}

}
