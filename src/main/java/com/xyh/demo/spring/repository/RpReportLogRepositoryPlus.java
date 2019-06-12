package com.xyh.demo.spring.repository;

import com.xyh.demo.spring.model.RpReportLogModel;

import java.util.List;

/**
 * Created by Cary.Xu on 2019/5/30.
 */
public interface RpReportLogRepositoryPlus {

    List<RpReportLogModel> modelsByRprlIdForUpdate();

}
