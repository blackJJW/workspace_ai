
public class Golem extends Monster{
	boolean defenceYn = false;
	String kind = "골렘";
	
	public Golem(String name, int hp) {
		super(name, hp);
		super.kind = "골렘";
		// TODO Auto-generated constructor stub
	}
	
	public void defenceOn() {
		defenceYn = true;
	}
	public void defenceOff() {
		defenceYn = false;
	}

	@Override
	public void powerUp() {
		this.damage *= 4;
		
	}

}
