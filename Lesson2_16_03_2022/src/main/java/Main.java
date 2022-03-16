public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("Размер: " + list.size());
        System.out.println("Элемент по индексу 2: " + list.get(2));
        System.out.print("Удален элемент с индексом 4: ");
        list.remove(4);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int temp = 111;
        System.out.print("Заменен элемент с индексом 0 на значение temp: ");
        System.out.println();
        list.replaceAt(0,temp);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
