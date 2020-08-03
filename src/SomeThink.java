public class SomeThink {
    public static void main(String[] args) {
//        String s = "FuskOff";
//        String sq = "qwe";
//        Some some;
//
//        some = qw -> sq;
//
//        String result = some.qwe("Ne pereopredelit");
//        System.out.println(result);



//        (some = (s)), () -> {
//                    if ("FuskOff".equals(s))
//                        System.out.println(s);
//                    else
//                        System.out.println("Error");
//                };

//        Person person = new Person();
//        person.name = "Carl";
//        person.address.number = 22;
//        person.address.street = "Green";

        Matematika matematika;
        matematika = (a, b) -> a + b;

        int result = matematika.value(11 , 14);
        System.out.println(result);

    }

}

class Person {
    String name;
    Address address;
}

class Address {
    String street;
    int number;
}

interface Some {
    String qwe (String s);
}

interface Matematika {
    int value (int a, int b);
}
