package com.uvt.jaxws.server;

import javax.jws.WebService;

/**
 * @author Hamza Ouni
 */
@WebService(endpointInterface = " com.uvt.jaxws.server.ArithmeticOperationsService", portName = "ArithmeticOperationsPort")
public class ArithmeticOperationsServiceImpl implements ArithmeticOperationsService {

    @Override
    public Long add(String p1, String p2) {
        Long r1 = Long.valueOf(p1);
        Long r2 = Long.valueOf(p2);
        return r1 + r2;
    }
}
