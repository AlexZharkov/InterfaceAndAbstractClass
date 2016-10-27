package InterfaceAndAbstractClass;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Андрей on 26.10.2016.
 */
public class Encyclopedia extends  Book {

    public Encyclopedia(String name, int size) {
        super(name, size);
    }

    @Override
    public void edition() {
        System.out.println(name + "  second edition");

    }

    @Override
    public void editionData() {
        System.out.println(name + "  Edition Date - 25.10.2016 ");
    }

    @Override
    public void author() {
        System.out.println(name + "  author - Zharkov A.");
    }

    @Override
    public void cost() {
        System.out.println(name + "  cost - 350$");

    }
}
