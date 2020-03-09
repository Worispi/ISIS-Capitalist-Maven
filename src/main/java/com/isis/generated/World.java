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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalangels" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activeangels" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="angelbonus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="products" type="{}productsType"/>
 *         &lt;element name="allunlocks" type="{}palliersType"/>
 *         &lt;element name="upgrades" type="{}palliersType"/>
 *         &lt;element name="angelupgrades" type="{}palliersType"/>
 *         &lt;element name="managers" type="{}palliersType"/>
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
    "name",
    "logo",
    "money",
    "score",
    "totalangels",
    "activeangels",
    "angelbonus",
    "lastupdate",
    "products",
    "allunlocks",
    "upgrades",
    "angelupgrades",
    "managers"
})
@XmlRootElement(name = "world")
public class World {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logo;
    protected double money;
    protected double score;
    protected double totalangels;
    protected double activeangels;
    protected int angelbonus;
    protected long lastupdate;
    @XmlElement(required = true)
    protected ProductsType products;
    @XmlElement(required = true)
    protected PalliersType allunlocks;
    @XmlElement(required = true)
    protected PalliersType upgrades;
    @XmlElement(required = true)
    protected PalliersType angelupgrades;
    @XmlElement(required = true)
    protected PalliersType managers;

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
     * Obtient la valeur de la propri�t� money.
     * 
     */
    public double getMoney() {
        return money;
    }

    /**
     * D�finit la valeur de la propri�t� money.
     * 
     */
    public void setMoney(double value) {
        this.money = value;
    }

    /**
     * Obtient la valeur de la propri�t� score.
     * 
     */
    public double getScore() {
        return score;
    }

    /**
     * D�finit la valeur de la propri�t� score.
     * 
     */
    public void setScore(double value) {
        this.score = value;
    }

    /**
     * Obtient la valeur de la propri�t� totalangels.
     * 
     */
    public double getTotalangels() {
        return totalangels;
    }

    /**
     * D�finit la valeur de la propri�t� totalangels.
     * 
     */
    public void setTotalangels(double value) {
        this.totalangels = value;
    }

    /**
     * Obtient la valeur de la propri�t� activeangels.
     * 
     */
    public double getActiveangels() {
        return activeangels;
    }

    /**
     * D�finit la valeur de la propri�t� activeangels.
     * 
     */
    public void setActiveangels(double value) {
        this.activeangels = value;
    }

    /**
     * Obtient la valeur de la propri�t� angelbonus.
     * 
     */
    public int getAngelbonus() {
        return angelbonus;
    }

    /**
     * D�finit la valeur de la propri�t� angelbonus.
     * 
     */
    public void setAngelbonus(int value) {
        this.angelbonus = value;
    }

    /**
     * Obtient la valeur de la propri�t� lastupdate.
     * 
     */
    public long getLastupdate() {
        return lastupdate;
    }

    /**
     * D�finit la valeur de la propri�t� lastupdate.
     * 
     */
    public void setLastupdate(long value) {
        this.lastupdate = value;
    }

    /**
     * Obtient la valeur de la propri�t� products.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProducts() {
        return products;
    }

    /**
     * D�finit la valeur de la propri�t� products.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProducts(ProductsType value) {
        this.products = value;
    }

    /**
     * Obtient la valeur de la propri�t� allunlocks.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getAllunlocks() {
        return allunlocks;
    }

    /**
     * D�finit la valeur de la propri�t� allunlocks.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setAllunlocks(PalliersType value) {
        this.allunlocks = value;
    }

    /**
     * Obtient la valeur de la propri�t� upgrades.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getUpgrades() {
        return upgrades;
    }

    /**
     * D�finit la valeur de la propri�t� upgrades.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setUpgrades(PalliersType value) {
        this.upgrades = value;
    }

    /**
     * Obtient la valeur de la propri�t� angelupgrades.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getAngelupgrades() {
        return angelupgrades;
    }

    /**
     * D�finit la valeur de la propri�t� angelupgrades.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setAngelupgrades(PalliersType value) {
        this.angelupgrades = value;
    }

    /**
     * Obtient la valeur de la propri�t� managers.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getManagers() {
        return managers;
    }

    /**
     * D�finit la valeur de la propri�t� managers.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setManagers(PalliersType value) {
        this.managers = value;
    }

}
