
public class Motorino
{
   private String colore;
   private double velocità;
   private String tipo;
   private boolean antifurto;

    public Motorino(String colore, double velocità, String tipo, boolean antifurto)
   {
       this.colore = colore;
       this.velocità = velocità;
       this.tipo = tipo;
       this.antifurto = antifurto;
   }
   public Motorino()
   {
    
   }

   public String getColore()
   {
       return colore;
   }
   public void setColore(String colore)
   {
       this.colore = colore;
   }

   public double getVelocità()
   {
       return velocità;
   }
   public void setVelocità(double velocità)
   {
        this.velocità = velocità;
   }

   public String getTipo()
   {
       return tipo;
   }
   public void setTipo(String tipo)
   {
       this.tipo = tipo;
   }

   public boolean getAntifurto()
   {
       return antifurto;
   }
   public void getAntifurto(boolean antifurto)
   {
       this.antifurto = antifurto;
   }

   public void accellera(double incremento)
   {
      velocità += incremento;
    }


   public void acceleraSeAntifurtoNonAttivo(double incremento)
   {
     if (!antifurto)
     {
        velocità += incremento;
        System.out.println("Velocità aumentata di " + incremento + " Velocità attuale: " + velocità);
     }
     else
     {
        System.out.println("Nessun incremento");
     }

   }

   public void InserisciAntifurto()
   {
        if (!antifurto)
        {
            antifurto = true;
            System.out.println("Antifurto attivato");
        }
        else
        {
            System.out.println("L'antifurto è gia presente");
        }
   }



   public void mostraDettagli()
   {
       System.out.println("Colore: " + colore + " velocità: " + velocità + " Tipo: " + tipo + " Antifurto " + antifurto);
}
}

