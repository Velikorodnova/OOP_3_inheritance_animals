import java.util.Objects;

public class Birds extends Animals {

    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);

        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Комфортная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Комфортная";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public void eat() {
        System.out.println("Плотоядная");
    }

    @Override
    public void go() {
        System.out.println("По воздуху");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return "Birds = " + super.toString() + ", " + "Среда проживания - " + livingEnvironment;

    }
}
