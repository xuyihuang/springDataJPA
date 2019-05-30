package com.xyh.demo.spring.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Cary.Xu on 2019/5/30.
 */
@NoRepositoryBean
public interface BaseRepository<BaseModel> extends JpaRepository<BaseModel,Long>,JpaSpecificationExecutor<BaseModel> {
}
