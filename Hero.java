package league;

public class Hero {
	String name;
	String role;
	int armor;
	int hp;
	int movespeed;
	
	int getArmor() {
		return armor;
	}
	
	int getHp() {
		return hp;
	}
	int bloodRecovery(int recovery) {
		hp=hp+recovery;
		return recovery;
	}
	
	void multiKill(int multikillnum) {}
	
	void legendary() {}
	
	void addSpeed(int speed) {
		movespeed=movespeed+speed;
	}
	
	
public static void main(String[] args) {
	Hero Ash = new Hero();
	Ash.name="Ash";
	Ash.role="bot lane";
	Ash.hp=527;
	Ash.armor=21;
	Ash.movespeed=325;
	
}
}
