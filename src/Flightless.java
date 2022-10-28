import java.util.Objects;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);

        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = "По земле";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return "Flightless = " + super.toString() + ", " + " Тип перемещения - " + movementType;

    }
}

