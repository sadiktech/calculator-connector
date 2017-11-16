
package org.mule.modules.calculator.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.calculator.CalculatorConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>CalculatorConnectorProcessAdapter</code> is a wrapper around {@link CalculatorConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-17T01:40:52+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class CalculatorConnectorProcessAdapter
    extends CalculatorConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<CalculatorConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, CalculatorConnectorCapabilitiesAdapter> getProcessTemplate() {
        final CalculatorConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,CalculatorConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, CalculatorConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, CalculatorConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
