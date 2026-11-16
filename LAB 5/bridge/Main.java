package bridge;

public class Main {
    public static void main(String[] args) {
        Exporter pdf = new PdfExporter();
        Exporter csv = new CsvExporter();

        Report pdfReport = new SalesReport(pdf);
        Report csvReport = new SalesReport(csv);

        pdfReport.generate();
        csvReport.generate();
    }
}