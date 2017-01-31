package net.thoughtforge.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(
		name="Person",
		namespace="http://thoughtforge.net/model")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Person implements Serializable {

	private static final long serialVersionUID = 8465162879793776395L;

	@XmlElement(namespace="http://thoughtforge.net/model")
	private Calendar dateOfBirth;
	
	@XmlElement(namespace="http://thoughtforge.net/model")
	private String firstName;
	
	@XmlElement(namespace="http://thoughtforge.net/model")
	private BigDecimal height;
	
	@XmlElement(namespace="http://thoughtforge.net/model")
	private String lastName;
	
	@XmlElement(namespace="http://thoughtforge.net/model")
	private BigDecimal weight;

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
}
