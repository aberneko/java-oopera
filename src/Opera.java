import java.util.ArrayList;

public class Opera extends MusicalShow{

    private final int choirSize; // Используем int для количества человек

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                     String musicAuthor, String librettoText, int choirSize) {
            super(title, duration, director, listOfActors, musicAuthor, librettoText);
            this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String getLibrettoText() {
        return super.getLibrettoText() + " Количество человек: " + choirSize;
    }
}
