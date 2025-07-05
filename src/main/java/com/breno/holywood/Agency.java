package com.breno.holywood;

public class Agency implements ReportReceiver {
    private final Reporter reporter; // NewsAgency holds a reference to Reporter

    // Constructor Injection: Agency "injects" itself into the Reporter
    // or rather, it provides the Reporter with an instance of ReportReceiver
    public Agency() {
        this.reporter = new Reporter(this); // Agency creates and passes itself
    }

    @Override
    public void receiveReport(String report) {
        System.out.println("Agency received: " + report);
    }

    // Agency 'calls' the reporter to get a report when needed
    public void requestReport(String event) {
        System.out.println("Agency is requesting a report for: " + event);
        reporter.doReportingWork(event); // Agency "calls" the reporter
    }
}
