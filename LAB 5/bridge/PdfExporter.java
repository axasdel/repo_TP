package bridge;

class PdfExporter implements Exporter {
    public void export(String d) { System.out.println("PDF: " + d); }
}