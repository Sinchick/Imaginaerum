public abstract class Building {


    private String name, address, type;


    public static void main(String[] args) {
        Building.House home = new Building.House("Home", "Pechkin S strt");
        System.out.println(home);
    }

    Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static class Platform extends Building {
        public Platform(String name, String address) {
            super(name, address);
            setType("Platform");
        }


        // some additional logic
    }

    public static class House extends Building {
        public House(String name, String address) {
            super(name, address);
            setType("House");
        }

        // some additional logic
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            setType("Shop");
        }

        // some additional logic
    }

    public void setType(String type) {
        this.type = type;
    }

}