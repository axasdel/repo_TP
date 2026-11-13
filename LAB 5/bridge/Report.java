package bridge;

abstract class Report {
    protected Exporter exporter;
    Report(Exporter e) { this.exporter = e; }
    abstract void generate();
}