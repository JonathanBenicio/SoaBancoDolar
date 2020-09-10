
package gt.gob.banguat.variables.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVarDolar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVarDolar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VarDolar" type="{http://www.banguat.gob.gt/variables/ws/}VarDolar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVarDolar", propOrder = {
    "varDolar"
})
public class ArrayOfVarDolar {

    @XmlElement(name = "VarDolar", nillable = true)
    protected List<VarDolar> varDolar;

    /**
     * Gets the value of the varDolar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varDolar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarDolar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VarDolar }
     * 
     * 
     */
    public List<VarDolar> getVarDolar() {
        if (varDolar == null) {
            varDolar = new ArrayList<VarDolar>();
        }
        return this.varDolar;
    }

}
