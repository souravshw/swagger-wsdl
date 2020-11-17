package com.globalss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "globalsoft-adapter", portName = "globalsoft-adapter", serviceName = "globalsoft-adapter")
public class DNB_DIRECT_PLUS {


    @WebMethod
    @WebResult(name = "EnrichCompanyProfileResponse")
    public EnrichCompanyProfileResponse EnrichCompanyProfile(
            @WebParam(name = "EnrichCompanyProfileRequest") EnrichCompanyProfileRequest EnrichCompanyProfileRequest) {
      return null;
    }

}
