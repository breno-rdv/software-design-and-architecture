# Hollywood principal
The Hollywood Principle is a software development principle that states: "Don't call us, we'll call you." 
It suggests that high-level components should dictate the flow of control in an application, rather than low-level components.

## Explanation of how this demonstrates the Hollywood Principle:
"Don't call us...": Notice that the Reporter class do not create or directly interacts with Agency by instantiating it. It doesn't "call" the Agency to get its reporting done in a self-initiating way. Instead, it expects to be given a ReportReceiver.

"...we'll call you.": The Agency (the high-level component) is responsible for:
- Creating the Reporter instance.
- Injecting itself (as a ReportReceiver) into the Reporter.
- Calling the reporter.doReportingWork() method when it needs a report. The Agency is dictating when the Reporter should perform its function.
- This example uses Constructor Injection, a common form of Dependency Injection. The Reporter declares what it needs (ReportReceiver) through its constructor, and the Agency provides it. This adheres to the Hollywood Principle by inverting the control: the Reporter doesn't control when or how it reports; the Agency does.