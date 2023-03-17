import java.util.ArrayList;

public class Cabaret {

    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer temp) {
        if (!performers.contains(temp)) {
            performers.add(temp);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer temp) {
        int idx = performers.indexOf(temp);
        if (idx != -1) {
            performers.remove(idx);
            return true;
        }
        return false;
    }

    public double averagePerformerAge() {
        int sum = 0;
        for (Performer performer : performers) {
            sum += performer.getAge();
        }
        return sum / (double) performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> temp = new ArrayList<>();
        for (Performer performer : performers) {
            if (performer.getAge() >= age) {
                temp.add(performer);
            }
        }
        return temp;
    }

    public void groupRehearsal() {
        for (Performer performer : performers) {
            System.out.println("REHEARSAL CALL! " + performer.getName());

            if (performer instanceof Comedian) {
                Comedian temp = (Comedian) performer;
                temp.rehearse(false);
            } else {
                performer.rehearse();
            }
        }
    }

    public void cabaretShow() {
        for (Performer performer : performers) {
            System.out.println("Welcome to the cabaret, next up is: " + performer.getName());

            if (performer instanceof Dancer) {
                Dancer temp = (Dancer) performer;
                temp.pirouette(2);
            }
            performer.perform();
        }
    }
}
