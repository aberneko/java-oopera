import java.util.Arrays;
import java.util.Objects;

public class Actor extends Person{

    private final int height;


    public Actor( String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", getName(), getSurname(), height);
    }


}
