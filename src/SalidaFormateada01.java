/**
 * Salida formateada
 *
 * @author Francisco M.C.M.
 */
public class SalidaFormateada01 {
    public static void main(String[] args) {
        System.out.printf("El número %d no tiene decimales.\n", 21);
        System.out.printf("El número %f sale con decimales.\n",  21.0);
        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
        System.out.println("-----------------------------------------");
        System.out.println("  Artículo      Precio/caja    Nº cajas");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s      %8.2f      %6d\n",  "manzanas", 4.5, 10);
        System.out.printf("%-10s      %8.2f      %6d\n",  "peras", 2.75, 120);
        System.out.printf("%-10s      %8.2f      %6d\n",  "aguacates", 10.0, 6);
    }
}