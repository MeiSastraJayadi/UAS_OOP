public class Developer extends Pekerja{
    private int GajihperJam;
    protected int Lembur;

    protected int GetGajihperJam() {
        return this.GajihperJam;
    }

    public   int GetLembut() {
        return this.Lembur;
    }

    public void SetGajihperJam(int gjih) {
        this.GajihperJam = gjih;
    }

    private void HitungLembur() {
        if (this.GetJamkerja() > 120) {
            this.Lembur = this.GetJamkerja() - 120;
            this.SetJamKerja(120);
        }
        else {
            this.Lembur = 0;
        }
    }

    public void SetTotalGajih() {
        this.HitungLembur();
        int GajihLembur = this.Lembur * (this.GajihperJam + 15000);
        int Gajih = this.GetJamkerja() * this.GetGajihperJam();
        Gajih += GajihLembur;

        if(this.GetStatusMenikah()) {
            Gajih += 1500000;
        }

        super.SetTotalGajih(Gajih);
    }

}
