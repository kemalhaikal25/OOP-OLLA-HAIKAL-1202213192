public class Sampan extends TransportasiAir {
    protected int layar;
    protected String punya;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi "+jumlahKursi+
        "ditetapkan dengan biaya sebesar Rp "+biaya+"");
    }
    
    public void berlayar(){
        System.out.println("\nTransportasi Air jenis Sampan sedang berlayar menggunakan "+layar+" layar");
    }
    
    public void berlabuh(){
        System.out.println("\nTransportasi Air jenis Sampan berlabuh di laut tanpa jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("\nTransportasi Air jenis Sampan berlabuh di laut menggunakan "+jangkar+"");
    }
    
}