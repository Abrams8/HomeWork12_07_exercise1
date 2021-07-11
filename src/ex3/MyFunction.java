package ex3;

import java.util.ArrayList;
import java.util.List;

public class MyFunction {

    public static List<Car> generateCarList(int quantity) {
        List<Car> collection = new ArrayList<>(quantity);
        for (int i = 0; i<quantity; i++){
            Car car = new Car();
            car.setName((Integer.toString(i)));
            car.setCarModel(CarModel.HETCHACK);
            car.setEngineСapacity((int)(Math.random()*3)+1);
            collection.add(car);
        }
        System.out.println(collection);
        return collection;
    }
}
