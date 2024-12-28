package collectionframework;

import java.util.Set;
import java.util.TreeMap;

public class MovieMainClass {
    public static void main(String[] args) {
        Movie m1 = new Movie("PK", 9.0);
        Movie m2 = new Movie("Kantara", 8.8);
        Movie m3 = new Movie("daman", 9.5);
        Movie m4 = new Movie("Bahubali", 8.0);

        TreeMap<Movie, String> map = new TreeMap<>(new MovieRatingsComparator());
        map.put(m1, "Watched");
        map.put(m2, "Watched");
        map.put(m3, "Not Watched");
        map.put(m4, "Watched");

        Set<Movie> keys = map.keySet();
        for(Movie key: keys){
            System.out.println(key+" Watch List: "+map.get(key));
        }
    }
}
