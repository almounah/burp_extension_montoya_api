package myextension;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.logging.Logging;

/**
 * HttpModifier
 */
public class HttpModifier implements BurpExtension {
    
    @Override
    public void initialize(MontoyaApi api) {
        Logging logging = api.logging();
        logging.logToOutput("Hello output.");
    }
    
}
