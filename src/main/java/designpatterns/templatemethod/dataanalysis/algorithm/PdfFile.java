package designpatterns.templatemethod.dataanalysis.algorithm;

public class PdfFile extends AnalysisFile {

    @Override
    public void readFile() {
        System.out.println("read file " + getClass().getSimpleName());
    }
}
