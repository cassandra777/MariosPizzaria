package studypoint1;

public class StudyPoint1 {

    public static void main(String[] args) {
        
      Garage garage = new Garage("Bilparken");
      BenzinBil bil1 = new BenzinBil(29847,"Peugeot","", 2016,5,92,10.7);
      BenzinBil bil2 = new BenzinBil(84728,"Audi","",2018,5,91,14.0);
      BenzinBil bil3 = new BenzinBil(23145,"Toyota Aygo","",2017,3,90, 15.7);
      
      DielselBil bil4 = new DielselBil(38475,"Skoda","",2012,5,true,14.9);
      DielselBil bil5 = new DielselBil(48392,"Renault","",2018,5,false, 16.3);
      DielselBil bil6 = new DielselBil(65923,"Mercedes Benz","",2017,5,false,19.2);
      
      ElBil bil7 = new ElBil(47023,"Hyundai","",2015,5,85.0,180,160);
      ElBil bil8 = new ElBil(51937,"BMW","",2018,5,95.0,190,200); 
      ElBil bil9 = new ElBil(76549,"Mazda","",2013,5,88.0,160,180);
      
      garage.tilføjBilTilBilparken(bil1);
      garage.tilføjBilTilBilparken(bil2);
      garage.tilføjBilTilBilparken(bil3);
      garage.tilføjBilTilBilparken(bil4);
      garage.tilføjBilTilBilparken(bil5);
      garage.tilføjBilTilBilparken(bil6);
      garage.tilføjBilTilBilparken(bil7);
      garage.tilføjBilTilBilparken(bil8);
      garage.tilføjBilTilBilparken(bil9);
      
        System.out.println(garage);
        System.out.print("Den samlede grønne afgift for bilerne i garagen er: ");
        System.out.println(garage.beregnGrønAfgiftForBilpark());
    } 
}
