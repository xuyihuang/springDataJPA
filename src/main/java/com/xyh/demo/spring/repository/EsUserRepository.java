package com.xyh.demo.spring.repository;

import com.xyh.demo.spring.item.EsUserQueryItem;
import com.xyh.demo.spring.model.EsUserModel;
import com.xyh.demo.spring.repository.common.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Cary.Xu on 2019/5/30.
 */
public interface EsUserRepository extends BaseRepository<EsUserModel> {

    /*@Query(value = "select new com.xyh.demo.spring.item.EsUserQueryItem(esus.esusLoginName as esusLoginName,esus.esusLoginPwd as esusLoginPwd,rprl.rprlRprpName as rprlRprpName,rprl.rprlStatus as rprlStatus) from com.xyh.demo.spring.model.EsUserModel esus join com.xyh.demo.spring.model.RpReportLogModel rprl on esus.esusId=rprl.rprlId where rprl.rprlStatus=:rprlStatus")
    List<EsUserQueryItem> findEsUserItems(@Param("rprlStatus") String rprlStatus);*/

    @Query(value = "select esus from EsUserModel esus where esus.esusEscoId=:esusEscoId")
    List<EsUserModel> findEsUserModels(@Param("esusEscoId") Long esusEscoId);

}
