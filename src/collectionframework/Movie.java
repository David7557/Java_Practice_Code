package collectionframework;

public class Movie {
    String name;
    double ratings;

    Movie(String name, double ratings){
        this.name = name;
        this.ratings = ratings;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Ratings: "+ratings;
    }

   /* @Override
    public int compareTo(Movie m){
        return Double.compare(this.ratings, m.ratings);
    }*/
}

