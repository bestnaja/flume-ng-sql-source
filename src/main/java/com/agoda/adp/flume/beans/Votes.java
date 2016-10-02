package com.agoda.adp.flume.beans;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bestnaja on 10/2/16.
 */
public class Votes {

    private BigDecimal VOTETYPEID;
    private BigDecimal POSTID;
    private BigDecimal USERID;
    private BigDecimal ID;
    private Date CREATIONDATE;
    private BigDecimal ROWNUM_;

    @Override
    public String toString() {

        return "{\"ROWNUM\":"+ROWNUM_+"," +
                "\"VOTETYPEID\":"+VOTETYPEID+"," +
                "\"POSTID\":"+POSTID+"," +
                "\"USERID\":"+USERID+"," +
                "\"ID\":"+ID+"," +
                "\"CREATIONDATE\":"+(CREATIONDATE != null ? CREATIONDATE.getTime(): "null")+"}";
    }

    public BigDecimal getVOTETYPEID() {
        return VOTETYPEID;
    }

    public void setVOTETYPEID(BigDecimal VOTETYPEID) {
        this.VOTETYPEID = VOTETYPEID;
    }

    public BigDecimal getPOSTID() {
        return POSTID;
    }

    public void setPOSTID(BigDecimal POSTID) {
        this.POSTID = POSTID;
    }

    public BigDecimal getUSERID() {
        return USERID;
    }

    public void setUSERID(BigDecimal USERID) {
        this.USERID = USERID;
    }

    public BigDecimal getID() {
        return ID;
    }

    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    public Date getCREATIONDATE() {
        return CREATIONDATE;
    }

    public void setCREATIONDATE(Date CREATIONDATE) {
        this.CREATIONDATE = CREATIONDATE;
    }

    public BigDecimal getROWNUM_() {
        return ROWNUM_;
    }

    public void setROWNUM_(BigDecimal ROWNUM_) {
        this.ROWNUM_ = ROWNUM_;
    }
}
