public class Kapal extends TransportasiAir{
    protected String mesin;
    protected String punya;
    
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin=mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi "+jumlahKursi+
        "ditetapkan dengan biaya sebesar Rp "+biaya+"");
    }

    public void telfon(int no_hp){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+mesin+
        "");
    }
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke No "+no_hp);
    }

    public void kirimSMS(int no_hp, int no_hp2){
        System.out.println("Handphone berhasil mengirim telfon ke No "+no_hp + " dan ke No "+no_hp2);
    }    

}