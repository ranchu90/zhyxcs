package com.zhyxcs.xxzz.service.impl;

import com.zhyxcs.xxzz.domain.WorkIndex;
import com.zhyxcs.xxzz.mapper.WorkIndexMapper;
import com.zhyxcs.xxzz.service.WorkIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkIndexServiceImpl implements WorkIndexService {
    @Autowired
    private WorkIndexMapper workIndexMapper;

    @Override
    public int newWorkIndex(WorkIndex record) {
        return workIndexMapper.newWorkIndex(record);
    }

    @Override
    public List<WorkIndex> selectAll() {
        return workIndexMapper.selectAll();
    }

    @Override
    public int queryRecordTotalNum(String userCode,
                                   String approvalState,
                                   String businessEmergency,
                                   String userLevel,
                                   String bankCode,
                                   String ifUploadLicense,
                                   String ifRecheck) {
        return workIndexMapper.queryRecordTotalNum(userCode, approvalState, businessEmergency, userLevel, bankCode, ifUploadLicense, ifRecheck);
    }

    @Override
    public List<WorkIndex> queryRecordByPageAndUserCodeBankEntry(String pageSize,
                                                                 String currentPage,
                                                                 String userCode,
                                                                 String approvalState,
                                                                 String userLevel,
                                                                 String businessEmergency,
                                                                 String bankCode,
                                                                 String depositorName,
                                                                 String businessType) {
        return workIndexMapper.queryRecordByPageAndUserCodeBankEntry(pageSize, currentPage, userCode, approvalState,
                userLevel, businessEmergency, bankCode, depositorName, businessType);
    }

    @Override
    public List<WorkIndex> queryRecordByPageAndUserCodeBankCharge(String pageSize,
                                                                  String currentPage,
                                                                  String userCode,
                                                                  String approvalState,
                                                                  String userLevel,
                                                                  String businessEmergency,
                                                                  String bankCode,
                                                                  String depositorName,
                                                                  String businessType) {
        return workIndexMapper.queryRecordByPageAndUserCodeBankCharge(pageSize, currentPage, userCode, approvalState,
                userLevel, businessEmergency, bankCode, depositorName, businessType);
    }

    @Override
    public List<WorkIndex> queryRecordByPageAndUserCodeRenEntry(String pageSize,
                                                                String currentPage,
                                                                String userCode,
                                                                String approvalState,
                                                                String userLevel,
                                                                String businessEmergency,
                                                                String pbcCode,
                                                                String ifUploadLicense,
                                                                String ifRecheck,
                                                                String bankCode,
                                                                String depositorName,
                                                                String businessType) {
        return workIndexMapper.queryRecordByPageAndUserCodeRenEntry(pageSize, currentPage, userCode, approvalState,
                userLevel, businessEmergency, pbcCode, ifUploadLicense, ifRecheck, bankCode, depositorName, businessType);
    }

    @Override
    public List<WorkIndex> queryRecordByPageAndUserCodeRenCharge(String pageSize,
                                                                 String currentPage,
                                                                 String userCode,
                                                                 String approvalState,
                                                                 String userLevel,
                                                                 String businessEmergency,
                                                                 String pbcCode,
                                                                 String ifUploadLicense,
                                                                 String ifRecheck,
                                                                 String bankCode,
                                                                 String depositorName,
                                                                 String businessType) {
        return workIndexMapper.queryRecordByPageAndUserCodeRenCharge(pageSize, currentPage, userCode, approvalState,
                userLevel, businessEmergency, pbcCode, ifUploadLicense, ifRecheck, bankCode, depositorName, businessType);
    }

    @Override
    public List<WorkIndex> queryRecordByPageAndUserCodeRenAdmin(String pageSize,
                                                                String currentPage,
                                                                String userCode,
                                                                String approvalState,
                                                                String userLevel,
                                                                String businessEmergency) {
        return workIndexMapper.queryRecordByPageAndUserCodeRenAdmin(pageSize, currentPage, userCode, approvalState,
                userLevel, businessEmergency);
    }

    @Override
    public int updateDepositorNameByPrimaryKey(WorkIndex record) {
        return workIndexMapper.updateDepositorNameByPrimaryKey(record);
    }

    @Override
    public int updateApprovalStateNameByPrimaryKey(WorkIndex workIndex, String action) {
        return workIndexMapper.updateApprovalStateNameByPrimaryKey(workIndex, action);
    }

    @Override
    public int deleteByPrimaryKey(String stransactionnum) {
        return workIndexMapper.deleteByPrimaryKey(stransactionnum);
    }

    @Override
    public int updateWorkIndexByApprovalCodeAndIdentifier(WorkIndex workIndex) {
        return workIndexMapper.updateWorkIndexByApprovalCodeAndIdentifier(workIndex);
    }

    @Override
    public WorkIndex selectByPrimaryKey(String stransactionnum) {
        return workIndexMapper.selectByPrimaryKey(stransactionnum);
    }

    @Override
    public int updateWorkIndexBusinessEmergency(WorkIndex workIndex) {
        return workIndexMapper.updateWorkIndexBusinessEmergency(workIndex);
    }

    @Override
    public List<WorkIndex> queryRecordByConditions(String currentBankArea, String currentCity, String bankKind,
                                                   String bankType, String businessCategory, String accountType,
                                                   String orgaCode, String bankEntryUserCode, String bankReviewUserCode,
                                                   String renEntryUserCode, String renRecheckUserCode, String transactionNum,
                                                   String approvalCode, String identifier, String startTime, String endTime,
                                                   List<String> bankCodeList, List<String> pbcCodeList) {
        return workIndexMapper.queryRecordByConditions(currentBankArea, currentCity, bankKind, bankType,
                businessCategory, accountType, orgaCode, bankEntryUserCode, bankReviewUserCode,
                renEntryUserCode, renRecheckUserCode, transactionNum, approvalCode,
                identifier, startTime, endTime, bankCodeList, pbcCodeList);
    }

    @Override
    public int calculateWorksByBankCode(String bankCode) {
        String bankKindChar = bankCode.substring(0, 1);
        return workIndexMapper.calculateWorksByBankCode(bankCode, bankKindChar);
    }

    @Override
    public List<WorkIndex> queryDiary(String bankOrPBC,
                                      String currentUserBankCode,
                                      String bankKind,
                                      String bankType,
                                      String bankName,
                                      Date startTime,
                                      Date endTime) {
        return workIndexMapper.queryDiary(bankOrPBC, currentUserBankCode, bankKind, bankType, bankName, startTime, endTime);
    }

    @Override
    public int occupyTransaction(WorkIndex workIndex) {
        return workIndexMapper.occupyTransaction(workIndex);
    }
}
