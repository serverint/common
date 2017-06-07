package com.paymentcomponents.common.response

import com.paymentcomponents.common.models.Bank
import com.paymentcomponents.common.request.FinancialInstitutionRequest
import com.paymentcomponents.common.request.subobjects.TransactionLocationInformation

class FinancialInstitutionResponse extends FinancialInstitutionRequest  {

    String responseCode
    String numberOfRecords
    List<Bank> records

    FinancialInstitutionResponse() {

    }

    FinancialInstitutionResponse(String responseCode, String numberOfRecords, List<Bank> records) {
        this.responseCode = responseCode
        this.numberOfRecords = numberOfRecords
        this.records = records
    }

    String getResponseCode() {
        return responseCode
    }

    void setResponseCode(String responseCode) {
        this.responseCode = responseCode
    }

    String getNumberOfRecords() {
        return numberOfRecords
    }

    void setNumberOfRecords(String numberOfRecords) {
        this.numberOfRecords = numberOfRecords
    }

    List<Bank> getRecords() {
        return records
    }

    void setRecords(List<Bank> records) {
        this.records = records
    }


    @Override
    public String toString() {
        return "FinancialInstitutionResponse{" +
                "responseCode='" + responseCode + '\'' +
                ", numberOfRecords='" + numberOfRecords + '\'' +
                ", records=" + records +
                '}';
    }
}