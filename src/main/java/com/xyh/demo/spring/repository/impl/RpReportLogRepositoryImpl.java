package com.xyh.demo.spring.repository.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.xyh.demo.spring.model.QRpReportLogModel;
import com.xyh.demo.spring.model.RpReportLogModel;
import com.xyh.demo.spring.repository.RpReportLogRepositoryPlus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Cary.Xu on 2019/6/11.
 */
public class RpReportLogRepositoryImpl implements RpReportLogRepositoryPlus{

    @Autowired
    JPAQueryFactory jpaQueryFactory;

    @Override
    public List<RpReportLogModel> modelsByRprlIdForUpdate() {
        List<RpReportLogModel> rpReportLogModels=jpaQueryFactory.selectFrom(QRpReportLogModel.rpReportLogModel).where(QRpReportLogModel.rpReportLogModel.rprlId.eq(new Long(22))).fetch();
        return rpReportLogModels;
    }
}
