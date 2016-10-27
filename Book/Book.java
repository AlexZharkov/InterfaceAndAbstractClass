package InterfaceAndAbstractClass;

/**
 * Created by Андрей on 26.10.2016.
 */
public abstract class Book  implements Edition{

      String name;
      int size;

    public Book(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void cost();



    @Override
    public String toString() {
        return "Book" +
                " name " + name +
                " size " + size;
    }
}
