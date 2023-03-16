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
}
