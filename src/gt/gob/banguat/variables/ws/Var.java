
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Var complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Var">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="venta" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="compra" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Var", propOrder = {
    "moneda",
    "fecha",
    "venta",
    "compra"
})
public class Var {

    protected int moneda;
    protected String fecha;
    protected float venta;
    protected float compra;

    /**
     * Obtém o valor da propriedade moneda.
     * 
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Define o valor da propriedade moneda.
     * 
     */
    public void setMoneda(int value) {
        this.moneda = value;
    }

    /**
     * Obtém o valor da propriedade fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define o valor da propriedade fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtém o valor da propriedade venta.
     * 
     */
    public float getVenta() {
        return venta;
    }

    /**
     * Define o valor da propriedade venta.
     * 
     */
    public void setVenta(float value) {
        this.venta = value;
    }

    /**
     * Obtém o valor da propriedade compra.
     * 
     */
    public float getCompra() {
        return compra;
    }

    /**
     * Define o valor da propriedade compra.
     * 
     */
    public void setCompra(float value) {
        this.compra = value;
    }

}
