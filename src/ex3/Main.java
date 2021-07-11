package ex3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main extends MyFunction {
    public static void main(String[] args) {
        List<Car> carList = generateCarList(10);
        Map<Integer, List<Car>> map = carList.stream()
                .collect(Collectors.groupingBy(car -> car.getEngineСapacity()));
        map.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getKey))
                .forEach(System.out::println);


        carList.stream()
                .map(car -> "<" + car.getName() + "> : " + "<" + car.getCarModel() + "> : " + car.getEngineСapacity() + "\n")
                .forEach(value -> FileWriterUtil.writeToFileEnd("C:\\Users\\Abrams\\IdeaProjects\\HomeWork12_07\\src\\ex3\\car.txt", value));
    }


}
