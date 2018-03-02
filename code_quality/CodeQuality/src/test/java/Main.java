import static org.junit.Assert.*;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> my_list = new LinkedList<Integer>();

        my_list.pushFront(5);
        my_list.pushFront(7);
        my_list.pushFront(6);
        my_list.printSelf();
        System.out.println("List size = " + my_list.getSize());
        System.out.println("**************");

        my_list.insertElementAtIndex(9, 1);
        my_list.printSelf();
    }
}
