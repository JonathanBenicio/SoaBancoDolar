
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoCambioFechaInicialResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioFechaInicialResult"
})
@XmlRootElement(name = "TipoCambioFechaInicialResponse")
public class TipoCambioFechaInicialResponse {

    @XmlElement(name = "TipoCambioFechaInicialResult")
    protected DataVariable tipoCambioFechaInicialResult;

    /**
     * Obtém o valor da propriedade tipoCambioFechaInicialResult.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioFechaInicialResult() {
        return tipoCambioFechaInicialResult;
    }

    /**
     * Define o valor da propriedade tipoCambioFechaInicialResult.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioFechaInicialResult(DataVariable value) {
        this.tipoCambioFechaInicialResult = value;
    }

}
