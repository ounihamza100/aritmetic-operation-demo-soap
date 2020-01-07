package com.uvt.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Hamza Ouni
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ArithmeticOperationsService {

    @WebMethod(operationName = "add")
    public Long add(String p, String p2);


}
