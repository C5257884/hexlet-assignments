package exercise;

import java.util.Comparator;
import java.util.List;

class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        if (homes == null || count <= 0) {
            return List.of();
        }
        return homes.stream()
            .sorted(Comparator.comparingDouble(Home::getArea))
            .limit(Math.min(count, homes.size()))
            .map(Home::toString)
            .toList();
    }
}
// END
