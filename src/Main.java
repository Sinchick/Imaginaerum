import java.util.Random;

public class Main {

    static float timesTryToDungeon = 0;

    public static void main(String[] args) {
        new DropChance().toDropChance.goToDange(0.1f);
    }

    public void fignia(float qwe) {
        int a = 1001;
        int i = 0;
        for (; a > qwe; i++) {
            a = new Random().nextInt(1000) + 1;
            System.out.println(a);
        }
        System.out.println("You go to dunge " + i + " times");
        System.out.println("Non static obrabotka");
    }
}

