import java.util.Objects;

public class Flying extends Birds {

    private String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);

        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "Полет";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void fly() {
        System.out.println("Летать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flying = " + super.toString() + ", " + "Тип перемещения - " + movementType;

    }
}
