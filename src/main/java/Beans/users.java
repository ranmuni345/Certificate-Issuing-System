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
    
    public users(){
    }

    /**
     * @return the unames
     */
    public String getUnames() {
        return unames;
    }

    /**
     * @param Unames the Unames to set
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
     * @param Pno the pno to set
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
     * @param Mail the mail to set
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
     * @param Password the password to set
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
     * @param Approval the Approval to set
     */
    public void setApproval(String approval) {
        this.approval = approval;
    }
}
