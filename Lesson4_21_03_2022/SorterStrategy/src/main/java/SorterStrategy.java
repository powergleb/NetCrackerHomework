public class SorterStrategy {

    int[] mas;
    public Sorting Strategy;

    public SorterStrategy(int[] m, Sorting algorithm) {
        this.mas = m;
        this.Strategy = algorithm;
    }

    public void Choose() {
        Strategy.Sort(mas);
    }


}
