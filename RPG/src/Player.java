
public class Player {
	String name = "정진우";
	int hp = 100;
	int mana = 100;
	int damage = 10;
	
	public Player(String name) {
		//super(); // 부모의 기본 생성자를 호
		this.name = name;
	}
	
	public void attack(Slime enemy) {
		
		if(enemy.hp <= 0) {
			System.out.println(enemy.name + "은(는) 이미 죽었습니다.\n");
			return ;
		}
		int afterhp = enemy.hp - this.damage;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격 \n", this.name, enemy.name, this.damage);
		if(afterhp < 0) {
			afterhp = 0;
			System.out.printf("%s이(가) 죽었습니다. \n", enemy.name);
			enemy.hp = afterhp;
			return ;
		}

		System.out.printf("%s의 체력이 %d에서 %d가 됨 \n", enemy.name, enemy.hp, afterhp);
		enemy.hp = afterhp;
	}
	
	public void getEquip(Weapon wp) {
		this.damage += wp.damage;
		System.out.printf("%s가 %s를 장착, 데미지 증가함 : %d \n", this.name, wp.name, this.damage);
	}
}
