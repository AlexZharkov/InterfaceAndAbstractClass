package InterfaceAndAbstractClass.Interface;


public class Surgeon implements Doctor{
    private  String name;
    private String branch;



    public Surgeon(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public void work() {
        System.out.println("I'm  surgeon , i work ! \n");

    }

    @Override
    public void timeWork() {
        System.out.println("I'm surgeon , my working hours 6a.m - 12 pm ");

    }

    @Override
    public  void salary(){
        System.out.println("I'm surgeon , my salary - 3500$");
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
