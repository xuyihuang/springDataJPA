package com.xyh.demo.spring.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ES_USER")
@DynamicUpdate
@DynamicInsert
public class EsUserModel extends BaseModel {

    // 用户表主键
    private Long esusId;
    // 公司表主键
    private Long esusEscoId;
    // 所属部门
    private Long esusEsdeId;
    // 用户登录名
    private String esusLoginName;
    // 用户登录密码
    private String esusLoginPwd;
    // 姓名
    private String esusUserNameCn;
    // 英文名
    private String esusUserNameEn;
    // 邮箱
    private String esusEmail;
    // 电话
    private String esusTel;
    // 分机号
    private String esusExtPhone;
    // 手机
    private String esusMobile;
    // 短信后缀码 ESUS_MSM_SUFFIX_CODE
    private Long esusMsmSuffixCode;
    // 传真
    private String esusFax;
    // 是否激活
    private String esusIsenable;
    // 备注
    private String esusRemark;
    // 默认模板ID
    private Long esusTemplateId;
    // 预留字段
    private String esusSubstr1;
    // 预留字段
    private String esusSubstr2;
    // 预留字段
    private String esusSubstr3;
    // 预留字段
    private String esusSubstr4;
    // 预留字段
    private String esusSubstr5;
    // 预留字段
    private String esusSubstr6;
    // 预留字段
    private String esusSubstr7;
    // 预留字段
    private String esusSubstr8;
    // 预留字段
    private Date esusSubdate1;
    // 预留字段
    private Date esusSubdate2;
    // 预留字段
    private Date esusSubdate3;
    // 预留字段
    private Date esusSubdate4;
    // 预留字段
    private Date esusSubdate5;
    // 预留字段
    private Double esusSubnum1;
    // 预留字段
    private Double esusSubnum2;
    // 预留字段
    private Double esusSubnum3;
    // 时间戳
    private Long recVer;
    // 创建时间
    private Date createTime;
    // 创建人
    private String creator;
    // 修改时间
    private Date modifyTime;
    // 修改人
    private String modifier;
    // 默认基地
    private Long esusDefaultEsstId;
    // 默认项目
    private Long esusDefaultProjectId;
    // 用户所属时区
    private String esusTimeZone;
    // 是否首次登录，默认为Y
    private String esusIsFirsetLogin;
    // 是否锁定用户，默认为N
    private String esusLocked;
    // 连续登录失败次数
    private Long esusLoginFailRecord;
    // 登录失败日期
    private Date esusLoginFailDate;
    // 规则code
    private String esusAccountRule;
    // 规则name
    private String esusAccountRuleName;
    // 是否关闭掉帐号规则校验默认为N
    private String disableRuleCheck;
    // 是否管理员
    private String esusIsAdmin;

    /**
     * Get 用户表主键
     */
    @Column(name = "ESUS_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ES_USER")
    @SequenceGenerator(name = "SEQ_ES_USER",sequenceName = "SEQ_ES_USER")
    public Long getEsusId() {
        return esusId;
    }

    /**
     * Set 用户表主键
     */
    public void setEsusId(Long esusId) {
        this.esusId = esusId;
    }

    /**
     * Get 公司表主键
     */
    @Column(name = "ESUS_ESCO_ID")
    public Long getEsusEscoId() {
        return esusEscoId;
    }

    /**
     * Set 公司表主键
     */
    public void setEsusEscoId(Long esusEscoId) {
        this.esusEscoId = esusEscoId;
            }

    /**
     * Get 所属部门
     */
    @Column(name = "ESUS_ESDE_ID")
    public Long getEsusEsdeId() {
        return esusEsdeId;
    }

    /**
     * Set 所属部门
     */
    public void setEsusEsdeId(Long esusEsdeId) {
        this.esusEsdeId = esusEsdeId;
            }

    /**
     * Get 用户登录名
     */
    @Column(name = "ESUS_LOGIN_NAME")
    public String getEsusLoginName() {
        return esusLoginName;
    }

    /**
     * Set 用户登录名
     */
    public void setEsusLoginName(String esusLoginName) {
        this.esusLoginName = esusLoginName;
            }

    /**
     * Get 用户登录密码
     */
    @Column(name = "ESUS_LOGIN_PWD")
    public String getEsusLoginPwd() {
        return esusLoginPwd;
    }

    /**
     * Set 用户登录密码
     */
    public void setEsusLoginPwd(String esusLoginPwd) {
        this.esusLoginPwd = esusLoginPwd;
            }

    /**
     * Get 姓名
     */
    @Column(name = "ESUS_USER_NAME_CN")
    public String getEsusUserNameCn() {
        return esusUserNameCn;
    }

    /**
     * Set 姓名
     */
    public void setEsusUserNameCn(String esusUserNameCn) {
        this.esusUserNameCn = esusUserNameCn;
            }

    /**
     * Get 英文名
     */
    @Column(name = "ESUS_USER_NAME_EN")
    public String getEsusUserNameEn() {
        return esusUserNameEn;
    }

    /**
     * Set 英文名
     */
    public void setEsusUserNameEn(String esusUserNameEn) {
        this.esusUserNameEn = esusUserNameEn;
            }

    /**
     * Get 邮箱
     */
    @Column(name = "ESUS_EMAIL")
    public String getEsusEmail() {
        return esusEmail;
    }

    /**
     * Set 邮箱
     */
    public void setEsusEmail(String esusEmail) {
        this.esusEmail = esusEmail;
            }

    /**
     * Get 电话
     */
    @Column(name = "ESUS_TEL")
    public String getEsusTel() {
        return esusTel;
    }

    /**
     * Set 电话
     */
    public void setEsusTel(String esusTel) {
        this.esusTel = esusTel;
            }

    /**
     * Get 分机号
     */
    @Column(name = "ESUS_EXT_PHONE")
    public String getEsusExtPhone() {
        return esusExtPhone;
    }

    /**
     * Set 分机号
     */
    public void setEsusExtPhone(String esusExtPhone) {
        this.esusExtPhone = esusExtPhone;
            }

    /**
     * Get 手机
     */
    @Column(name = "ESUS_MOBILE")
    public String getEsusMobile() {
        return esusMobile;
    }

    /**
     * Set 手机
     */
    public void setEsusMobile(String esusMobile) {
        this.esusMobile = esusMobile;
            }

    /**
     * Get 短信后缀码
     */
    @Column(name = "ESUS_MSM_SUFFIX_CODE")
    public Long getEsusMsmSuffixCode() {
        return esusMsmSuffixCode;
    }

    /**
     * Set 短信后缀码
     */
    public void setEsusMsmSuffixCode(Long esusMsmSuffixCode) {
        this.esusMsmSuffixCode = esusMsmSuffixCode;
            }

    /**
     * Get 传真
     */
    @Column(name = "ESUS_FAX")
    public String getEsusFax() {
        return esusFax;
    }

    /**
     * Set 传真
     */
    public void setEsusFax(String esusFax) {
        this.esusFax = esusFax;
            }

    /**
     * Get 是否激活 Y:是 N:否
     */
    @Column(name = "ESUS_ISENABLE")
    public String getEsusIsenable() {
        return esusIsenable;
    }

    /**
     * Set 是否激活 Y:是 N:否
     */
    public void setEsusIsenable(String esusIsenable) {
        this.esusIsenable = esusIsenable;
            }

    /**
     * Get 备注
     */
    @Column(name = "ESUS_REMARK")
    public String getEsusRemark() {
        return esusRemark;
    }

    /**
     * Set 备注
     */
    public void setEsusRemark(String esusRemark) {
        this.esusRemark = esusRemark;
            }

    /**
     * Get 默认模板ID
     */
    @Column(name = "ESUS_TEMPLATE_ID")
    public Long getEsusTemplateId() {
        return esusTemplateId;
    }

    /**
     * Set 默认模板ID
     */
    public void setEsusTemplateId(Long esusTemplateId) {
        this.esusTemplateId = esusTemplateId;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR1")
    public String getEsusSubstr1() {
        return esusSubstr1;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr1(String esusSubstr1) {
        this.esusSubstr1 = esusSubstr1;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR2")
    public String getEsusSubstr2() {
        return esusSubstr2;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr2(String esusSubstr2) {
        this.esusSubstr2 = esusSubstr2;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR3")
    public String getEsusSubstr3() {
        return esusSubstr3;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr3(String esusSubstr3) {
        this.esusSubstr3 = esusSubstr3;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR4")
    public String getEsusSubstr4() {
        return esusSubstr4;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr4(String esusSubstr4) {
        this.esusSubstr4 = esusSubstr4;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR5")
    public String getEsusSubstr5() {
        return esusSubstr5;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr5(String esusSubstr5) {
        this.esusSubstr5 = esusSubstr5;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR6")
    public String getEsusSubstr6() {
        return esusSubstr6;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr6(String esusSubstr6) {
        this.esusSubstr6 = esusSubstr6;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBDATE1")
    public Date getEsusSubdate1() {
        return esusSubdate1;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubdate1(Date esusSubdate1) {
        this.esusSubdate1 = esusSubdate1;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBDATE2")
    public Date getEsusSubdate2() {
        return esusSubdate2;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubdate2(Date esusSubdate2) {
        this.esusSubdate2 = esusSubdate2;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBDATE3")
    public Date getEsusSubdate3() {
        return esusSubdate3;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubdate3(Date esusSubdate3) {
        this.esusSubdate3 = esusSubdate3;
            }

    /**
     * Get 时间戳
     */
    @Column(name = "REC_VER")
    @Version
    public Long getRecVer() {
        return recVer;
    }

    /**
     * Set 时间戳
     */
    public void setRecVer(Long recVer) {
        this.recVer = recVer;
            }

    /**
     * Get 创建时间
     */
    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Set 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
            }

    /**
     * Get 创建人
     */
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    /**
     * Set 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
            }

    /**
     * Get 修改时间
     */
    @Column(name = "MODIFY_TIME")
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * Set 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
            }

    /**
     * Get 修改人
     */
    @Column(name = "MODIFIER")
    public String getModifier() {
        return modifier;
    }

    /**
     * Set 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
            }

    /**
     * Get 默认基地
     */
    @Column(name = "ESUS_DEFAULT_ESST_ID")
    public Long getEsusDefaultEsstId() {
        return esusDefaultEsstId;
    }

    /**
     * Set 默认基地
     */
    public void setEsusDefaultEsstId(Long esusDefaultEsstId) {
        this.esusDefaultEsstId = esusDefaultEsstId;
            }

    /**
     * Get 默认项目
     */
    @Column(name = "ESUS_DEFAULT_PROJECT_ID")
    public Long getEsusDefaultProjectId() {
        return esusDefaultProjectId;
    }

    /**
     * Set 默认项目
     */
    public void setEsusDefaultProjectId(Long esusDefaultProjectId) {
        this.esusDefaultProjectId = esusDefaultProjectId;
            }

    /**
     * Get 用户所属时区
     */
    @Column(name = "ESUS_TIME_ZONE")
    public String getEsusTimeZone() {
        return esusTimeZone;
    }

    /**
     * Set 用户所属时区
     */
    public void setEsusTimeZone(String esusTimeZone) {
        this.esusTimeZone = esusTimeZone;
            }

    /**
     * Get 是否首次登录，默认为Y
     */
    @Column(name = "ESUS_IS_FIRSET_LOGIN")
    public String getEsusIsFirsetLogin() {
        return esusIsFirsetLogin;
    }

    /**
     * Set 是否首次登录，默认为Y
     */
    public void setEsusIsFirsetLogin(String esusIsFirsetLogin) {
        this.esusIsFirsetLogin = esusIsFirsetLogin;
            }

    /**
     * Get 是否锁定用户，默认为N
     */
    @Column(name = "ESUS_LOCKED")
    public String getEsusLocked() {
        return esusLocked;
    }

    /**
     * Set 是否锁定用户，默认为N
     */
    public void setEsusLocked(String esusLocked) {
        this.esusLocked = esusLocked;
            }

    /**
     * Get 连续登录失败次数
     */
    @Column(name = "ESUS_LOGIN_FAIL_RECORD")
    public Long getEsusLoginFailRecord() {
        return esusLoginFailRecord;
    }

    /**
     * Set 连续登录失败次数
     */
    public void setEsusLoginFailRecord(Long esusLoginFailRecord) {
        this.esusLoginFailRecord = esusLoginFailRecord;
            }

    /**
     * Get 登录失败日期
     */
    @Column(name = "ESUS_LOGIN_FAIL_DATE")
    public Date getEsusLoginFailDate() {
        return esusLoginFailDate;
    }

    /**
     * Set 登录失败日期
     */
    public void setEsusLoginFailDate(Date esusLoginFailDate) {
        this.esusLoginFailDate = esusLoginFailDate;
            }

    @Column(name = "ESUS_ACCOUNT_RULE")
    public String getEsusAccountRule() {
        return esusAccountRule;
    }

    public void setEsusAccountRule(String esusAccountRule) {
        this.esusAccountRule = esusAccountRule;
            }

    @Column(name = "ESUS_ACCOUNT_RULE_NAME")
    public String getEsusAccountRuleName() {
        return esusAccountRuleName;
    }

    public void setEsusAccountRuleName(String esusAccountRuleName) {
        this.esusAccountRuleName = esusAccountRuleName;
            }

    @Column(name = "DISABLE_RULE_CHECK")
    public String getDisableRuleCheck() {
        return disableRuleCheck;
    }

    public void setDisableRuleCheck(String disableRuleCheck) {
        this.disableRuleCheck = disableRuleCheck;
            }

    @Column(name = "ESUS_IS_ADMIN")
    public String getEsusIsAdmin() {
        return esusIsAdmin;
    }

    public void setEsusIsAdmin(String esusIsAdmin) {
        this.esusIsAdmin = esusIsAdmin;
            }


    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBDATE4")
    public Date getEsusSubdate4() {
        return esusSubdate4;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubdate4(Date esusSubdate4) {
        this.esusSubdate4 = esusSubdate4;
            }


    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBDATE5")
    public Date getEsusSubdate5() {
        return esusSubdate5;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubdate5(Date esusSubdate5) {
        this.esusSubdate5 = esusSubdate5;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR7")
    public String getEsusSubstr7() {
        return esusSubstr7;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr7(String esusSubstr7) {
        this.esusSubstr7 = esusSubstr7;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBSTR8")
    public String getEsusSubstr8() {
        return esusSubstr8;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubstr8(String esusSubstr8) {
        this.esusSubstr8 = esusSubstr8;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBNUM1")
    public Double getEsusSubnum1() {
        return esusSubnum1;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubnum1(Double esusSubnum1) {
        this.esusSubnum1 = esusSubnum1;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBNUM2")
    public Double getEsusSubnum2() {
        return esusSubnum2;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubnum2(Double esusSubnum2) {
        this.esusSubnum2 = esusSubnum2;
            }

    /**
     * Get 预留字段
     */
    @Column(name = "ESUS_SUBNUM3")
    public Double getEsusSubnum3() {
        return esusSubnum3;
    }

    /**
     * Set 预留字段
     */
    public void setEsusSubnum3(Double esusSubnum3) {
        this.esusSubnum3 = esusSubnum3;
            }
}
