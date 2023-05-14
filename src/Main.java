public class Main {

    public static void books() {
        Author LeoTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", LeoTolstoy, 1865);

        Author NikolaiGogol = new Author("Николай", "Гоголь");
        Book DeadSouls = new Book("Мёртвые души", NikolaiGogol, 1842);

        System.out.println(String.format("%s написана автором %s %s в %s году", warAndPeace.getName(), warAndPeace.getAuthor().getName(),warAndPeace.getAuthor().getSecondName(), warAndPeace.getYear()));
        System.out.println(String.format("%s написана автором %s %s в %s году", DeadSouls.getName(), DeadSouls.getAuthor().getName(),DeadSouls.getAuthor().getSecondName(), DeadSouls.getYear()));

        warAndPeace.setYear(1869);
        DeadSouls.setYear(1845);

        System.out.println();
        System.out.println(String.format("%s написана автором %s %s в %s году", warAndPeace.getName(), warAndPeace.getAuthor().getName(),warAndPeace.getAuthor().getSecondName(), warAndPeace.getYear()));
        System.out.println(String.format("%s написана автором %s %s в %s году", DeadSouls.getName(), DeadSouls.getAuthor().getName(),DeadSouls.getAuthor().getSecondName(), DeadSouls.getYear()));
    }

    public static void main(String[] args) {
        task();
    }
    public static void task() {
        System.out.println("Задача");
        books();
    }
}