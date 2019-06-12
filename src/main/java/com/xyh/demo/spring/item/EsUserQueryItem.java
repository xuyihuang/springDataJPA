package com.xyh.demo.spring.item;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Cary.Xu on 2019/5/30.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EsUserQueryItem extends BaseQueryItem{

    // 用户登录名
    @Column(name = "esus_login_name")
    private String esusLoginName;
    // 用户登录密码
    @Column(name = "esus_login_pwd")
    private String esusLoginPwd;
    /**
            * 主表名称
    */
    @Column(name="rprl_rprp_name")
    private String rprlRprpName;
    /**
     * 状态：0 待生成 1正在生成 2 完成 3失败 4 超时
     */
    @Column(name="rprl_status")
    private Long rprlStatus;
}
