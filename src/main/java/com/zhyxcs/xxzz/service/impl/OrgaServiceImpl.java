package com.zhyxcs.xxzz.service.impl;

import com.zhyxcs.xxzz.domain.Orga;
import com.zhyxcs.xxzz.mapper.OrgaMapper;
import com.zhyxcs.xxzz.service.OrgaService;
import com.zhyxcs.xxzz.utils.OrgaLevelEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgaServiceImpl implements OrgaService {
    @Autowired
    private OrgaMapper orgaMapper;

    @Override
    public Orga selectByPrimaryKey(String sbankcode) {
        return orgaMapper.selectByPrimaryKey(sbankcode);
    }

    @Override
    public List<Orga> selectByBankTypeAndPbcCode(String pbcCode, String bankTypeCode) {
        return orgaMapper.selectByBankTypeAndPbcCode(pbcCode, bankTypeCode);
    }

    @Override
    public List<Orga> selectByBankKindAndPbcCode(String pbcCode, String bankKind) {
        return orgaMapper.selectByBankKindAndPbcCode(pbcCode, bankKind);
    }

    @Override
    public OrgaLevelEnum getOrgaLevel(String bankCode) {
        String bankLevel = orgaMapper.getOrgaLevel(bankCode);
        return OrgaLevelEnum.valueOf(bankLevel);
    }

    @Override
    public List<String> getUnderBankcodeList(String bankCode) {
        return orgaMapper.getUnderBankcodeList(bankCode);
    }

    @Override
    public List<Orga> getByFullConditions(Orga orga) {
        return orgaMapper.getByFullConditions(orga);
    }

    @Override
    public List<Orga> getPBCList() {
        return orgaMapper.getPBCList();
    }

    @Override
    public List<Orga> pageOrgaWithConditions(String bankAreaCode, String bankCityCode, String bankKind, String bankTypeCode, String topBankCode, String pbcode, String bankCode, String bankName, String bankState) {
        return orgaMapper.pageOrgaWithConditions(bankAreaCode, bankCityCode, bankKind, bankTypeCode, topBankCode, pbcode, bankCode, bankName, bankState);
    }

    @Override
    public int calculateNextOrgaNum(String bankCode) {
        String bankKindChar = bankCode.substring(0, 1);
        return orgaMapper.calculateNextOrgaNum(bankCode, bankKindChar);
    }

    @Override
    public int deleteByBankCodeArray(String[] bankCodeArray) {
        return orgaMapper.deleteByBankCodeArray(bankCodeArray);
    }

    @Override
    public int insert(Orga orga) {
        return orgaMapper.insert(orga);
    }

    @Override
    public int updateByPrimaryKeyCheckPropertyIsNull(Orga orga) {
        return orgaMapper.updateByPrimaryKeyCheckPropertyIsNull(orga);
    }

    @Override
    public List<Orga> ifXian(String bankCode, String bankKind) {
        return orgaMapper.ifXian(bankCode, bankKind);
    }
}
