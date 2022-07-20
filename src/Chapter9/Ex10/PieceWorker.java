package Chapter9.Ex10;

public class PieceWorker extends Employee {

    public PieceWorker(String firstName, String lastName, int socialNumber) {
        super(firstName, lastName, socialNumber);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    public static void main(String[] args) {

        PieceWorker emp2 = new PieceWorker("Dan", "Topley", 896566);

        System.out.println(emp2.toString());


    }

}
