package Arrays;

import java.util.*;
public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> valToIndex;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        valToIndex = new HashMap<>();
        rand = new Random();

    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }

        list.add(val);
        valToIndex.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }

        Integer indexToRemove = valToIndex.get(val);
        Integer lastVal = list.get(list.size() - 1);

        list.set(indexToRemove, lastVal);
        valToIndex.put(lastVal, indexToRemove);

        list.remove(list.size() - 1);

        valToIndex.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }

    public static void main(String[] args) {
        RandomizedSet rs = new RandomizedSet();
        System.out.println(rs.insert(1));
        System.out.println(rs.remove(2));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
        System.out.println(rs.remove(1));
        System.out.println(rs.insert(2));
        System.out.println(rs.getRandom());
    }
}
