package OOP;

public class Cat extends Animal implements IAnimal, IExtAnimal {
    @Override
    public void getInfo(String loai, int soChan, String loaiThucAn, String mauLong) {
        System.out.println("Thong tin ve loai dong vat:");
        System.out.println("Loai:" + loai + "\nMau Long" + mauLong + "\nThuc An:" + loaiThucAn + "\nSo chan:" + soChan);
    }

    @Override
    public void getSound(String soung) {
        System.out.println("\nTieng keu:" + soung);
    }

    @Override
    public void getInfoMove() {
        System.out.println("bdbfasnf");
    }

    @Override
    public void getWeight(double weight) {
        System.out.println("\nCan nang:" + weight + "kg");
    }
}
