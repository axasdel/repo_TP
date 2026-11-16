package bridge;

class SalesReport extends Report {
    SalesReport(Exporter e) { super(e); }
    void generate() { exporter.export("продажи: 1000"); }
}