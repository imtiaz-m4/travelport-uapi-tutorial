package com.travelport.service.util_v38_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:39:24.399-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/util_v38_0", name = "BrandedFareSearchPortType")
@XmlSeeAlso({com.travelport.schema.util_v38_0.ObjectFactory.class, com.travelport.schema.common_v38_0.ObjectFactory.class, com.travelport.schema.air_v38_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BrandedFareSearchPortType {

    @WebResult(name = "BrandedFareSearchRsp", targetNamespace = "http://www.travelport.com/schema/util_v38_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/BrandedFareService")
    public com.travelport.schema.util_v38_0.BrandedFareSearchRsp service(
        @WebParam(partName = "parameters", name = "BrandedFareSearchReq", targetNamespace = "http://www.travelport.com/schema/util_v38_0")
        com.travelport.schema.util_v38_0.BrandedFareSearchReq parameters
    ) throws UtilFaultMessage;
}
