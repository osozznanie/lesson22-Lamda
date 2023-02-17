package Lambda;

public class Main {
    public static void main(String[] args) {

        String dog = "Dog";
        Pets petDog = ()-> System.out.println(dog + " say: " + "Я пес - Гаууу-Гаууу");

        String cow = "Cow";
        Pets petsCow = ()-> System.out.println(cow + " say: " + "Я корова- Мууу-Мууу");

        String cat = "Cat";
        Pets petCat = ()-> System.out.println(cat + " say: " + "Я кіт- Мяууу-Мяууу");

        petDog.voice();
        petCat.voice();
        petsCow.voice();

    }
}

interface Pets{
    public void voice();
}