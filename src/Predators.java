import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, double travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);

        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Всеядное";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators = " + super.toString() + ", " + " Тип пищи - " + typeOfFood;

    }
}
