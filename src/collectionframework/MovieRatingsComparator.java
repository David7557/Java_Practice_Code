package collectionframework;

import java.util.Comparator;

public class MovieRatingsComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie currObj, Movie exisObj){
        return Double.compare(currObj.ratings, exisObj.ratings);
        //return currObj.ratings.compareTo(exisObj.ratings);
    }
}
