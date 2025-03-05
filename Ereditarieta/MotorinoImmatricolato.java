package Ereditarieta;
import Ereditarieta.Motorino;

public class MotorinoImmatricolato extends Motorino
{
    private double Maxvelocita;
    private String targa;

    public MotorinoImmatricolato(String colore, double velocità, String tipo, boolean antifurto, double Maxvelocita, String targa)
   {
       super(colore, velocità, tipo, antifurto);
       this.Maxvelocita = Maxvelocita;
       this.targa = targa;

   }

   public double GetMaxVelocita()
   {
     return Maxvelocita;
   }
   public void SetMaxVelocita(double Maxvelocita)
   {
        this.Maxvelocita = Maxvelocita;
   }

   public String GetTarga()
   {
     return targa;
   }
   public void SetTarga(String targa)
   {
        this.targa = targa;
   }
}

