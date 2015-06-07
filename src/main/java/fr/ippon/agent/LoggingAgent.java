package fr.ippon.agent;

import fr.ippon.agent.transformer.LoggingClassFileTransformer;

import java.lang.instrument.Instrumentation;

/**
 * Created by flopes on 04/06/2015.
 */
public class LoggingAgent {

    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("Entering premain method");
        instrumentation.addTransformer(new LoggingClassFileTransformer());
    }
}
