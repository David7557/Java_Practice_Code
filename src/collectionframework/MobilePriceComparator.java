package collectionframework;

import java.util.Comparator;

public class MobilePriceComparator implements Comparator<Mobile> {
    @Override
    public  int compare(Mobile curObj, Mobile exObj){
       // return curObj.price.compareTo(exObj.price);
        return Double.compare(curObj.price, exObj.price);
    }
}
