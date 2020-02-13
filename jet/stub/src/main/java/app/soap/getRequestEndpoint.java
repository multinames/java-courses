package app.soap;


import com.mycompany.soapstub.CashOperationRs;
import com.mycompany.soapstub.ProcessCash;
import com.mycompany.soapstub.ProcessCashResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class getRequestEndpoint {

       private static final String NAMESPACE_URI = "http://soapstub.mycompany.com/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processCash")
    @ResponsePayload


    public ProcessCashResponse processCashResponse (@RequestPayload ProcessCash request) {

        ProcessCashResponse proc = new ProcessCashResponse();
        CashOperationRs cash = new CashOperationRs();

        cash.setDescription("success");
        cash.setStatuscode(1);
        proc.setReturn(cash);
        return proc;
    }


}

