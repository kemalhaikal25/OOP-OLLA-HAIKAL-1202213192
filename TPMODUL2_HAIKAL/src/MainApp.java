public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat_ = new Perangkat("Kingston", 32, (float) 9.00);
        perangkat_.informasi();
        System.out.println("");

        System.out.println("---------HANDPHONE---------");
        Handphone handphone_ = new Handphone("V-Gen",64, (float) 7.00, true);
        handphone_.informasi();
        handphone_.telfon(628122335);
        handphone_.kirimSMS(628356836);
        handphone_.kirimSMS(629946934, 622457725);
        System.out.println("");

        System.out.println("----------LAPTOP----------");
        Laptop laptop = new Laptop("Team Xtreem",64, (float) 8.00, true);
        laptop.informasi();
        laptop.bukaGame("PES 2021");
        laptop.kirimEmail("kemalaja@gmail.com");
        laptop.Email("kemalolo28@gmail.com", "muhammadrizky@gmail.com");
        
    }
    
}