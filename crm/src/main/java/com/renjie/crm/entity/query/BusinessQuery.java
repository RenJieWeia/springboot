package com.renjie.crm.entity.query;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BusinessQuery {
    /**
     * 任务状态 已完成 未完成
     */
    private String status;
    /**
     * 任务期限
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date termDate;
    /**
     * 任务发布者id
     */
    private String originatorId;
    /**
     * 当事人ID
     */
    private String partyId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTermDate() {
        return termDate;
    }

    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public String getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @Override
    public String toString() {
        return "BusinessQuery{" +
                "status='" + status + '\'' +
                ", termDate=" + termDate +
                ", originatorId='" + originatorId + '\'' +
                ", partyId='" + partyId + '\'' +
                '}';
    }
}
