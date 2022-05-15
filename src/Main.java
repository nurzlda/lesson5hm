public class Main {

    public static void main(String[] args) {

	    Boss boss = new Boss(" ", 500, 60);

        System.out.println("Тип защиты: " + boss.getDefenseType() + ", Здоровье: " + boss.getHealth() + ", Урон: " + boss.getDamage());

    }
}
