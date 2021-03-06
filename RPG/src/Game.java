
public class Game {

	public static void main(String[] args) {
		Player player1 = new Player("정진우");
		Monster enemy1 = new Slime("빨간슬라임", 100);
		Slime s1 = new Monster("검정슬라임",100);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		
		Weapon weapon1 = new Weapon();
		weapon1.name = "창";
		weapon1.damage = 20;
		Weapon weapon2 = new Weapon();
		weapon2.name = "활";
		weapon2.damage = 35;
		
		Slime enemy2 = new Slime("초록슬라임", 100);
		
		player1.getEquip(weapon1);
		player1.attack(enemy2);
		
		Potion healPotion = new Potion("회복포션(소)", 30, "빨간색", "회복");
		System.out.println(healPotion.name);
		
		Potion manaPotion = new Potion("마나포션(소)", 35, "파란색", "마나회복");
		System.out.println(manaPotion.name);
		
		Golem gol1 = new Golem("돌골렘", 1000);
		gol1.defenceOn();
	}

}
