import OOP.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cat cat= new Cat();
        cat.setGiongLoai("Meo");
        cat.setSoChan(4);
        cat.setLoaiThucAn("thit, rau, cu");
        cat.setMauLong("den");
        cat.getInfo(cat.getGiongLoai(), cat.getSoChan(), cat.getLoaiThucAn(), cat.getMauLong());
        cat.getInfoMove();
        cat.getWeight(6);
        cat.getSound("meomeo");
    }
}