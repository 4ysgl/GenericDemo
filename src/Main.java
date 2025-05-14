//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
MyList liste = new MyList();


        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
    System.out.println("Size: " + liste.size());
    System.out.println("Capacity: " + liste.getCapacity());
    liste.print();
        liste.add(33);
        liste.add(5);
        liste.add(2);
        liste.add(90);
        liste.add(2);
        liste.add(10);
        System.out.println("Size: " + liste.size());
        System.out.println("Capacity: " + liste.getCapacity());
        liste.print();

}
    }
