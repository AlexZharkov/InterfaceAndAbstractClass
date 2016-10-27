package InterfaceAndAbstractClass.Interface;

/**
 * Created by Андрей on 27.10.2016.
 */
public class TestDoctor {
    public static void main(String[] args) {



    Doctor doctor = new Surgeon("Alex", "New York");
    Doctor doctor2 = new NeuroSurgeon("Who", "Princeton");

        doctor.salary();
        doctor.timeWork();
        doctor.work();

        doctor2.salary();
        doctor2.timeWork();
        doctor2.work();


    }
}
