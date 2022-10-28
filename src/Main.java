public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 0, "Африка", 97, "Травоядное");
        System.out.println(gazelle);
        Herbivores giraffe = new Herbivores("Жираф", 0, "Африка", 60, "Травоядное");
        Herbivores giraffe2 = new Herbivores("Жираф", 0, "Африка", 60, "Травоядное");
        System.out.println(giraffe);
        Herbivores horse = new Herbivores("Лошадь", 0, "Россия", 88, "Травоядное");
        System.out.println(horse);
        Predators hyena = new Predators("Гиена", 0, "Африка", 64, null);
        System.out.println(hyena);
        Predators tiger = new Predators("Тигр", 0, "Африка", 65, "Плотоядное");
        System.out.println(tiger);
        Predators bear = new Predators("Медведь", 0, "Россия", 50, "Плотоядное");
        System.out.println(bear);
        Amphibians frog = new Amphibians("Лягушка", 0, null);
        System.out.println(frog);
        Amphibians natrix = new Amphibians("Уж пресноводный", 0, "Россия");
        System.out.println(natrix);
        Flightless peacock = new Flightless("Павлин", 0, "Индия", "По земле");
        System.out.println(peacock);
        Flightless penguin = new Flightless("Пингвин", 0, "Австралия", "По земле");
        System.out.println(penguin);
        Flightless dodoBird = new Flightless("Птица додо", 0, "Маврикий", "По земле");
        System.out.println(dodoBird);

        System.out.println(giraffe.equals(giraffe2));

        tiger.hunt();

        peacock.walk();





    }
}