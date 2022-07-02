package designpatterns.templatemethod.dataanalysis;

import designpatterns.templatemethod.dataanalysis.Client;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        client.doAnalysis("aa.doc");
    }
}
