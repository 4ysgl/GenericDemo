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
        liste.add(" demo");
        System.out.println("Size: " + liste.size());
        System.out.println("Capacity: " + liste.getCapacity());
        liste.print();
      //  liste.indexOf("aaa");  // GENERİC YAPI OLDUGU İÇİN LİSTEYE FARKLI VERİ TİPİNDE EKLEME YAPILABİLİYOR VEYA ARATILABİLİYORUZ
liste.clear();
liste.print();




    }
}
