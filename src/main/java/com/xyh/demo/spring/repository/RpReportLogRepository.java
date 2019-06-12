package com.xyh.demo.spring.repository;

import com.xyh.demo.spring.model.RpReportLogModel;
import com.xyh.demo.spring.repository.common.BaseRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Cary.Xu on 2019/5/30.
 */
public interface RpReportLogRepository extends BaseRepository<RpReportLogModel>,RpReportLogRepositoryPlus {

    @Query(nativeQuery = true,value = "select * from rp_report_log t where t.rprl_id=22 for update")
    List<RpReportLogModel> findModelsByRprlIdForUpdate();

}
