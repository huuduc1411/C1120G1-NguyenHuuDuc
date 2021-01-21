package bai10_Map_Tree_in_java.Bai_Tap.Luyen_Tap;

public class Comparator implements java.util.Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice()>o2.getPrice()){
            return 1;
        } else if (o1.getPrice()<o2.getPrice()){
            return -1;
        }else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
