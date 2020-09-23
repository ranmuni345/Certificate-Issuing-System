/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.oracle.jrockit.jfr.ContentType;
import java.io.Serializable;

/**
 *
 * @author dulan
 */
public class Marriage implements Serializable
{
    private String name;
    private String address;
    private String marriage_type;
    private String no_of_copies;
    private String m_fullname;
    private String f_fullname;
    private String certifier;
    private String Id_no;
    private String district;
    private String date;
    private String exact_date;
    private String email;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the marriage_type
     */
    public String getMarriage_type() {
        return marriage_type;
    }

    /**
     * @param marriage_type the marriage_type to set
     */
    public void setMarriage_type(String marriage_type) {
        this.marriage_type = marriage_type;
    }

    /**
     * @return the no_of_copies
     */
    public String getNo_of_copies() {
        return no_of_copies;
    }

    /**
     * @param no_of_copies the no_of_copies to set
     */
    public void setNo_of_copies(String no_of_copies) {
        this.no_of_copies = no_of_copies;
    }

    /**
     * @return the m_fullname
     */
    public String getM_fullname() {
        return m_fullname;
    }

    /**
     * @param m_fullname the m_fullname to set
     */
    public void setM_fullname(String m_fullname) {
        this.m_fullname = m_fullname;
    }

    /**
     * @return the f_fullname
     */
    public String getF_fullname() {
        return f_fullname;
    }

    /**
     * @param f_fullname the f_fullname to set
     */
    public void setF_fullname(String f_fullname) {
        this.f_fullname = f_fullname;
    }

    /**
     * @return the certifier
     */
    public String getCertifier() {
        return certifier;
    }

    /**
     * @param certifier the certifier to set
     */
    public void setCertifier(String certifier) {
        this.certifier = certifier;
    }

    /**
     * @return the Id_no
     */
    public String getId_no() {
        return Id_no;
    }

    /**
     * @param Id_no the Id_no to set
     */
    public void setId_no(String Id_no) {
        this.Id_no = Id_no;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the exact_date
     */
    public String getExact_date() {
        return exact_date;
    }

    /**
     * @param exact_date the exact_date to set
     */
    public void setExact_date(String exact_date) {
        this.exact_date = exact_date;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(ContentType contentType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
