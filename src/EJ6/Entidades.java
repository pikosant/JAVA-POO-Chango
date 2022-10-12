
package EJ6;


public class Entidades {
    
  private String Cafetera;
  private int capacidadMaxima;
  private int   cantidadActual;

    public Entidades() {
    }

    public Entidades(String Cafetera, int capacidadMaxima, int cantidadActual) {
        this.Cafetera = Cafetera;
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public String getCafetera() {
        return Cafetera;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCafetera(String Cafetera) {
        this.Cafetera = Cafetera;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
  
  
}
