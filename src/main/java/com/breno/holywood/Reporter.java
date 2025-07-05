package com.breno.holywood;

public class Reporter {
    private ReportReceiver reportReceiver;

    // Constructor Injection: NewsAgency "injects" the ReportReceiver into Reporter
    public Reporter(ReportReceiver reportReceiver) {
        this.reportReceiver = reportReceiver;
    }

    // This method is called by the high-level component (NewsAgency)
    public void doReportingWork(String event) {
        String report = "Report from Reporter about: " + event;
        reportReceiver.receiveReport(report); // Reporter now calls the injected receiver
    }
}
