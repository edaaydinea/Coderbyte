import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.Objects;


public class ArrayCouples {

    public static String arrayCouples(int[] arr) {
        // code goes here
        Set<Pair> pairSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i += 2){
            pairSet.add(new Pair(arr[i], arr[i + 1]));
        }

        Set<Pair> setWithoudReversedPair = pairSet.stream()
                .filter(pair -> !pairSet.contains(new Pair(pair.getY(), pair.getX())) || pair.getX() == pair.getY())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        return setWithoudReversedPair.isEmpty() ? "yes" : buildStringFromSet(setWithoudReversedPair);
    }

    private static String buildStringFromSet(Set<Pair> set) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Pair pair : set) {
            stringBuilder.append(pair.getX());
            stringBuilder.append(",");
            stringBuilder.append(pair.getY());
            stringBuilder.append(",");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() -1).toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(arrayCouples(s.nextLine()));
    }

}

class Pair {
    private int x,y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public boolean equals(Object object1) {
        if (this == object1) return true;
        if (object1 == null || getClass() != object1.getClass()) return false;
        Pair pair = (Pair) object1;
        return x == pair.x && y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
