package task_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Vlad on 24.10.2016.
 */
public class CollectionUtils {
    //public static<T> void addAll(List<? extends T> source, List<? super T> destination)
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    //public static <T> List<T> newArrayList()
    public static <T> List<T> newArrayList() {
        return new ArrayList<T>();
    }

    //public static <T> int indexOf(List<? extends T> source, T o)
    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }

    //public static <T> List<T> limit(List<? extends T> source, int size)
    public static <T> List<T> limit(List<? extends T> source, int size) {
        //return source.size();
        List<T> list = null;

        int newSize = 0;
        if (size < source.size()) {
            newSize = size;
        } else {
            System.out.println("Illeagal size!");
        }
        for (int i = 0; i < newSize; i++) {
            list.add(source.get(i));
        }
        return list;
    }

    //public static <T> void add(List<? super T> source, T o)
    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    //public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2)
    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    //public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2)
    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    //public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2)
    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (Object o : c2) {
            if (c1.contains(o)) {
                return true;
            }
        }
        return false;
    }

    //public static <T> List<T> range(List<? extends T> list, T min, T max)
    public static <T extends Comparable<? super T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> range = null;
        range.addAll(list);
        for (T t : range) {
            if (t.compareTo(min) < 0 || t.compareTo(max) > 0) {
                range.remove(t);
            }
        }
        return range;
    }

    //public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<T> comparator)
    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> range = null;
        range.addAll(list);
        for (T t : range) {
            if (comparator.compare(t, min) < 0 || comparator.compare(t, max) > 0) {
                range.remove(t);
            }
        }
        return range;
    }

}
