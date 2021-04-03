package SistemInformasiAkademik.model;

public class Pegawai extends Person{
    private String nip;
    private int golongan;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public double getGaji(){
        if (golongan == 1){
            return 1000000;
        }else if (golongan == 2){
            return 2000000;
        }else if (golongan == 3){
            return 3000000;
        }
        return 0;
    }
    public double getAGaji(double tunjangan){
        return getGaji() + tunjangan;
    }
    public double getGaji(int lemburan){
        return getGaji() + lemburan;
    }
    public double getGaji ( double tunjangan, int lemburan){
        return getGaji() + tunjangan +lemburan;
    }
}