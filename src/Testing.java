import org.jetbrains.annotations.Contract;

// абстрактный класс фигуры
abstract class Figure {

    float x; // x-координата точки
    float y; // y-координата точки

    Figure(float x, float y) {

        this.x = x;
        this.y = y;
    }

    // абстрактный метод для получения периметра
    public abstract float getPerimeter();

    // абстрактный метод для получения площади
    public abstract float getArea();
}

// производный класс прямоугольника
class Rectangle extends Figure {
    private float width;
    private float height;

    // конструктор с обращением к конструктору класса Figure
    Rectangle(float x, float y, float width, float height) {

        super(x, y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter() {

        return width * 2 + height * 2;
    }

    public float getArea() {

        return width * height;
    }
}

class Animal {
    public void meow() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Animal anonTiger = new Animal() {
            @Override
            public void meow() {
                System.out.println("Raaar!");
            }
        };

        Animal notAnonTiger = new Animal().new Tiger();

        anonTiger.meow(); // будет выведено Raaar!
        notAnonTiger.meow(); // будет выведено Raaar!
    }

    private class Tiger extends Animal {
        @Override
        public void meow() {
            System.out.println("Raaar!");
        }
    }
}

class LambdaForTest {
    public static void main(String[] args) {
        Math math;
        math = (a, b) -> a + b;

        int result = math.Plus(15, 19);
        System.out.println(result);
    }

    interface Math {
        int Plus(int a, int b);
    }
}

class LambdaApp {
    //todo tomorrow

    public static void main(String[] args) {

        Operationable<Integer> operation1 = (x, y)-> x + y;
        Operationable<String> operation2 = (x, y) -> x + y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate("20", "10")); //2010
    }
}
interface Operationable<T>{
    T calculate(T x, T y);
}

