package Crystalshard.CatEars.adapter.spark;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionEnvelope {
    private String message;
    private String stackTrace;

    public static ExceptionEnvelope of(Exception exception) {
        StringWriter sw = new StringWriter();
        exception.printStackTrace(new PrintWriter(sw));
        return new ExceptionEnvelope(exception.getMessage(), sw.toString());
    }

    private ExceptionEnvelope(String message, String stackTrace) {
        this.message = message;
        this.stackTrace = stackTrace;
    }
}
