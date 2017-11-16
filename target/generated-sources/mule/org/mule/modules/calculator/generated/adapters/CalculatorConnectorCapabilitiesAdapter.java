
package org.mule.modules.calculator.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.calculator.CalculatorConnector;


/**
 * A <code>CalculatorConnectorCapabilitiesAdapter</code> is a wrapper around {@link CalculatorConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-17T01:40:52+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class CalculatorConnectorCapabilitiesAdapter
    extends CalculatorConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
