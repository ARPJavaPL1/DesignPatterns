package designpatterns.templatemethod.dataanalysis.algorithm;

public abstract class AnalysisFile {

    public void runAlgorithm(String filePath) {
        openFile(filePath);
        readFile();
        analyse();
        sendReport();
        close();
    }

    protected void openFile(String filePath) {
        System.out.println("open File");
    }

    protected abstract void readFile();

    protected void analyse() {
        System.out.println("analyse");
    }

    protected void sendReport() {
        System.out.println("send report");
    }

    protected void close() {
        System.out.println("close file");
    }
}
