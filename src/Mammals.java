import java.util.Objects;

public class Mammals extends Animals {
    private String livingEnvironment;
    private double travelSpeed;

    public Mammals(String name, int age, String livingEnvironment, double travelSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.travelSpeed = travelSpeed;

        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Комфортная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (travelSpeed >= 0) {
            this.travelSpeed = travelSpeed;
            if (travelSpeed <= 0) {
                this.travelSpeed = 1;
            }
        } else {
            this.travelSpeed = Math.abs(travelSpeed);
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public double getTravelSpeed() {
        return travelSpeed;

    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Комфортная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void setTravelSpeed(double travelSpeed) {
        if (travelSpeed >= 0) {
            this.travelSpeed = travelSpeed;
            if (travelSpeed <= 0) {
                this.travelSpeed = 1;
            }
        } else {
            this.travelSpeed = Math.abs(travelSpeed);
        }
    }

    @Override
    public void eat() {
        System.out.println("Плотоядное");
    }

    @Override
    public void go() {
        System.out.println("Наземное");
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.travelSpeed, travelSpeed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, travelSpeed);
    }

    @Override
    public String toString() {
        return "Mammals = " + super.toString() + ", " + "Среда проживания - " + livingEnvironment +
                ", Скорость перемещения - " + travelSpeed;
    }
}
