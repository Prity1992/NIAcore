package com.aqm.staf.library;

import org.hibernate.Session;

import com.aqm.framework.core.TestData;
import com.aqm.testing.testDataEntity.*;

public class ScenarioTestData extends TestData{

	public ScenarioTestData(Session sessionTestData) {
		super(sessionTestData);
	}

	@Override
	public void scenarioDataInfo(String testScenarioReference) {
		setScenarioData(LoginEntity.class, testScenarioReference);
		setScenarioData(ChildRecordEntity.class, testScenarioReference);
		setScenarioData(PartyEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberAttributeEntity.class, testScenarioReference);
		setScenarioData(ClaimReservePageEntity.class, testScenarioReference);
		setScenarioData(PartyRolesFunctDetailsEntity.class, testScenarioReference);
		setScenarioData(PartyShowVersionListEntity.class, testScenarioReference);
		setScenarioData(PartyCompleteEditEntity.class, testScenarioReference);
		setScenarioData(PolicyMemAttachCovEntity.class, testScenarioReference);
		setScenarioData(PolicyCoverageDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberPaymentsEntity.class, testScenarioReference);
		setScenarioData(PolicyNonSysPolicyEntity.class, testScenarioReference);
		setScenarioData(PolicyCommiRecovEntity.class, testScenarioReference);
		setScenarioData(PolicyVersionSearchEntity.class, testScenarioReference);
		setScenarioData(PolicyDocumentEntity.class, testScenarioReference);
		setScenarioData(PartyRolesFunctionsEntity.class, testScenarioReference);
		setScenarioData(PolicyConditionsCreateEntity.class, testScenarioReference);
		setScenarioData(PolicyRelationDetailEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberAttribViewEntity.class, testScenarioReference);
		setScenarioData(PolicyPremiumScheduleEntity.class, testScenarioReference);
		setScenarioData(PolicyDocumentSearchEntity.class, testScenarioReference);
		setScenarioData(PolicyRejectAlterationEntity.class, testScenarioReference);
		setScenarioData(PartyEditReasonEntity.class, testScenarioReference);
		setScenarioData(RelatedPartyRelationsEntity.class, testScenarioReference);
		setScenarioData(PartyPartyRoleClaimantEntity.class, testScenarioReference);
		setScenarioData(PolicyMember_InsuredEntity.class, testScenarioReference);
		setScenarioData(MembAtachCovrgPremSchdEntity.class, testScenarioReference);
		setScenarioData(ClientDetailsEntity.class, testScenarioReference);
		setScenarioData(ClaimEntity.class, testScenarioReference);
		setScenarioData(AccountingAccSearchEntity.class, testScenarioReference);
		setScenarioData(AccountingAccDetailsEntity.class, testScenarioReference);
		setScenarioData(AccountingAnnualBalEntity.class, testScenarioReference);
		setScenarioData(AccChequeDishonourEntity.class, testScenarioReference);
		setScenarioData(PolicyAttributeEntity.class, testScenarioReference);
		setScenarioData(PartyContactsDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberCoverageDEntity.class, testScenarioReference);
		setScenarioData(PolicyAttributeHealthEntity.class, testScenarioReference);
		setScenarioData(ClaimPaymentEntity.class, testScenarioReference);
		setScenarioData(PartyFollowupDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyCoverageListEntity.class, testScenarioReference);
		setScenarioData(ClaimHistoryEntity.class, testScenarioReference);
		setScenarioData(PartyRolesMemberDetailEntity.class, testScenarioReference);
		setScenarioData(PolicyMemAttachCovAtrEntity.class, testScenarioReference);
		setScenarioData(PolicyPaymDetailsCycleEntity.class, testScenarioReference);
		setScenarioData(AccMaintainTransactionEntity.class, testScenarioReference);
		setScenarioData(ClaimPaymentCycleEntity.class, testScenarioReference);
		setScenarioData(ClaimDamageDetailsEntity.class, testScenarioReference);
		setScenarioData(ClaimAssociatedPartiesEntity.class, testScenarioReference);
		setScenarioData(ClaimPartyDetailsEntity.class, testScenarioReference);
		setScenarioData(ClaimPaymentEntity.class, testScenarioReference);
		setScenarioData(ClaimDocumentEntity.class, testScenarioReference);
		setScenarioData(AcctCoinsuranceVoucherEntity.class, testScenarioReference);
		setScenarioData(ClaimMemberAttributesEntity.class, testScenarioReference);
		setScenarioData(AccoScrollEntryEntity.class, testScenarioReference);
		setScenarioData(AccScrollSearchEntity.class, testScenarioReference);
		setScenarioData(AccountingBGOrCDSearchEntity.class, testScenarioReference);
		setScenarioData(ClaimAttriCourtMasterEntity.class, testScenarioReference);
		setScenarioData(AccountngCollectnSearcEntity.class, testScenarioReference);
		setScenarioData(AccDepartmentForScrollEntity.class, testScenarioReference);
		setScenarioData(PartyLocationEntity.class, testScenarioReference);
		setScenarioData(SchemePartyAttributesEntity.class, testScenarioReference);
		setScenarioData(PolicyEndAlterationEntity.class, testScenarioReference);
		setScenarioData(PolicyRejectProposalEntity.class, testScenarioReference);
		setScenarioData(ClaimLitigationEntity.class, testScenarioReference);
		setScenarioData(ForeignExchangeDetailEntity.class, testScenarioReference);
		setScenarioData(ChequeSearchEntity.class, testScenarioReference);
		setScenarioData(InstrumentDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyBreakInInsuranceEntity.class, testScenarioReference);
		setScenarioData(PolicyTypeOfDevOfficerEntity.class, testScenarioReference);
		setScenarioData(ClaimMemberDamageEntity.class, testScenarioReference);
		setScenarioData(ClaimMemberT1T2CLRAttEntity.class, testScenarioReference);
		setScenarioData(ClonePolicySchemeEntity.class, testScenarioReference);
		setScenarioData(MemberAttributesEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberAttributeEntity.class, testScenarioReference);
		setScenarioData(PolicyPremCollectionEntity.class, testScenarioReference);
		setScenarioData(PreviousPolicyHistoryEntity.class, testScenarioReference);
		setScenarioData(AccountingEntity.class, testScenarioReference);
		setScenarioData(SecurityPartyEntity.class, testScenarioReference);
		setScenarioData(ClaimT2CLRForHealthProEntity.class, testScenarioReference);
		setScenarioData(PolicyAccoColleSearchEntity.class, testScenarioReference);
		setScenarioData(AccountDistributionEntity.class, testScenarioReference);
		setScenarioData(PolicyCoPayClaimRatioEntity.class, testScenarioReference);
		setScenarioData(PolicyClaimFreeYearsEntity.class, testScenarioReference);
		setScenarioData(PolicyAttrCDPolDetailsEntity.class, testScenarioReference);
		setScenarioData(ProvisionalPolDetailEntity.class, testScenarioReference);
		setScenarioData(InstallementFacilityEntity.class, testScenarioReference);

		setScenarioData(PreviousPolicyDataEntity.class, testScenarioReference);
		setScenarioData(InsuredMemberDetailEntity.class, testScenarioReference);
		setScenarioData(IMJourneyDetailsPZEntity.class, testScenarioReference);
		setScenarioData(BalancePremiumEntity.class, testScenarioReference);
		setScenarioData(PrePolDetailCreditShldEntity.class, testScenarioReference);
		setScenarioData(PartyRoleBuyerMastINDEntity.class, testScenarioReference);
		setScenarioData(PolicyAttrQuotDetailEntity.class, testScenarioReference);
		setScenarioData(PolicyAttPolDetailsCSEntity.class, testScenarioReference);
		setScenarioData(PortabilityEntity.class, testScenarioReference);
		setScenarioData(PolInsureAttBuyrDetailEntity.class, testScenarioReference);
		setScenarioData(IsMemPortNonNIAPolEntity.class, testScenarioReference);
		setScenarioData(PolicyMemberAttrGroupEntity.class, testScenarioReference);
		setScenarioData(PolicyMemAttrSTDRiskEntity.class, testScenarioReference);
		setScenarioData(OptionalTPARuleEntity.class, testScenarioReference);
		setScenarioData(MedicalCheckUpDetailsEntity.class, testScenarioReference);
		setScenarioData(PolicyMemCoPaymentSCEntity.class, testScenarioReference);
		setScenarioData(PolMemPreExstngDisesEntity.class, testScenarioReference);
		setScenarioData(PolMemStrtDateForMemEntity.class, testScenarioReference);
		setScenarioData(PolAttrReinTypeRuleCSEntity.class, testScenarioReference);
		setScenarioData(PolInsuredLodngDisOptEntity.class, testScenarioReference);
		setScenarioData(PolicyInsrdTailorPremEntity.class, testScenarioReference);
		setScenarioData(PolAttPolHistoryforPUEntity.class, testScenarioReference);
		setScenarioData(PolInsureAttRiskDetailEntity.class, testScenarioReference);
		setScenarioData(PolInsAttPHT1PLRMembPAEntity.class, testScenarioReference);
		setScenarioData(PolInsAttPHT2PLRMembPAEntity.class, testScenarioReference);
		setScenarioData(PolAtrPersnalAcidentEntity.class, testScenarioReference);
		setScenarioData(PolInsrXssDscPUPerAcdtEntity.class, testScenarioReference);
		setScenarioData(PolAttrPolicyHistoryPAEntity.class, testScenarioReference);
		setScenarioData(PolAttrPolDetails2PUEntity.class, testScenarioReference);
		setScenarioData(PolAttrPUAddOnCoverageEntity.class, testScenarioReference);
		setScenarioData(PolInsureAttrGrpNamePAEntity.class, testScenarioReference);
		setScenarioData(PolInsureSpeclCondtnPAEntity.class, testScenarioReference);
		setScenarioData(PolInsLoadAmbulanceEntity.class, testScenarioReference);
		setScenarioData(PolGHT1PLRMemberEntity.class, testScenarioReference);
		setScenarioData(PolGHT2PLRMemberEntity.class, testScenarioReference);
		setScenarioData(PolInsIntINDRiskDetPUEntity.class, testScenarioReference);
		setScenarioData(PolInsIntINDRiskDetPUEntity.class, testScenarioReference);
		setScenarioData(PolicyAttrDetailsT1POLEntity.class, testScenarioReference);
		setScenarioData(ClaimInsrRiskDetils2CSEntity.class, testScenarioReference);
		setScenarioData(CLInsItClaimRiskDet1CSEntity.class, testScenarioReference);
		setScenarioData(ClamIsurRskdet2NonGrPAEntity.class, testScenarioReference);
		setScenarioData(ClaimIsurComRiskPropPAEntity.class, testScenarioReference);
		setScenarioData(CLInsIntClaimDetIndivdEntity.class, testScenarioReference);
		setScenarioData(ClaimInsItAttRiskDetPAEntity.class, testScenarioReference);
		setScenarioData(PolInsrIntCovrDetlPUPAEntity.class, testScenarioReference);
		setScenarioData(ClaimInsrRiskDetl2GrPAEntity.class, testScenarioReference);
		setScenarioData(PolMemAttrSumInsuredEntity.class, testScenarioReference);
		setScenarioData(ClaimInsrRskDetails2PAEntity.class, testScenarioReference);
		setScenarioData(PolicyAttributeRuralEntity.class, testScenarioReference);
		setScenarioData(DebitCreditNoteEntity.class, testScenarioReference);
		setScenarioData(AccountingDistributionTable.class, testScenarioReference); 
		setScenarioData(CreditingDebitingAccTable.class, testScenarioReference);
		setScenarioData(FinancialSummaryTableEntity.class, testScenarioReference);
		setScenarioData(ClaimPartiesFinanSumayEntity.class, testScenarioReference);
		setScenarioData(ClaimTransferToAPEntity.class, testScenarioReference);
		setScenarioData(ClaimAttributesEntity.class, testScenarioReference);
		setScenarioData(PolicyInsrAttrBasPrem1Entity.class, testScenarioReference);
		setScenarioData(PolicyInsrAttrBasPrem2Entity.class, testScenarioReference);
		setScenarioData(PolicyInsrAttrBasPrem3Entity.class, testScenarioReference);
		setScenarioData(PolInsurSplConditnTFTGEntity.class, testScenarioReference);
		setScenarioData(ClaimPolPropertyTCLMEntity.class, testScenarioReference);
		setScenarioData(PolicyCoInsurancDetailEntity.class, testScenarioReference);
		setScenarioData(PrevClaimHistoryForGHEntity.class, testScenarioReference);
		setScenarioData(ClaimSynopsisEntity.class, testScenarioReference);
		setScenarioData(PolicyShowVersionPageEntity.class, testScenarioReference);
		setScenarioData(VoluntaryExcessDetailsEntity.class, testScenarioReference);
		setScenarioData(RiskDetailsFirstMiscEntity.class, testScenarioReference);
		setScenarioData(PolSpecialConditnMiscEntity.class, testScenarioReference);
		setScenarioData(Exten1DetailsMiscEntity.class, testScenarioReference);
		setScenarioData(Exten2DetailsMiscEntity.class, testScenarioReference);
		setScenarioData(RiskDetailsSecndMiscEntity.class, testScenarioReference);
		setScenarioData(RiskDetailsThirdMiscEntity.class, testScenarioReference);
		setScenarioData(RiskDetailsFourthMiscEntity.class, testScenarioReference);
		setScenarioData(Exten3DetailsMiscEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttRiskDet1Entity.class, testScenarioReference);
		setScenarioData(LoadDiscntDetRuralEntity.class, testScenarioReference);
		setScenarioData(DetailWageAcidntsMiscEntity.class, testScenarioReference);
		setScenarioData(RiskDetails2RuralEntity.class, testScenarioReference);
		setScenarioData(PDRskDetailSecndPageMLEntity.class, testScenarioReference);
		setScenarioData(AttachCovAttribtCovDetEntity.class, testScenarioReference);
		setScenarioData(PolAttributeMNLEntity.class, testScenarioReference);
		setScenarioData(PolHistoryForMiscNLEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttrMNLEntity.class, testScenarioReference);
		setScenarioData(PolInsIntOthrRiskDMNLEntity.class, testScenarioReference);
		setScenarioData(PolInsIntRiskDetMNLEntity.class, testScenarioReference);
		setScenarioData(SpeCondForMiscNLEntity.class, testScenarioReference);
		setScenarioData(StandCovDetForMiscNLEntity.class, testScenarioReference);
		setScenarioData(PremiumRatePFMiscEntity.class, testScenarioReference);
		setScenarioData(T3ClaimPropForMISEntity.class, testScenarioReference);
		setScenarioData(T4ClaimPropMISEntity.class, testScenarioReference);
		setScenarioData(T5ClaimPropLiab1MISEntity.class, testScenarioReference);
		setScenarioData(T4ClaimPropLiab1MISEntity.class, testScenarioReference);

		setScenarioData(AviationRiskDT2Entity.class, testScenarioReference);
		setScenarioData(AviationRiskDT3Entity.class, testScenarioReference);
		setScenarioData(PolicyAttrAviationEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAvtEntity.class, testScenarioReference);
		setScenarioData(PreClaimHistCartRuralEntity.class, testScenarioReference);
		setScenarioData(PolAttrFireEntity.class, testScenarioReference);
		setScenarioData(SFStatIntermedFireEntity.class, testScenarioReference);
		setScenarioData(RiskFinanceDFireEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttrFireEntity.class, testScenarioReference);
		setScenarioData(PolInsInttNetProFireEntity.class, testScenarioReference);
		setScenarioData(RiskDetIARPolFireEntity.class, testScenarioReference);
		setScenarioData(PolInsIntSpeFieldsFireEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskDetMISEntity.class, testScenarioReference);
		setScenarioData(ClaimChrgSubLimitREntity.class, testScenarioReference);
		setScenarioData(PolAttrDiscretDisEngEntity.class, testScenarioReference);
		setScenarioData(PolAttrAOCDetEngEntity.class, testScenarioReference);
		setScenarioData(PolAttLPSFPolDetEntity.class, testScenarioReference);
		setScenarioData(PolAttSpeCondFireEntity.class, testScenarioReference);
		setScenarioData(RiskCoverPropertyFireEntity.class, testScenarioReference);
		setScenarioData(PolTransferToAPEntity.class, testScenarioReference);
		setScenarioData(AttCovAttrChkPltSIbrkEntity.class, testScenarioReference);
		setScenarioData(AttachCovAttrUtilityEntity.class, testScenarioReference);
		setScenarioData(CapitalAdditionDetailsEntity.class, testScenarioReference);
		setScenarioData(SecurityAndOthrInfoEntity.class, testScenarioReference);
		setScenarioData(PmlDetailsEntity.class, testScenarioReference);
		setScenarioData(FirePERateEntity.class, testScenarioReference);
		setScenarioData(FirePEAddOnCovEnity.class, testScenarioReference);
		setScenarioData(LRPRCADDFireEntity.class, testScenarioReference); 
		setScenarioData(PolicyFollowupEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskPropFireEntity.class, testScenarioReference);
		setScenarioData(ClaimSpeFeildFireEntity.class, testScenarioReference);
		setScenarioData(InterPeriodInDaysEntity.class, testScenarioReference);
		setScenarioData(ClaimLossFireEntity.class, testScenarioReference);
		setScenarioData(ClaimPropertyFireEntity.class, testScenarioReference);
		setScenarioData(ClaimPropertyMotorEntity.class, testScenarioReference);
		setScenarioData(FireReinstatmntPremiumEntity.class, testScenarioReference);
		setScenarioData(PolAttrMarineHullEntity.class, testScenarioReference);
		setScenarioData(PolInsIntFleetDMHEntity.class, testScenarioReference);
		setScenarioData(PolAttributeEngEntity.class, testScenarioReference);
		setScenarioData(PolAttrOtherDMSIEngEntity.class, testScenarioReference);
		setScenarioData(PolInsIntEngEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttrSIDEngEntity.class, testScenarioReference);
		setScenarioData(PolAttrPolDetMHEntity.class, testScenarioReference);
		setScenarioData(PolAttCoverRuleMHEntity.class, testScenarioReference);
		setScenarioData(PolAttrPolDeatilsMHEntity.class, testScenarioReference);		
		setScenarioData(PolInsIntAttMeritRatDEntity.class, testScenarioReference);
		setScenarioData(PolAttPropDmAddOnEngEntity.class, testScenarioReference);
		setScenarioData(ProjectDetailEngEntity.class, testScenarioReference);
		setScenarioData(PolAttrEquipmentsEngEntity.class, testScenarioReference);
		setScenarioData(AttachCoverTerrorismCEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttrSTFIEngEntity.class, testScenarioReference);
		setScenarioData(PolCovSectionDetailsEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttEQEngEntity.class, testScenarioReference);
		setScenarioData(PolAttrInsHisT5POLEntity.class, testScenarioReference);
		setScenarioData(PolVessTypeMHPolInfmnEntity.class, testScenarioReference);
		setScenarioData(AviStdCovAHT1PRCEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttTransCommEntity.class, testScenarioReference);
		setScenarioData(ClaimDetailsEngEntity.class, testScenarioReference);
		setScenarioData(ClaimExcessEngEntity.class, testScenarioReference);
		setScenarioData(PolInsIntVessInformPLREntity.class, testScenarioReference);
		setScenarioData(ClaimAttrOtherDetailsEntity.class, testScenarioReference);
		//Misc Non Claim
		setScenarioData(ClaimMNT1CLRMNLEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskProp2MNLEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskProp3MNLEntity.class, testScenarioReference);
		setScenarioData(ComClRiskProp2MNLEntity.class, testScenarioReference);
		setScenarioData(ComClaimRiskPropMNLEntity.class, testScenarioReference);
		setScenarioData(PartyRolBrokerCommiEntity.class, testScenarioReference);
		setScenarioData(PolBrokerAgentTPADetEntity.class, testScenarioReference);
		setScenarioData(PartyAgentPartyRuleEntity.class, testScenarioReference);
		//Motor
		setScenarioData(PolAttributeMotorEntity.class, testScenarioReference);
		setScenarioData(SumInsforLibMotorEntity.class, testScenarioReference);
		setScenarioData(SumInsuredAndLossEntity.class, testScenarioReference);
		setScenarioData(PolicyAttrGstUpdateEntity.class, testScenarioReference);
		setScenarioData(PolInsIntPreHistMotorEntity.class, testScenarioReference);
		setScenarioData(MoreCommeVehiDMotorEntity.class, testScenarioReference);
		setScenarioData(PolInsIntVehVaDetMotorEntity.class, testScenarioReference);
		setScenarioData(DriverDetCVT4PLRMotorEntity.class, testScenarioReference);
		setScenarioData(BasicCommVehDetMotorEntity.class, testScenarioReference);
		setScenarioData(PolicyAttrPOSMotorEntity.class, testScenarioReference);

		setScenarioData(ClaimRiskProMotorEntity.class, testScenarioReference);
		setScenarioData(ClaimDocumentMotorEntity.class, testScenarioReference);
		//Marine Cargo
		setScenarioData(PolAttrMarinCargoEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttrMCargoEntity.class, testScenarioReference);
		setScenarioData(PolInsIntAttCarDetMCEntity.class, testScenarioReference);
		setScenarioData(AttchCovAttMarineCargoEntity.class, testScenarioReference);
		//reinsurence
		setScenarioData(LoginEntityReinsurance.class, testScenarioReference);
		setScenarioData(PartyEntityReinsurance.class, testScenarioReference);
		setScenarioData(ProgramCreateEntity.class, testScenarioReference);
		//RIHOME
		setScenarioData(CessionDetailsEntity.class, testScenarioReference);
		setScenarioData(ReinsuranceHomeEntity.class, testScenarioReference);
		//RIHOME
		setScenarioData(ReinsuranceHomeEntity.class, testScenarioReference);
		setScenarioData(MaintainCreateEntity.class, testScenarioReference);
		setScenarioData(RiContractEntityReinsurance.class, testScenarioReference);
		setScenarioData(MaintainPolicyRiskEntity.class, testScenarioReference);
		setScenarioData(UnderSearchEntity.class, testScenarioReference);
		setScenarioData(TreatyCreateEntity.class, testScenarioReference);
		//Ajit Aviation
		setScenarioData(ClaimRiskProT1CLRAviEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskProT2CLRAviEntity.class, testScenarioReference);
		setScenarioData(ClaimRiskProT3CLRAviEntity.class, testScenarioReference);
		setScenarioData(RiskDetailsMCEntity.class, testScenarioReference);
	}
}