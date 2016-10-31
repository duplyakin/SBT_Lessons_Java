package task_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vlad on 31.10.2016.
 */
public class CountMapImpl<E> implements CountMap<E> {
    private final Map<E, Integer> countMap;

    public CountMapImpl() {
        this.countMap = new HashMap<E, Integer>();
    }

    @Override
    public void add(E o) {
        add(o,1);
    }


    private void add(E o, int cnt) {
        if (!countMap.containsKey(o)) {
            countMap.put(o, cnt);
        } else {
            countMap.put(o, countMap.get(o) + cnt);
        }
    }


    @Override
    public int getCount(E o) {
        if (countMap.containsKey(o)) {
            return countMap.get(o);
        } else {
            return 0;
        }
    }

    @Override
    public int remove(E o) {
        if (countMap.containsKey(0)) {
            int n = countMap.get(o);
            countMap.remove(o);
            return n;
        } else {
            System.err.println("No such element in map!");
            return 0;
        }
    }

    @Override
    public int size() {
        return countMap.size();
    }

    @Override
    public void addAll(CountMap<? super E> source) {
        Map<E,Integer> cm = (Map<E, Integer>) source.toMap();
        for (E e : cm.keySet()) {
            add(e,cm.get(e));
        }
    }

    @Override
    public Map<E, Integer> toMap() {
        Map<E, Integer> newCountMap = new HashMap<E, Integer>();
        toMap(newCountMap);
        return newCountMap;
    }

    @Override
    public void toMap(Map<E, Integer> destination) {
        destination.putAll(countMap);
    }


    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int count = map.getCount(5); // 2
        System.out.println("1:" + count);
        count = map.getCount(6); // 1
        System.out.println("2:" + count);
        count = map.getCount(10); // 3
        System.out.println("3:" + count);

    }
}
