
public abstract class Monster {
	String name;
	int hp;
	int mana;
	int damage;
	String kind;
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack(Player player) {
		if(player.hp <= 0) {
			System.out.println(player.name + "은(는) 이미 죽었습니다.\n");
			return ;
		}
		int afterhp = player.hp - this.damage;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격 \n", this.name, player.name, this.damage);
		if(afterhp < 0) {
			afterhp = 0;
			System.out.printf("%s이(가) 죽었습니다. \n", player.name);
			player.hp = afterhp;
			return ;
		}

		System.out.printf("%s의 체력이 %d에서 %d가 됨 \n", player.name, player.hp, afterhp);
		player.hp = afterhp;
	}
	
	abstract public void powerUp();
}
