
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MealPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealPrefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength0to64">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attribute name="MealType" type="{http://www.opentravel.org/OTA/2003/05}MealType" />
 *       &lt;attribute name="FavoriteFood" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="Beverage" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPrefType", propOrder = {
    "value"
})
public class MealPrefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "MealType")
    protected MealType mealType;
    @XmlAttribute(name = "FavoriteFood")
    protected String favoriteFood;
    @XmlAttribute(name = "Beverage")
    protected String beverage;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link MealType }
     *     
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealType }
     *     
     */
    public void setMealType(MealType value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the favoriteFood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFavoriteFood() {
        return favoriteFood;
    }

    /**
     * Sets the value of the favoriteFood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFavoriteFood(String value) {
        this.favoriteFood = value;
    }

    /**
     * Gets the value of the beverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * Sets the value of the beverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeverage(String value) {
        this.beverage = value;
    }

    /**
     * Gets the value of the preferLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        return preferLevel;
    }

    /**
     * Sets the value of the preferLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}
