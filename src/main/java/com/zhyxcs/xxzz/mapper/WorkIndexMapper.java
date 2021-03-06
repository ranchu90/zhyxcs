package com.zhyxcs.xxzz.mapper;

import com.zhyxcs.xxzz.domain.WorkIndex;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WorkIndexMapper {
    int deleteByPrimaryKey(String stransactionnum);

    int insert(WorkIndex record);

    WorkIndex selectByPrimaryKey(String stransactionnum);

    List<WorkIndex> selectAll();

    int updateByPrimaryKey(WorkIndex record);

    int newWorkIndex(WorkIndex record);

    int queryRecordTotalNum(@Param("userCode") String userCode,
                            @Param("approvalState") String approvalState,
                            @Param("businessEmergency") String businessEmergency,
                            @Param("userLevel") String userLevel,
                            @Param("bankCode") String bankCode,
                            @Param("ifUploadLicense") String ifUploadLicense,
                            @Param("ifRecheck") String ifRecheck);

    List<WorkIndex> queryRecordByPageAndUserCodeBankEntry(@Param("pageSize") String pageSize,
                                                          @Param("currentPage") String currentPage,
                                                          @Param("userCode") String userCode,
                                                          @Param("approvalState") String approvalState,
                                                          @Param("userLevel") String userLevel,
                                                          @Param("businessEmergency") String businessEmergency,
                                                          @Param("bankCode") String bankCode,
                                                          @Param("depositorName")String depositorName,
                                                          @Param("businessType") String businessType);

    List<WorkIndex> queryRecordByPageAndUserCodeBankCharge(@Param("pageSize") String pageSize,
                                                           @Param("currentPage") String currentPage,
                                                           @Param("userCode") String userCode,
                                                           @Param("approvalState") String approvalState,
                                                           @Param("userLevel") String userLevel,
                                                           @Param("businessEmergency") String businessEmergency,
                                                           @Param("bankCode") String bankCode,
                                                           @Param("depositorName")String depositorName,
                                                           @Param("businessType") String businessType);

    List<WorkIndex> queryRecordByPageAndUserCodeRenEntry(@Param("pageSize") String pageSize,
                                                         @Param("currentPage") String currentPage,
                                                         @Param("userCode") String userCode,
                                                         @Param("approvalState") String approvalState,
                                                         @Param("userLevel") String userLevel,
                                                         @Param("businessEmergency") String businessEmergency,
                                                         @Param("pbcCode") String pbcCode,
                                                         @Param("ifUploadLicense") String ifUploadLicense,
                                                         @Param("ifRecheck") String ifRecheck,
                                                         @Param("bankCode") String bankCode,
                                                         @Param("depositorName") String depositorName,
                                                         @Param("businessType") String businessType);

    List<WorkIndex> queryRecordByPageAndUserCodeRenCharge(@Param("pageSize") String pageSize,
                                                          @Param("currentPage") String currentPage,
                                                          @Param("userCode") String userCode,
                                                          @Param("approvalState") String approvalState,
                                                          @Param("userLevel") String userLevel,
                                                          @Param("businessEmergency") String businessEmergency,
                                                          @Param("pbcCode") String pbcCode,
                                                          @Param("ifUploadLicense") String ifUploadLicense,
                                                          @Param("ifRecheck") String ifRecheck,
                                                          @Param("bankCode") String bankCode,
                                                          @Param("depositorName") String depositorName,
                                                          @Param("businessType") String businessType);

    List<WorkIndex> queryRecordByPageAndUserCodeRenAdmin(@Param("pageSize") String pageSize,
                                                         @Param("currentPage") String currentPage,
                                                         @Param("userCode") String userCode,
                                                         @Param("approvalState") String approvalState,
                                                         @Param("userLevel") String userLevel,
                                                         @Param("businessEmergency") String businessEmergency);

    int updateDepositorNameByPrimaryKey(WorkIndex record);

    int updateApprovalStateNameByPrimaryKey(@Param("workIndex") WorkIndex workIndex, @Param("action") String action);

    int updateWorkIndexByApprovalCodeAndIdentifier(WorkIndex workIndex);

    int updateWorkIndexBusinessEmergency(WorkIndex workIndex);

    int occupyTransaction(WorkIndex workIndex);

    List<WorkIndex> queryRecordByConditions(@Param("currentBankArea") String currentBankArea,
                                            @Param("currentCity") String currentCity,
                                            @Param("bankKind") String bankKind,
                                            @Param("bankType") String bankType,
                                            @Param("businessCategory") String businessCategory,
                                            @Param("accountType") String accountType,
                                            @Param("orgaCode") String orgaCode,
                                            @Param("bankEntryUserCode") String bankEntryUserCode,
                                            @Param("bankReviewUserCode") String bankReviewUserCode,
                                            @Param("renEntryUserCode") String renEntryUserCode,
                                            @Param("renRecheckUserCode") String renRecheckUserCode,
                                            @Param("transactionNum") String transactionNum,
                                            @Param("approvalCode") String approvalCode,
                                            @Param("identifier") String identifier,
                                            @Param("startTime") String startTime,
                                            @Param("endTime") String endTime,
                                            @Param("bankCodeList") List<String> bankCodeList,
                                            @Param("pbcCodeList") List<String> pbcCodeList);

    int calculateWorksByBankCode(@Param("bankCode") String bankCode,
                                 @Param("bankKindChar") String bankKindChar);

    List<WorkIndex> queryDiary(@Param("bankOrPBC") String bankOrPBC,
                               @Param("currentUserBankCode") String currentUserBankCode,
                               @Param("bankKind") String bankKind,
                               @Param("bankType") String bankType,
                               @Param("bankName") String bankName,
                               @Param("startTime") Date startTime,
                               @Param("endTime") Date endTime);

}
