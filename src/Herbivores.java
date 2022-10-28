import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, double travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);

        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "Всеядные";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void graze() {
        System.out.println("Пастись");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores = " + super.toString() + ", " + "Тип пищи - " + typeOfFood;

    }
}
