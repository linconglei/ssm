package com.llc.phy.model;

import java.math.BigDecimal;
import java.util.Date;

public class Paydata {
    private Short paydataId;

    private Short batchId;

    private Short createUser;

    private Date createTime;

    private Short lastUpdateUser;

    private Date lastUpdateTime;

    private String businessFrom;

    private String payStatus;

    private String payType;

    private String payObj;

    private BigDecimal money;

    private String payChannel;

    private String payResult;

    private String payDescription;

    private Date businessTime;

    private String businessSeq;

    private String businessNo;

    private String mbrName;

    private String mbrIdNumber;

    private String mbrPhone;

    private String appid;

    private String mbrNickname;

    private String bankName;

    private String bankAccount;

    private String batchNumber;

    private Date firstSendTime;

    private Date lastSendTime;

    private Date payResultTime;

    private String mchBillno;

    private String recBankacc;

    private String bankType;

    private String recName;

    private String accType;

    private String area;

    private String city;

    private String subbankName;

    private String payTarget;

    private String billNo;

    private Short prePaydataId;

    private Short paydataBatchSeq;

    public Short getPaydataId() {
        return paydataId;
    }

    public void setPaydataId(Short paydataId) {
        this.paydataId = paydataId;
    }

    public Short getBatchId() {
        return batchId;
    }

    public void setBatchId(Short batchId) {
        this.batchId = batchId;
    }

    public Short getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Short createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(Short lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getBusinessFrom() {
        return businessFrom;
    }

    public void setBusinessFrom(String businessFrom) {
        this.businessFrom = businessFrom == null ? null : businessFrom.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayObj() {
        return payObj;
    }

    public void setPayObj(String payObj) {
        this.payObj = payObj == null ? null : payObj.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult == null ? null : payResult.trim();
    }

    public String getPayDescription() {
        return payDescription;
    }

    public void setPayDescription(String payDescription) {
        this.payDescription = payDescription == null ? null : payDescription.trim();
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessSeq() {
        return businessSeq;
    }

    public void setBusinessSeq(String businessSeq) {
        this.businessSeq = businessSeq == null ? null : businessSeq.trim();
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    public String getMbrName() {
        return mbrName;
    }

    public void setMbrName(String mbrName) {
        this.mbrName = mbrName == null ? null : mbrName.trim();
    }

    public String getMbrIdNumber() {
        return mbrIdNumber;
    }

    public void setMbrIdNumber(String mbrIdNumber) {
        this.mbrIdNumber = mbrIdNumber == null ? null : mbrIdNumber.trim();
    }

    public String getMbrPhone() {
        return mbrPhone;
    }

    public void setMbrPhone(String mbrPhone) {
        this.mbrPhone = mbrPhone == null ? null : mbrPhone.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getMbrNickname() {
        return mbrNickname;
    }

    public void setMbrNickname(String mbrNickname) {
        this.mbrNickname = mbrNickname == null ? null : mbrNickname.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public Date getFirstSendTime() {
        return firstSendTime;
    }

    public void setFirstSendTime(Date firstSendTime) {
        this.firstSendTime = firstSendTime;
    }

    public Date getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(Date lastSendTime) {
        this.lastSendTime = lastSendTime;
    }

    public Date getPayResultTime() {
        return payResultTime;
    }

    public void setPayResultTime(Date payResultTime) {
        this.payResultTime = payResultTime;
    }

    public String getMchBillno() {
        return mchBillno;
    }

    public void setMchBillno(String mchBillno) {
        this.mchBillno = mchBillno == null ? null : mchBillno.trim();
    }

    public String getRecBankacc() {
        return recBankacc;
    }

    public void setRecBankacc(String recBankacc) {
        this.recBankacc = recBankacc == null ? null : recBankacc.trim();
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType == null ? null : accType.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getSubbankName() {
        return subbankName;
    }

    public void setSubbankName(String subbankName) {
        this.subbankName = subbankName == null ? null : subbankName.trim();
    }

    public String getPayTarget() {
        return payTarget;
    }

    public void setPayTarget(String payTarget) {
        this.payTarget = payTarget == null ? null : payTarget.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Short getPrePaydataId() {
        return prePaydataId;
    }

    public void setPrePaydataId(Short prePaydataId) {
        this.prePaydataId = prePaydataId;
    }

    public Short getPaydataBatchSeq() {
        return paydataBatchSeq;
    }

    public void setPaydataBatchSeq(Short paydataBatchSeq) {
        this.paydataBatchSeq = paydataBatchSeq;
    }
}