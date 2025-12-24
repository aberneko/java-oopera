public class Actor extends Person{

    private final int height;


    public Actor(Gender gender, String surname, String name, int height) {
        super(name, surname, gender);
        this.height = height;

    }

    public int getHeight() {
        return height;
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
    public String toString() {
        return super.getName() + " " + super.getSurname() + " (" + height + ")";
    }


}
