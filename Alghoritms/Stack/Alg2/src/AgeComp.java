import java.util.Comparator;

public class AgeComp implements Comparator<Minion> {
    @Override
    public int compare(Minion o1, Minion o2) {
        int result = o1.getEyes() + o1.getAge() - o2.getAge() - o2.getEyes();
        return result;


}}


