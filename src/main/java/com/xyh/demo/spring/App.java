package com.xyh.demo.spring;

import com.xyh.demo.spring.model.RpReportLogModel;
import com.xyh.demo.spring.repository.EsUserRepository;
import com.xyh.demo.spring.repository.RpReportLogRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext-jpa.xml");
        EsUserRepository esUserRepository=(EsUserRepository)applicationContext.getBean(EsUserRepository.class);
        /*EsUserModel model=esUserRepository.findOne(new Long(41));
        model.setEsusSubstr4("test1");
        model.setEsusId(new Long(411));
        model=esUserRepository.save(model);
        model.setEsusId(null);
        model.setEsusSubstr4("insert");
        model=esUserRepository.save(model);
        EsUserModel esUserModel=new EsUserModel();
        esUserModel.setEsusIsAdmin("Y");
        List<EsUserModel> list=esUserRepository.findAll(Example.of(esUserModel));*/

        /*EsUserModel esUserModel=new EsUserModel();
        esUserModel.setEsusIsAdmin("Y");
        esUserModel.setEsusId(new Long(103));
        esUserModel.setRecVer(new Long(1));
        esUserModel.setCreator("-1");esUserModel.setModifier("-1");
        esUserModel.setCreateTime(new Date());esUserModel.setModifyTime(new Date());
        esUserModel=esUserRepository.save(esUserModel);
        esUserRepository.delete(esUserModel);*/

        RpReportLogRepository rpReportLogRepository=(RpReportLogRepository)applicationContext.getBean(RpReportLogRepository.class);
        RpReportLogModel rpReportLogModel=(RpReportLogModel)rpReportLogRepository.findOne(new Long(22));
        rpReportLogRepository.findOne(new Specification<RpReportLogModel>() {
            @Override
            public Predicate toPredicate(Root<RpReportLogModel> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return null;
            }
        });
        System.in.read();
    }
}
