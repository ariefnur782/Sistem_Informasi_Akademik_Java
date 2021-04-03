package SistemInformasiAkademik.model;

public class Dosen extends Person {
    private String nip;
    private double gaji;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    @Override
    public void aktivitas(){
        System.out.println("Mengajar");
    }
}
