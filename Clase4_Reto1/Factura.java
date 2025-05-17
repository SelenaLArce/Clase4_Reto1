package Clase4_Reto1;

// Clase que representa una factura
public class Factura {

    // Atributos
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros para inicializar todos los campos
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString para representar el objeto 
    @Override
    public String toString() {
        return "Factura [folio: " + folio + ", cliente: " + cliente + ", total: $" + total + "]";
    }

    // Si dos facturas tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); 
        
        // Comparar solo el folio
    }

    // hashCode y equals
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
