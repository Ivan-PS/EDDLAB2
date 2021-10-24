package apartado3;

import apartado3.Person;

import java.util.Iterator;

public class Comparisons{
    public static <E> void removeLower(Iterator<? extends Person> iterator, Person person) {
        while(iterator.hasNext()){
            if(person.compareTo(iterator.next()) > 0){
                iterator.remove();
            }
        }
    }


}
