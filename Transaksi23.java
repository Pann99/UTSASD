public class Transaksi23 {
    private String noRekening;
    private double saldo;
    private double saldoAwal;
    private double saldoAkhir;
    private String tanggalTransaksi;

    public Transaksi23(String noRekening, double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String toString() {
        return "No Rekening: " + noRekening +
               "\tSaldo: " + saldo +
               "\tSaldoAwal: " + saldoAwal +
               "\tSaldoAkhir: " + saldoAkhir +
               "\tTanggal Transaksi: " + tanggalTransaksi;
    }
}
