package com.globalss;

import io.swagger.client.model.InlineResponse200OrganizationBusinessEntityType;
import io.swagger.client.model.InlineResponse200OrganizationCorporateLinkage;
import io.swagger.client.model.InlineResponse200OrganizationDnbAssessment;
import io.swagger.client.model.InlineResponse200OrganizationDunsControlStatus;
import io.swagger.client.model.InlineResponse200OrganizationRegistrationNumbers;
import io.swagger.client.model.InlineResponse200OrganizationSocioEconomicInformation;

public class EnrichCompanyProfileResponse {
  private InlineResponse200OrganizationCorporateLinkage corporateLinkage[];
  private InlineResponse200OrganizationBusinessEntityType BusinessEntityType[];
  private InlineResponse200OrganizationSocioEconomicInformation socioEconomicInformation[];
  private InlineResponse200OrganizationRegistrationNumbers registrationNumbers[];
  private InlineResponse200OrganizationDnbAssessment dnbAssessment[];
  private InlineResponse200OrganizationDunsControlStatus dunsControlStatus[];

  public InlineResponse200OrganizationCorporateLinkage [] getCorporateLinkage() {
    return corporateLinkage;
  }

  public void setCorporateLinkage(InlineResponse200OrganizationCorporateLinkage [] corporateLinkage) {
    this.corporateLinkage = corporateLinkage;
  }

  public InlineResponse200OrganizationBusinessEntityType [] getBusinessEntityType() {
    return BusinessEntityType;
  }

  public void setBusinessEntityType(InlineResponse200OrganizationBusinessEntityType [] businessEntityType) {
    BusinessEntityType = businessEntityType;
  }

  public InlineResponse200OrganizationSocioEconomicInformation [] getSocioEconomicInformation() {
    return socioEconomicInformation;
  }

  public void setSocioEconomicInformation(
          InlineResponse200OrganizationSocioEconomicInformation [] socioEconomicInformation) {
    this.socioEconomicInformation = socioEconomicInformation;
  }

  public InlineResponse200OrganizationRegistrationNumbers [] getRegistrationNumbers() {
    return registrationNumbers;
  }

  public void setRegistrationNumbers(InlineResponse200OrganizationRegistrationNumbers [] registrationNumbers) {
    this.registrationNumbers = registrationNumbers;
  }

  public InlineResponse200OrganizationDnbAssessment [] getDnbAssessment() {
    return dnbAssessment;
  }

  public void setDnbAssessment(InlineResponse200OrganizationDnbAssessment [] dnbAssessment) {
    this.dnbAssessment = dnbAssessment;
  }

  public InlineResponse200OrganizationDunsControlStatus [] getDunsControlStatus() {
    return dunsControlStatus;
  }

  public void setDunsControlStatus(InlineResponse200OrganizationDunsControlStatus [] dunsControlStatus) {
    this.dunsControlStatus = dunsControlStatus;
  }

}
