package com.xyh.demo.spring.repository.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.xyh.demo.spring.model.QRpReportLogModel;
import com.xyh.demo.spring.model.RpReportLogModel;
import com.xyh.demo.spring.repository.RpReportLogRepositoryPlus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.persistence.LockModeType;
import java.util.List;

/**
 * Created by Cary.Xu on 2019/6/11.
 */
public class RpReportLogRepositoryImpl implements RpReportLogRepositoryPlus{

    @Autowired
    JPAQueryFactory jpaQueryFactory;

    @Override
    public List<RpReportLogModel> modelsByRprlIdForUpdate() {
        List<RpReportLogModel> rpReportLogModels=jpaQueryFactory.selectFrom(QRpReportLogModel.rpReportLogModel).where(QRpReportLogModel.rpReportLogModel.rprlId.eq(new Long(22))).setLockMode(LockModeType.PESSIMISTIC_WRITE).fetch();
        return rpReportLogModels;
    }
}
