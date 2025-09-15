import java.util.LinkedList;
import java.util.Queue;

public class fila {

    private final Queue<String> documents = new LinkedList<>();

    public void addDocument(String documentName) {
        documents.offer(documentName);
        System.out.println(" Documento agregado: \"" + documentName + "\"");
        displayCurrentStatus();
    }

    public void processNextDocument() {
        String processedDocument = documents.poll();
        if (processedDocument != null) {
            System.out.println(" Imprimiendo: \"" + processedDocument + "\"");
        } else {
            System.out.println(" No hay documentos para imprimir.");
        }
        displayCurrentStatus();
    }

    public void displayCurrentStatus() {
        if (documents.isEmpty()) {
            System.out.println(" Estado: La cola está vacía.\n");
        } else {
            System.out.println(" Estado: " + documents + "\n");
        }
    }
}