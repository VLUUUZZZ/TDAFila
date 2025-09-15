public class Main {

    public static void main(String[] args) {
        System.out.println("--- Iniciando Simulación ---\n");

        fila printer = new fila();

        printer.addDocument("Reporte_Anual.pdf");
        printer.addDocument("Contrato_Cliente.docx");
        printer.addDocument("Diagrama_Arquitectura.png");

        printer.processNextDocument();

        printer.addDocument("Factura_Septiembre.xlsx");

        System.out.println("--- Simulación Finalizada ---");
    }
}