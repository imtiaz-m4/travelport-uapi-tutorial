
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.air_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T10:46:28.375-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirExchangeProcessPort",
                      targetNamespace = "http://www.travelport.com/service/air_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/air_v26_0/Air.wsdl",
                      endpointInterface = "com.travelport.service.air_v26_0.AirExchangeProcessPortType")
                      
public class AirExchangeProcessPortTypeImpl implements AirExchangeProcessPortType {

    private static final Logger LOG = Logger.getLogger(AirExchangeProcessPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.air_v26_0.AirExchangeProcessPortType#service(com.travelport.schema.air_v26_0.AirExchangeReq  parameters )*
     */
    public com.travelport.schema.air_v26_0.AirExchangeRsp service(com.travelport.schema.air_v26_0.AirExchangeReq parameters) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.air_v26_0.AirExchangeRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}