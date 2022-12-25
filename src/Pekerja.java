public class Pekerja extends Gajih{
    private String Nama;
    private int Umur;
    private boolean Menikah;
    private int JamKerja;

    public void SetNama(String nama) {
        this.Nama = nama;
    }

    public void SetUmur(int umur) {
        this.Umur = umur;
    }

    public void SetMenikah(boolean status) {
        this.Menikah = status;
    }

    public void SetJamKerja(int jam) {
        this.JamKerja = jam;
    }

    public String GetNama() {
        return this.Nama;
    }

    public int GetUmur() {
        return this.Umur;
    }

    public boolean GetStatusMenikah() {
        return this.Menikah;
    }

    public int GetJamkerja() {
        return this.JamKerja;
    }
}
