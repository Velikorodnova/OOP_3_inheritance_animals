import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Животное";
        } else {
            this.name = name;
        }

        if (age >= 0) {
            this.age = age;
            if (age <= 0) {
                this.age = 1;
            }
        } else {
            this.age = Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Животное";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println("Спит ночью");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            if (age <= 0) {
                this.age = 1;
            }
        } else {
            this.age = Math.abs(age);
        }
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", Возраст - " + age;

    }
}
