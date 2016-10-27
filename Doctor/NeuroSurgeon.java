package InterfaceAndAbstractClass.Interface;

/**
 * Created by Андрей on 26.10.2016.
 */
public class NeuroSurgeon extends Surgeon {

    public NeuroSurgeon(String name, String branch) {
        super(name, branch);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getBranch() {
        return super.getBranch();
    }

    @Override
    public void work() {
        System.out.println("I'm  NeuroSurgeon , i work !");
    }

    @Override
    public void timeWork() {
        System.out.println("I'm NeuroSurgeon , my working hours 5a.m - 12 pm ");
    }

    @Override
    public void salary() {
        System.out.println("I'm NeuroSurgeon , my salary - 4000$");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
