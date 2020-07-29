import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aqua {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much substance will mix?");
        float firstSubstance = Float.parseFloat(reader.readLine());
        float secondSubstance = Float.parseFloat(reader.readLine());
        System.out.println("You have firstSubstance: " + firstSubstance + "and: secondSubstance" + secondSubstance);
        System.out.println("How large will be catalyst?");
        float catalyst = Float.parseFloat(reader.readLine());
        System.out.println("You indicated that catalyst is: " + catalyst);
        System.out.println("Please, press any key to begin.");
        reader.readLine();
        new BlaBla().meshatelWork();
        float a = firstSubstance;
        float b = secondSubstance;
        float c = catalyst;
        pomeshat(a, b, c);
    }
    static public void pomeshat(float a, float b, float c) {
        System.out.println("Теперь в 1 таре осталось: " + (a - c) + ", а во второй: " + (b + c));
        System.out.println("С концентрациями: " + " 100% в первой " +
                "во второй первого вещества: " + (1 - (c / (c + b))) * 100 + "% и второго вещества: " + (c / (c + b)) * 100 + "%");
        float x = (c / (c + b)) * (c / (a - c)) + (1 - (c / (a - c)));
        float y = ((1 - (c / (c + b))) * ((c / (a - c))));
        System.out.println("После второго взмешивания концентрация первой тары составляет первого вещества: " + x * 100 + "% второго вещества: " + y * 100 + "%");
        System.out.println("Для большей наглядности концентрация в первой таре:");
        System.out.println("Первого вещества: " + x * 100 + "% Второго вещества: " + y * 100 + "%");
        System.out.println("Концентрация во второй таре");
        float x2 = (1 - (c / (c + b))) * 100;
        float y2 = (c / (c + b)) * 100;
        System.out.println("Первого вещества: " + x2 + "% второго вещества: " + y2 + "%");
    }
    static class BlaBla {
        void meshatelWork() throws InterruptedException {
            System.out.print(".");
            Thread.sleep(505);
            System.out.print(".");
            Thread.sleep(505);
            System.out.print(".");
            Thread.sleep(505);
            System.out.print(".");
            Thread.sleep(505);
            System.out.println(".");
            Thread.sleep(505);
        }
    }
}
