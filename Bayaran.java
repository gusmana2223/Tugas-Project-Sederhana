public class Bayaran {
    public int hitungbayaran(Pegawai peg) {
        int uang = peg.infoGaji();
        if (peg instanceof Manajer) {
            uang += ((Manajer) peg).infoTunjangan();
        } else if (peg instanceof Programmer) {
            uang += ((Programmer) peg).infoBonus();
        }
        return uang;
    }
}
