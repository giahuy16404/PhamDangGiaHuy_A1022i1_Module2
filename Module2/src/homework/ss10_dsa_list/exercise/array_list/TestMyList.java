package homework.ss10_dsa_list.exercise.array_list;


public class TestMyList {
    public static void main(String[] args) {
        Mylist mylist = new Mylist();
        mylist.add(0);
        mylist.add(1);

        mylist.add(3);
        mylist.add(4);
        mylist.add(5);

        mylist.add(7);
        mylist.add(8);
        mylist.add(2,2);
        mylist.add(6,6);
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.indexOf(2));
        System.out.println(mylist.contains(3));

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
