public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji() {
        return gaji + tunjangan;
    }

    public int infoTunjangan() {
        return tunjangan;
    }
}
