package exercises;

public class DataTypesEx {
    public static void main(String[] args){
        HelloWorld hi = new HelloWorld();
        hi.sayHello();
        AreaOfRectangle rec = new AreaOfRectangle();
        rec.area();
        Gasoline car = new Gasoline();
        car.milesPerHour();
        Alice alice = new Alice();
        System.out.println(alice.searchTerm());

    }

}
