
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
 *         &lt;element name="TipoCambioDiaResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/>
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
    "tipoCambioDiaResult"
})
@XmlRootElement(name = "TipoCambioDiaResponse")
public class TipoCambioDiaResponse {

    @XmlElement(name = "TipoCambioDiaResult")
    protected InfoVariable tipoCambioDiaResult;

    /**
     * Obtém o valor da propriedade tipoCambioDiaResult.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getTipoCambioDiaResult() {
        return tipoCambioDiaResult;
    }

    /**
     * Define o valor da propriedade tipoCambioDiaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setTipoCambioDiaResult(InfoVariable value) {
        this.tipoCambioDiaResult = value;
    }

}
