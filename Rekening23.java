import java.util.Scanner;

public class Rekening23 {
    private String noRekening;
    private String nama;
    private String namaIbu;
    private String phone;
    private String email;

    public Rekening23(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "No Rekening: " + noRekening +
               "\tNama: " + nama +
               "\tNama Ibu: " + namaIbu + 
               "\tPhone: " + phone +
               "\tEmail: " + email;
    }
}
