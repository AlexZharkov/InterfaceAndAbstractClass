package InterfaceAndAbstractClass;

/**
 * Created by Андрей on 26.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Book book = new HandBook("PhoneBook", 500);
        Book book2 = new Encyclopedia("Herbivorous", 1500);

        book.cost();
        book.author();
        book.edition();
        book.editionData();


        book2.cost();
        book2.author();
        book2.edition();
        book2.editionData();
    }
}
