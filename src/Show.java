import java.util.ArrayList;

public class Show {

    private String title; // название шоу
    private int duration; // длительность в минутах
    private Director director; // режиссёр
    private ArrayList<Actor> listOfActors; // список актеров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActorsList() {
        for (Actor actor : this.listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        if(listOfActors.equals(newActor)) {
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() + " уже имеется!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor.getName() + " " + newActor.getSurname() + " добавлен!");
        }
    }

    public void actorReplacement(Actor newActor, String surname) {
        if(listOfActors.equals(surname)) {
            System.out.println("Не тот спектаколь");
        }
    }

}


