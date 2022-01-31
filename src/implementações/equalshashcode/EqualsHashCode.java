package implementações.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class EqualsHashCode {
    public static void main(String[] args) {

    List<Car> carList = new ArrayList<>();

    carList.add(new Car("Ford"));
    carList.add(new Car("Peugeot"));
    carList.add(new Car("Volkswagen"));


    System.out.println(carList.contains(new Car("Ford"))); // contains usa equals e hashcode
    System.out.println(new Car("Ford").hashCode());



    }

}
