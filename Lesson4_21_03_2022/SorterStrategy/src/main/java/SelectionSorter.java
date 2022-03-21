public class SelectionSorter implements Sorting{
    public void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.print("Selection Sort: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
