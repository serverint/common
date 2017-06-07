package com.paymentcomponents.common.request

class FinancialInstitutionRequest {

    String requestId
    Date creationDateTime
    String instructingInstitutionCode
    int channelCode
    String batchNumber

    FinancialInstitutionRequest() {
    }

    FinancialInstitutionRequest(String requestId, Date creationDateTime, String batchNumber) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.batchNumber = batchNumber
    }

    FinancialInstitutionRequest(String requestId, Date creationDateTime, String instructingInstitutionCode, int channelCode, String batchNumber) {
        this.requestId = requestId
        this.creationDateTime = creationDateTime
        this.instructingInstitutionCode = instructingInstitutionCode
        this.channelCode = channelCode
        this.batchNumber = batchNumber
    }

    String getRequestId() {
        return requestId
    }

    void setRequestId(String requestId) {
        this.requestId = requestId
    }

    Date getCreationDateTime() {
        return creationDateTime
    }

    String getInstructingInstitutionCode() {
        return instructingInstitutionCode
    }

    void setInstructingInstitutionCode(String instructingInstitutionCode) {
        this.instructingInstitutionCode = instructingInstitutionCode
    }

    int getChannelCode() {
        return channelCode
    }

    void setChannelCode(int channelCode) {
        this.channelCode = channelCode
    }

    void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime
    }

    String getBatchNumber() {
        return batchNumber
    }

    void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber
    }


    @Override
    public String toString() {
        return "FinancialInstitutionRequest{" +
                "requestId='" + requestId + '\'' +
                ", creationDateTime=" + creationDateTime +
                ", instructingInstitutionCode='" + instructingInstitutionCode + '\'' +
                ", channelCode=" + channelCode +
                ", batchNumber='" + batchNumber + '\'' +
                '}';
    }
}