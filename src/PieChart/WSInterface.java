
package PieChart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS-Interface", targetNamespace = "http://schemas.hu.fnt.nl/berichten/message")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param request
     * @return
     *     returns PieChart.Response
     */
    @WebMethod
    @WebResult(name = "powerresponse", targetNamespace = "http://schemas.hu.fnt.nl/berichten/response", partName = "response")
    public Response calculatePower(
        @WebParam(name = "powerrequest", targetNamespace = "http://schemas.hu.fnt.nl/berichten/request", partName = "request")
        Request request);

}
