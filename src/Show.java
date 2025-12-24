import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActorsList() {
        for (Actor actor : this.listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if(listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() + " уже имеется!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() + " добавлен!");
        }
    }

    public void actorReplacement(Actor newActor, String surname) {
        for(int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).getSurname().equals(surname)) {
                Actor oldActor = listOfActors.set(i, newActor);
                System.out.println("По техническим обстоятельствам: " + oldActor.getSurname() + " не сможет выступать, " +
                        "поэтому его заменит " + newActor.getSurname());
                return;
            }
        }

        System.out.println("Актер с фамилией " + surname + " не найден в этом спектакле!");
    }

}


