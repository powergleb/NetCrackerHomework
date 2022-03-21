public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] { 2,21,1,1,1,2,2,3,2,1,2,23,1,231,2,1 };
        SorterStrategy sorting = new SorterStrategy(nums, new HeapSorter());
        sorting.Choose();
        sorting.Strategy = new SelectionSorter();
        sorting.Choose();
        sorting.Strategy = new InsertionSorter();
        sorting.Choose();
    }
}
