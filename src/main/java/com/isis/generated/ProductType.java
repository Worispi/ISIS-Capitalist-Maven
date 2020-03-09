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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour productType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="productType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cout" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="croissance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="revenu" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vitesse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeleft" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="managerUnlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="palliers" type="{}palliersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productType", propOrder = {
    "id",
    "name",
    "logo",
    "cout",
    "croissance",
    "revenu",
    "vitesse",
    "quantite",
    "timeleft",
    "managerUnlocked",
    "palliers"
})
public class ProductType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logo;
    protected double cout;
    protected double croissance;
    protected double revenu;
    protected int vitesse;
    protected int quantite;
    protected long timeleft;
    protected boolean managerUnlocked;
    @XmlElement(required = true)
    protected PalliersType palliers;

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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
     * Obtient la valeur de la propri�t� cout.
     * 
     */
    public double getCout() {
        return cout;
    }

    /**
     * D�finit la valeur de la propri�t� cout.
     * 
     */
    public void setCout(double value) {
        this.cout = value;
    }

    /**
     * Obtient la valeur de la propri�t� croissance.
     * 
     */
    public double getCroissance() {
        return croissance;
    }

    /**
     * D�finit la valeur de la propri�t� croissance.
     * 
     */
    public void setCroissance(double value) {
        this.croissance = value;
    }

    /**
     * Obtient la valeur de la propri�t� revenu.
     * 
     */
    public double getRevenu() {
        return revenu;
    }

    /**
     * D�finit la valeur de la propri�t� revenu.
     * 
     */
    public void setRevenu(double value) {
        this.revenu = value;
    }

    /**
     * Obtient la valeur de la propri�t� vitesse.
     * 
     */
    public int getVitesse() {
        return vitesse;
    }

    /**
     * D�finit la valeur de la propri�t� vitesse.
     * 
     */
    public void setVitesse(int value) {
        this.vitesse = value;
    }

    /**
     * Obtient la valeur de la propri�t� quantite.
     * 
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * D�finit la valeur de la propri�t� quantite.
     * 
     */
    public void setQuantite(int value) {
        this.quantite = value;
    }

    /**
     * Obtient la valeur de la propri�t� timeleft.
     * 
     */
    public long getTimeleft() {
        return timeleft;
    }

    /**
     * D�finit la valeur de la propri�t� timeleft.
     * 
     */
    public void setTimeleft(long value) {
        this.timeleft = value;
    }

    /**
     * Obtient la valeur de la propri�t� managerUnlocked.
     * 
     */
    public boolean isManagerUnlocked() {
        return managerUnlocked;
    }

    /**
     * D�finit la valeur de la propri�t� managerUnlocked.
     * 
     */
    public void setManagerUnlocked(boolean value) {
        this.managerUnlocked = value;
    }

    /**
     * Obtient la valeur de la propri�t� palliers.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getPalliers() {
        return palliers;
    }

    /**
     * D�finit la valeur de la propri�t� palliers.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setPalliers(PalliersType value) {
        this.palliers = value;
    }

}
