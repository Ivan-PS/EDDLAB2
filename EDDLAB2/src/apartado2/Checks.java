package apartado2;

import java.util.Iterator;

public class Checks {
    public static <E> void removeIf(Iterator<E> it, Check<E> test)
    {
        while(it.hasNext()){
            if(test.test(it.next())) it.remove();
        }
    }
}
