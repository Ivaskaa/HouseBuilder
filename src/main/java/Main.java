import builders.HouseBuilder;
import director.Director;
import house.House;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();

        director.constructFirstHouse(builder);
        House house1 = builder.getResult();
        System.out.println(house1.getInfo());

        director.constructSecondHouse(builder);
        House house2 = builder.getResult();
        System.out.println(house2.getInfo());
    }
}
