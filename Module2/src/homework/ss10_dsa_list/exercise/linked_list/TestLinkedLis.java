package homework.ss10_dsa_list.exercise.linked_list;

public class TestLinkedLis {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);


        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
    }
}
