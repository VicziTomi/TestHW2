import ClubOfFighters.Warrior;

public class Runable {

    public static void fightEvent(Warrior w1, Warrior w2) {

        System.out.println(w1.toString());
        System.out.println(w2.toString());

        w1.hit(w2);
        w2.hit(w1);
        w1.hit(w2);
        w2.hit(w1);
        w1.hit(w2);
        w2.hit(w1);

        if (w1.getHealth() > 0 && w2.getHealth() > 0) {
            System.out.println("döntetlen");
        } else if (w1.getHealth() > w2.getHealth()) {
            System.out.println("w1 nyert");
        } else if (w2.getHealth() > w1.getHealth()) {
            System.out.println("w2 nyert");
        }
    }
}
