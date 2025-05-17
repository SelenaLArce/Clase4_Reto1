package Clase4_Reto1;

public class Main {
    public static void main(String[] args) {

        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("ABC005", "Selena López", 1050.00);
        Factura f2 = new Factura("ABC006", "Selena López", 1050.00);

        // Ambas facturas
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
