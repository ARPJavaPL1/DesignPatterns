package designpatterns.templatemethod.dataanalysis;

import designpatterns.templatemethod.dataanalysis.algorithm.AnalysisFile;
import designpatterns.templatemethod.dataanalysis.algorithm.CsvFile;
import designpatterns.templatemethod.dataanalysis.algorithm.DocFile;
import designpatterns.templatemethod.dataanalysis.algorithm.PdfFile;

public class Client {

    public void doAnalysis(String file) {

        AnalysisFile analysisFile;
        // 1. jakie jest rozszerzenie pliku
        if (file.endsWith(".doc")) {
            analysisFile = new DocFile();
        } else if (file.endsWith(".pdf")) {
            analysisFile = new PdfFile();
        } else if (file.endsWith(".csv")) {
            analysisFile = new CsvFile();
        } else {
            throw new UnsupportedOperationException();
        }

        analysisFile.runAlgorithm(file);
    }
}
