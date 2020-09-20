/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author Sandun
 */
public class users implements Serializable{
    private String unames;
    private String pno;
    private String mail;
    private String password;
    private String approval;

    /**
     * @return the unames
     */
    public String getUnames() {
        return unames;
    }

    /**
     * @param unames the unames to set
     */
    public void setUnames(String unames) {
        this.unames = unames;
    }

    /**
     * @return the pno
     */
    public String getPno() {
        return pno;
    }

    /**
     * @param pno the pno to set
     */
    public void setPno(String pno) {
        this.pno = pno;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the approval
     */
    public String getApproval() {
        return approval;
    }

    /**
     * @param approval the approval to set
     */
    public void setApproval(String approval) {
        this.approval = approval;
    }
    
}
