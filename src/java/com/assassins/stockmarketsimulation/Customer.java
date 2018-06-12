 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assassins.stockmarketsimulation;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Menake
 */
@Entity
@XmlRootElement
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        private String CustomerId;

            private String CustomerName;
            
    private String CustomerMobileNo;

        private String CustomerAddress;

    /**
     * Get the value of CustomerAddress
     *
     * @return the value of CustomerAddress
     */
    public String getCustomerAddress() {
        return CustomerAddress;
    }

    /**
     * Set the value of CustomerAddress
     *
     * @param CustomerAddress new value of CustomerAddress
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    
    /**
     * Get the value of CustomerMobileNo
     *
     * @return the value of CustomerMobileNo
     */
    public String getCustomerMobileNo() {
        return CustomerMobileNo;
    }

    /**
     * Set the value of CustomerMobileNo
     *
     * @param CustomerMobileNo new value of CustomerMobileNo
     */
    public void setCustomerMobileNo(String CustomerMobileNo) {
        this.CustomerMobileNo = CustomerMobileNo;
    }


    /**
     * Get the value of CustomerName
     *
     * @return the value of CustomerName
     */
    public String getCustomerName() {
        return CustomerName;
    }

    /**
     * Set the value of CustomerName
     *
     * @param CustomerName new value of CustomerName
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
 
        
    /**
     * Get the value of CustomerId
     *
     * @return the value of CustomerId
     */
    public String getCustomerId() {
        return CustomerId;
    }

    /**
     * Set the value of CustomerId
     *
     * @param CustomerId new value of CustomerId
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.assassins.stockmarketsimulation.Customer[ id=" + id + " ]";
    }
    
}
