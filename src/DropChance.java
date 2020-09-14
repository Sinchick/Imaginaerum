import java.util.Random;

public abstract class DropChance implements ToDropChance {

    static void otherTestRandomFromOtherClass(int proc) {
        int a = 1001;
        int i = 0;
        for (; a >= proc; i++) {
            a = random.nextInt(1000) + 1;
            System.out.println(a);
        }
        System.out.println(i);
    }

    private Float goToDange;
    ToDropChance<Float, Integer> tryingDunge = ((chance, times) -> goToDange);

    public void crishnaid(ToDropChance<Float, Integer> rules) {
        int a = 880055535;
        rules.goToDange(2f, 4);
    }

    public void goToDange(Float chance, Integer times) {
        //chance *= 10;
        int a = 880055535;
        if (chance < 1) {
            int rechanceToInt = (int) (chance * 10);
            otherTestRandomFromOtherClass(rechanceToInt);
        }
        while (a >= chance) {
            a = random.nextInt(100) + 1;
            System.out.println(a);
            times++;
        }
        System.out.println(times);
    }
}

interface ToDropChance<T, I> {
    T goToDange(T chance, I times);

    static Random random = new Random();

}
