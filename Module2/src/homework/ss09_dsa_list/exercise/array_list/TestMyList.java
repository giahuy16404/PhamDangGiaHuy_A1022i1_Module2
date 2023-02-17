package homework.ss09_dsa_list.exercise.array_list;

public class TestMyList {
    public static void main(String[] args) {
        Mylist mylist = new Mylist();
        mylist.add(0);
        mylist.add(1);
        mylist.add(3);
        mylist.add(2, 2);
        mylist.remove(2);

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
