package SistemInformasiAkademik;

import SistemInformasiAkademik.model.Dosen;
import SistemInformasiAkademik.model.Mahasiswa;
import SistemInformasiAkademik.model.Pegawai;

public class SistemInformasiAkademik {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNama("Muhammad Arif Nur AE");
        mhs.setNim("402019611022");

        System.out.println("Mahasiswa 1");
        System.out.println("Aktivitas ");
        mhs.aktivitas();
        System.out.println("Nim : "+ mhs.getNim());
        System.out.println("Nama : "+ mhs.getNama());
        System.out.println("");

        mhs = new Mahasiswa();

        mhs.setNama("Angga");
        mhs.setNim("402019611031");

        System.out.println("Mahasiswa 2");
        System.out.println("Aktivitas ");
        mhs.aktivitas();
        System.out.println("Nim :" + mhs.getNim());
        System.out.println("Nama :" + mhs.getNama());
        System.out.println("");

        Dosen dosen = new Dosen();

        dosen.setNip("011");
        dosen.setNama("aku");
        dosen.setGaji(1000000);

        System.out.println("dosen 1");
        System.out.println("Aktivitas ");
        dosen.aktivitas();
        System.out.println("Nip :"+ dosen.getNip());
        System.out.println("Nama: " + dosen.getNama());
        System.out.println("Gaji :" + dosen.getGaji());
        System.out.println("");
        System.out.println("===============");
        System.out.println("");

        dosen = new Dosen();

        dosen.setNip("021");
        dosen.setNama("HOree");
        dosen.setGaji(9000000);

        System.out.println("Dosen 2");
        dosen.aktivitas();
        System.out.println("Nip :" + dosen.getNip());
        System.out.println("Nama : "+ dosen.getNama());
        System.out.println("Gaji : "+ dosen.getGaji());
        System.out.println("");
        System.out.println("=======================");

        Pegawai pegawai = new Pegawai();
        pegawai.setNama("Muhammad Arif ");
        pegawai.setAlamat("Makassar");
        pegawai.setNip("222");
        pegawai.setGolongan(2);

        System.out.println("Pegawai 1");
        System.out.println("Aktivitas:");
        pegawai.aktivitas();
        System.out.println("Nip:" + pegawai.getNip());
        System.out.println("Nama : " + pegawai.getNama());
        System.out.println("Alamat :" + pegawai.getAlamat());
        System.out.println("Golongan :" + pegawai.getGolongan());
        System.out.println("Gaji : "+ pegawai.getGaji());
        System.out.println("Gaji + Tunjangan + Lemburan = " + pegawai.getGaji(500000,250000));
        System.out.println("");
        System.out.println("===================");

    }
}
