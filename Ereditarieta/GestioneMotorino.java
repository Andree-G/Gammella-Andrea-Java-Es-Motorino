
package Ereditarieta;
public class GestioneMotorino
{
   public static void main(String[] args)
   {
     Motorino motorino = new Motorino ("Nero",10, "Ducati Panigale",false);
     {
        motorino.mostraDettagli();
        motorino.setVelocità(10);  
        System.out.println("Nuova velocità del motorino: " + motorino.getVelocità());
        motorino.accellera(20);
        motorino.mostraDettagli();
        motorino.acceleraSeAntifurtoNonAttivo(5);
        motorino.mostraDettagli();
        motorino.InserisciAntifurto();
     }
   }
}