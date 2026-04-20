public class Main {
    public static void main(String[] args) {

        Producto p = new Producto(
                "PRD-105",
                "Disco SSD 1TB",
                "Almacenamiento",
                89.50,
                12,
                8
        );

        p.mostrarReporte();

        System.out.println("\n--- ACTUALIZACIÓN ---");
        p.actualizarPrecio(95.00);
        p.actualizarStock(5);

        p.mostrarReporte();

        System.out.println("\n--- CASO INVÁLIDO ---");
        p.actualizarStock(-3);

        p.mostrarReporte();
    }
}
