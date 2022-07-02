package designpatterns.templatemethod.dataanalysis.algorithm;

public class DocFile extends AnalysisFile {

    @Override
    public void readFile() {
        System.out.println("read file " + getClass().getSimpleName());
    }
}
