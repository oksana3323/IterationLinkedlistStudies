import java.util.*;

public class Main {


    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Ainura", 18));
        people.add(new Person("Oksana", 25));
        people.add(new Person("Ruslan", 15));
        System.out.println(people);

        Collections.sort(people,new SortName());
        Collections.sort(people,new SortName2());


        for (Person person:people){
    System.out.println(person.getName()+ " " +person.getAge());
}

    }
}





/* LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(123);
        linkedList.add(123);
        linkedList.add(123);
        linkedList.add(123);
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
         LinkedList<Integer> linkedList1=new LinkedList<>();
linkedList1.add(123);
linkedList1.add(123);
linkedList1.add(123);
linkedList1.add(123);
        for (int i = 0; i < linkedList1.size(); i++) {
            System.out.println(linkedList1.get(i));/*











      /*  LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(123);
        linkedList.add(123);
        linkedList.add(123);
        linkedList.add(123);
        for (int elem:linkedList);{
            System.out.println("elem");*/


 /*   ArrayList<Studen>studens=new ArrayList<>();
          studens.add(new Studen("Samat",26));
          studens.add(new Studen("Oksan",10));
          studens.add(new Studen("Ainura",19));

          Collections.sort(studens);

        System.out.println(studens);*/



