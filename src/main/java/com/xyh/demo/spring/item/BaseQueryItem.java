package com.xyh.demo.spring.item;

import com.xyh.demo.spring.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Cary.Xu on 2019/5/31.
 */
@MappedSuperclass
public abstract class BaseQueryItem extends BaseModel{

    @Id
    @Column(name = "rownum_")
    private String rownum;;

}
