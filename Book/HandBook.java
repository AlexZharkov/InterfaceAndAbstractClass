package InterfaceAndAbstractClass;

/**
 * Created by Андрей on 26.10.2016.
 */
public class HandBook extends  Book {


    public HandBook(String name, int size) {
        super(name, size);
    }

    @Override
    public void cost() {
        System.out.println(name + "  cost - 50$");
    }

    @Override
    public void edition() {
        System.out.println( name + "  edition - First edition");

    }

    @Override
    public void editionData() {
        System.out.println( name +"  Edition Date - 26.10.2016");

    }

    @Override
    public void author() {
        System.out.println( name + "  author - Zharkov");

    }
}
