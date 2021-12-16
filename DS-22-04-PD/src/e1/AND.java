package e1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class AND extends Composition {


    public static List<Ticket> filter(List<Ticket> list1, List<Ticket> list2) {
        //ya que aquí concatenamos clasulas OR
        List<Ticket> listDef = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        Set<Ticket> set = new HashSet<>(listDef);
        listDef.clear();
        listDef.addAll(set);

        return listDef;
    }
}
