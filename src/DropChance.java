import java.util.Random;

public class DropChance implements ToDropChance {

    /**
     * Testing drop chance
     */

    public static void main(String[] args) {

    }

    void otherTestRandomFromOtherClass(float proc) {
        int a = 1001;
        int i = 0;
        for (; a > proc; i++) {
            a = random.nextInt(1000) + 1;
            System.out.println(a);
        }
        System.out.println("You go to dunge " + i + " times");
        System.out.println("Non static obrabotka");
    }

    // Link on habr https://habr.com/ru/post/216431/
    // Link on javaOnline https://www.tutorialspoint.com/compile_java_online.php

    //Check numbers under 1 or upper 1
    @Override
    public void goToDange(float chance) {
        int a = 880055535;
        if (chance < 1) {
            chance *= 10;
            new Main().fignia(chance);
        } else {
            while (a >= chance) {
                a = random.nextInt(100) + 1;
                System.out.println(a);
                Main.timesTryToDungeon++;
            }
            System.out.println("You go to dunge " + Main.timesTryToDungeon + " times");
            System.out.println("MainTest obrabotka");
        }
    }

    ToDropChance toDropChance = chance -> {
        if (chance > 0)
            goToDange(chance);
        else if (chance <= 0) System.out.println("Error chance < 0");
        else System.out.println("Kak Ti etogo Dobilsia Molotshiaga, ti naebnul chance");
    };

}

interface ToDropChance {
    Random random = new Random();

    void goToDange(float chance);

}
