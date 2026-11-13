package bridge;

class SalesReport extends Report {
    SalesReport(Exporter e) { super(e); }
    void generate() { exporter.export("Продажи: 1000"); }
}