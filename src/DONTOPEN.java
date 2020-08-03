public class DONTOPEN {
    private String name, street, house;

    public DONTOPEN(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    private interface AddressContainer {
        String getStreet();
        String getHouse();
    }

    public AddressContainer getAddressContainer() {
        class PersonAddressContainer implements AddressContainer {
            final String street = DONTOPEN.this.street, house = DONTOPEN.this.house;

            @Override
            public String getStreet() {
                return this.street;
            }

            @Override
            public String getHouse() {
                return this.house;
            }
        }

        return new PersonAddressContainer();
    }

    public static void main(String[] args) {
        DONTOPEN person = new DONTOPEN("Nikita", "Sholohova", "17");

        AddressContainer address = person.getAddressContainer();

        System.out.println("Address: street - " + address.getStreet() + ", house - " + address.getHouse());
    }

    // getters/setters
}