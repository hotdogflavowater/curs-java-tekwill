package practice;
@FunctionalInterface
interface Attacker {
    void attack(String target);
}

public class Attack {
    public static void main(String[] args) {
        Attacker warrior = name -> System.out.println("Attacks: " + name);
        Attacker Jora = target -> System.out.println("Attacks: " + target);
        Attacker Buburuza = target -> System.out.println("Attacks: " + target);
            warrior.attack("Goblin");
            Jora.attack("Vodka");
            Buburuza.attack("flower");
    }
}
