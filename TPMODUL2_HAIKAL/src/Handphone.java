public class Handphone extends Perangkat{
    protected boolean fingerprint;
    protected String punya;
    
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint=fingerprint;
    }
    @Override
    public void informasi(){
        if (fingerprint==true){
            punya = ("memiliki");
        }
        else if (fingerprint==false){
            punya = ("TIDAK memiliki");
        }
        System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" dan processor secepat "
        +processor+" Ghz. Selain itu handphone ini "+punya+ " Fingerprint");
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim sms ke No "+no_hp);
    }

    public void kirimSMS(int no_hp, int no_hp2){
        System.out.println("Handphone berhasil mengirim telfon ke No "+no_hp + " dan ke No "+no_hp2);
    }    

}