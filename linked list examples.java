import java.util.LinkedList;

public class Class721 {
    public static void main(String[] args) {
        // {5, 4, 3, 6, 7}

        // {value: 5 next: 1} -> {value: 8 next: 2} -> {value: 4 next: null}

        // ArrayLists are faster at searching and sorting
        // Linked Lists are faster at adding and removing data

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(5);
        linked.add(7);
        linked.add(3);
        linked.addFirst(10);
        System.out.println(linked.toString());
        linked.add(1, 2);
        System.out.println(linked.toString());
        linked.set(4, 53);
        System.out.println(linked.toString());
    }
