
import java.util.ArrayList;
import java.util.List;

class SuppressWarningsExample {
    static void addItem(List list, Object item) {
        try {
            @SuppressWarnings("unchecked")
            List<Object> tempList = list;
            tempList.add(item);
        } catch (Exception e) { }
    }
}
