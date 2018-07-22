import containers.Container;
import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        ProductContainer mtv = new ProductContainerRecorder("kahvi", 10, 5);
        System.out.println(mtv);
        mtv.takeFromTheContainer(7);
        System.out.println(mtv);
    }

}
