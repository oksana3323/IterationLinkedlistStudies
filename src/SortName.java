import java.util.Comparator;

public class SortName implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName()==o2.getName()){
            return 0;
        }
        if (o1.getAge()<o2.getAge()){
            return -1;
        }
        return 1
                ;
    }
}
