public static void main(String[] args) {
    InventarioProducto p = new InventarioProducto();

    p.mostrarReporte();

    System.out.println("\n--- ACTUALIZACIÓN ---");

    p.actualizarPrecio(95.00);
    p.actualizarStock(5);
    p.actualizarStockMinimo(6);

    p.mostrarReporte();

    System.out.println("\n--- CASO INVÁLIDO ---");

    p.actualizarStock(-3);
    p.actualizarStockMinimo(-2);

    p.mostrarReporte();
}
