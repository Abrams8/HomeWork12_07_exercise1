package ex4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable {

    @Override
    public String call()  {
            List<Player> collection = new ArrayList<>(10);
            for (int i = 0; i<10; i++){
                Player player = new Player();
                player.setName((Integer.toString(i)));
                player.setAge((int)(20 + (Math.random()*20)));
                player.setActive(true);
                collection.add(player);
        }

            File file = new File("C:\\Users\\Abrams\\IdeaProjects\\HomeWork12_07\\src\\ex4\\collection.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (Player player : collection) {
                String name = player.getName();
                String age = Integer.toString(player.getAge());
                String isActive = Boolean.toString(player.isActive());
                writer.write(name + " : " + age + " : " + isActive + "\n");
            }
        }catch (IOException e){
                throw new RuntimeException("Ups, failed to write into file: " + e);
            }
        return file.getName();
        }
    }
