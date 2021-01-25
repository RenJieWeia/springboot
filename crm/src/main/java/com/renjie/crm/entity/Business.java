package com.renjie.crm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author 魏仁杰
 * 事务类实体
 */
public class Business implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 发起人ID
     */
    private String originatorId;
    /**
     * 当事人ID
     */
    private int partyId;
    /**
     * ID
     */
    private String workId;
    /**
     * 事务内容
     */
    private String content;
    /**
     * 事务标题
     */
    private String title;
    /**
     * 事务创建时时间
     */
    private Date createDate;
    /**
     * 事务开始执行时间
     */
    private Date startDate;
    /**
     * 任务期限
     */
    private Date termDate;

    public String getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTermDate() {
        return termDate;
    }

    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Business)) return false;
        Business business = (Business) o;
        return getPartyId() == business.getPartyId() && Objects.equals(getOriginatorId(), business.getOriginatorId()) && Objects.equals(getWorkId(), business.getWorkId()) && Objects.equals(getContent(), business.getContent()) && Objects.equals(getTitle(), business.getTitle()) && Objects.equals(getCreateDate(), business.getCreateDate()) && Objects.equals(getStartDate(), business.getStartDate()) && Objects.equals(getTermDate(), business.getTermDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOriginatorId(), getPartyId(), getWorkId(), getContent(), getTitle(), getCreateDate(), getStartDate(), getTermDate());
    }
}
