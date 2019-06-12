package com.xyh.demo.spring;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.xyh.demo.spring.item.EsUserQueryItem;
import com.xyh.demo.spring.model.RpReportLogModel;
import com.xyh.demo.spring.repository.EsUserRepository;
import com.xyh.demo.spring.repository.RpReportLogRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

import java.util.List;

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
        RpReportLogModel rpReportLogModel;
        List<RpReportLogModel> rpReportLogModels;
        Page<RpReportLogModel> rpReportLogModelPage;
        List<EsUserQueryItem> esUserItemList;
        List<Tuple> tuples;

        /*rpReportLogModel=(RpReportLogModel)rpReportLogRepository.findOne(new Long(22));

        RpReportLogModel condition=new RpReportLogModel();
        condition.setRprlStatus(new Long(3));
        rpReportLogModels=rpReportLogRepository.findAll(Example.of(condition));
        Pageable pageable=new PageRequest(2,10);
        rpReportLogModelPage=rpReportLogRepository.findAll(Example.of(condition), pageable);

        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Long[] rprlIdArray=new Long[]{new Long(41),new Long(42),new Long(43)};
                criteriaQuery.where(root.get("rprlId").in(rprlIdArray));
                Predicate predicate1=criteriaBuilder.equal(root.get("rprlCauseType"),0);//rprl_cause_type=0
                Predicate predicate2=criteriaBuilder.or(root.get("rprlId").isNotNull(),root.get("rprlStatus").in(2,3));
                criteriaQuery.where(predicate1,predicate2);
                return null;
            }
        };
        rpReportLogModels= rpReportLogRepository.findAll(specification);
        rpReportLogModelPage=rpReportLogRepository.findAll(specification,pageable);

        List<EsUserModel> esUserModels=esUserRepository.findEsUserModels(new Long(283));*/

        //多表关联查询
        /*esUserItemList=esUserRepository.findEsUserItems("2");*/

        //queryDSL
        JPAQueryFactory jpaQueryFactory=(JPAQueryFactory)applicationContext.getBean(JPAQueryFactory.class);
        /*rpReportLogModels=jpaQueryFactory.select(QRpReportLogModel.rpReportLogModel).from(QRpReportLogModel.rpReportLogModel).where(QRpReportLogModel.rpReportLogModel.rprlStatus.eq(new Long(2))).fetch();*/
        /*List<EsUserModel> jpaQuery=jpaQueryFactory.select(QEsUserModel.esUserModel)
                .from(QEsUserModel.esUserModel, QRpReportLogModel.rpReportLogModel)
                .where(QRpReportLogModel.rpReportLogModel.rprlStatus.eq(new Long(2)).and(QEsUserModel.esUserModel.esusId.eq(QRpReportLogModel.rpReportLogModel.rprlId)))
                .fetch();*/
        /*tuples=jpaQueryFactory.select(QEsUserModel.esUserModel.esusLoginName,QEsUserModel.esUserModel.createTime,QRpReportLogModel.rpReportLogModel.rprlStatus)
                .from(QEsUserModel.esUserModel, QRpReportLogModel.rpReportLogModel)
                .where(QRpReportLogModel.rpReportLogModel.rprlStatus.eq(new Long(2)).and(QEsUserModel.esUserModel.esusId.eq(QRpReportLogModel.rpReportLogModel.rprlId)))
                .fetch();*/

        /*BooleanExpression booleanExpression= Expressions.dateTemplate(Date.class, "to_date({0},'{1s}')", Expressions.stringTemplate("function('TO_CHAR', {0}, {1})", QEsUserModel.esUserModel.createTime,"yyyy-MM-dd"), "yyyy-MM-dd")
                .gt(Expressions.dateTemplate(Date.class, "to_date({0},'{1s}')", Expressions.stringTemplate("function('TO_CHAR', {0}, {1})", QEsUserModel.esUserModel.modifyTime,"yyyy-MM-dd"), "yyyy-MM-dd"));
        List<EsUserModel> esUserModels=jpaQueryFactory.select(QEsUserModel.esUserModel).from(QEsUserModel.esUserModel)
            .where(booleanExpression).fetch();*/

        //rpReportLogModels=jpaQueryFactory.selectFrom(QRpReportLogModel.rpReportLogModel).where(QRpReportLogModel.rpReportLogModel.rprlId.eq(new Long(22))).setLockMode(LockModeType.PESSIMISTIC_WRITE).fetch();

        //rpReportLogModels=rpReportLogRepository.modelsByRprlIdForUpdate();
        rpReportLogModels=rpReportLogRepository.findModelsByRprlIdForUpdate();

        /*EntityManager entityManager=(EntityManager)applicationContext.getBean(EntityManager.class);
        entityManager.getCriteriaBuilder().conjunction();*/
        /*报错
        esUserItemList=jpaQueryFactory.select(QEsUserQueryItem.esUserQueryItem)
                .from(QEsUserModel.esUserModel, QRpReportLogModel.rpReportLogModel)
                .where(QRpReportLogModel.rpReportLogModel.rprlStatus.eq(new Long(2)).and(QEsUserModel.esUserModel.esusId.eq(QRpReportLogModel.rpReportLogModel.rprlId)))
                .fetch();*/

        System.in.read();
    }
}
