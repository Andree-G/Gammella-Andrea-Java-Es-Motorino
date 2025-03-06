public class GestioneMotorino
{
   public static void main(String[] args)
   {
     Motorino motorino = new Motorino("Nero", 10, "Ducati Panigale", false);
     
     motorino.mostraDettagli();
     motorino.setVelocità(10);  
     System.out.println("Nuova velocità del motorino: " + motorino.getVelocità());
     motorino.accellera(90);
     motorino.mostraDettagli();
     motorino.acceleraSeAntifurtoNonAttivo(5);
     motorino.mostraDettagli();
     motorino.InserisciAntifurto();

     MotorinoImmatricolato motorinoImmatricolato = new MotorinoImmatricolato("Nero", 72, "Ducati Panigale", false, 100, "AILJK");
     
     motorinoImmatricolato.mostraDettagli();

     motorinoImmatricolato.accellera(30);
     motorinoImmatricolato.mostraDettagli();
   }
}
