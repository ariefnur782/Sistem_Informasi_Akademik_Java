package SistemInformasiAkademik.model;

public class Mahasiswa extends Person{
    private String nim;

    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }

    @Override
    public void aktivitas(){
        System.out.println("Belajar");
    }

    }



