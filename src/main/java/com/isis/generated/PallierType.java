//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.02.27 � 10:00:11 AM CET 
//


package com.isis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pallierType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pallierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seuil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idcible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ratio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="typeratio" type="{}typeratioType"/>
 *         &lt;element name="unlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pallierType", propOrder = {
    "name",
    "logo",
    "seuil",
    "idcible",
    "ratio",
    "typeratio",
    "unlocked"
})
public class PallierType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logo;
    protected int seuil;
    protected int idcible;
    protected double ratio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TyperatioType typeratio;
    protected boolean unlocked;

    /**
     * Obtient la valeur de la propri�t� name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� logo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * D�finit la valeur de la propri�t� logo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Obtient la valeur de la propri�t� seuil.
     * 
     */
    public int getSeuil() {
        return seuil;
    }

    /**
     * D�finit la valeur de la propri�t� seuil.
     * 
     */
    public void setSeuil(int value) {
        this.seuil = value;
    }

    /**
     * Obtient la valeur de la propri�t� idcible.
     * 
     */
    public int getIdcible() {
        return idcible;
    }

    /**
     * D�finit la valeur de la propri�t� idcible.
     * 
     */
    public void setIdcible(int value) {
        this.idcible = value;
    }

    /**
     * Obtient la valeur de la propri�t� ratio.
     * 
     */
    public double getRatio() {
        return ratio;
    }

    /**
     * D�finit la valeur de la propri�t� ratio.
     * 
     */
    public void setRatio(double value) {
        this.ratio = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeratio.
     * 
     * @return
     *     possible object is
     *     {@link TyperatioType }
     *     
     */
    public TyperatioType getTyperatio() {
        return typeratio;
    }

    /**
     * D�finit la valeur de la propri�t� typeratio.
     * 
     * @param value
     *     allowed object is
     *     {@link TyperatioType }
     *     
     */
    public void setTyperatio(TyperatioType value) {
        this.typeratio = value;
    }

    /**
     * Obtient la valeur de la propri�t� unlocked.
     * 
     */
    public boolean isUnlocked() {
        return unlocked;
    }

    /**
     * D�finit la valeur de la propri�t� unlocked.
     * 
     */
    public void setUnlocked(boolean value) {
        this.unlocked = value;
    }

}
