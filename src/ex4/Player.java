package ex4;

import java.util.Objects;

public class Player {
    // с полями name(String), age(Integer), isActive(boolean) по условию:
    // name – любое, age – от 20 до 40, isActive – true/false и записывает ее в файл.
    // Поток возвращает имя файла, в который он писал.
    private String name;
    private Integer age;
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return isActive == player.isActive && Objects.equals(name, player.name) && Objects.equals(age, player.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isActive);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }

    public Player(String name, Integer age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }
    public Player(){

    }
}
