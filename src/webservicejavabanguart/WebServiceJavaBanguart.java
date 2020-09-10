/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicejavabanguart;

import java.net.URL;
import javax.xml.namespace.QName;

import gt.gob.banguat.variables.ws.TipoCambioSoap;
import javax.xml.ws.Service;

/**
 *
 * @author Job
 */
public class WebServiceJavaBanguart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.banguat.gob.gt/variables/ws/TipoCambio.asmx?WSDL");
        QName qname = new QName("http://www.banguat.gob.gt/variables/ws/", "TipoCambio");
        
        Service service = Service.create(url,qname); 
        
        TipoCambioSoap receptorCliente=service.getPort(TipoCambioSoap.class);
        
        String cambio = receptorCliente.tipoCambioDiaString();        
        System.out.println("cambio:" +cambio);
        
    }
    
}
