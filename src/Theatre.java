import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor = new Actor("Евгней", "Самусенко", Gender.MALE, 191);
        Actor actor2 = new Actor("Михаил", "Гор", Gender.MALE, 123);
        Actor actor3 = new Actor("Егор", "Аренов", Gender.MALE, 184);

        Director director = new Director("Антон", "Рагнар", Gender.MALE, 34);
        Director director2 = new Director("Анюта", "Высоцкая", Gender.FEMALE, 345);

        String choreographer = "Алексей Бякин";
        String musicAuthor = "Борис Брокер";

        Show show = new Show("Повесть о конце света", 180, director, new ArrayList<>());
        Opera opera = new Opera(
                "Призрак оперы",
                150,
                director2,
                new ArrayList<>(),
                musicAuthor,
                "Трагическая история в подвалах театра",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                120,
                director,
                new ArrayList<>(),
                musicAuthor,
                "Классика",
                choreographer
        );

        show.addActor(actor);
        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        System.out.println("-----------------------------------");

        System.out.println("Актеры спектакля: ");
        show.printActorsList();
        System.out.println("-----------------------------------");
        System.out.println("Актеры оперы: ");
        opera.printActorsList();
        System.out.println("-----------------------------------");
        System.out.println("Актеры балета: ");
        ballet.printActorsList();
        System.out.println("-----------------------------------");

        ballet.actorReplacement(actor3, "Гор");
        ballet.printActorsList();
        System.out.println("-----------------------------------");

        opera.actorReplacement(actor2, "Шишкин");
        opera.printActorsList();
        System.out.println("-----------------------------------");

        System.out.println("Либретто оперы: " + opera.getLibrettoText());
        System.out.println("Либретто балета: " + ballet.getLibrettoText());


    }
}
