package com.xyh.demo.spring.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "rp_report_log")
@DynamicInsert
@DynamicUpdate
@Data
public class RpReportLogModel extends BaseModel{
	
	public static final long CAUSE_TYPE_PREVIEW = Long.valueOf(0);
	public static final long CAUSE_TYPE_EXPORT = Long.valueOf(1);
	public static final long CAUSE_TYPE_ASYNC_REPORT = Long.valueOf(2);
	public static final long CAUSE_TYPE_PRINT = Long.valueOf(3);

	/**
	 * 主键
	 */
	@Id
	@Column(name="rprl_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_RP_REPORT_LOG")
	@SequenceGenerator(name = "SEQ_RP_REPORT_LOG",sequenceName = "SEQ_RP_REPORT_LOG")
	private Long rprlId;
	/**
	 * 主键
	 */
	@Column(name="rprl_code")
	private String rprlCode;
	/**
	 * 触发生成事件类型：0 前端预览触发 1 前端导出触发 2 异步报表触发
	 */
	@Column(name="rprl_cause_type")
	private Long rprlCauseType;
	/**
	 * 外键关联：报表CODE
	 */
	@Column(name="rprl_rprp_code")
	private String rprlRprpCode;
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
	/**
	 * 结果提示信息
	 */
	@Column(name="rprl_message")
	private String rprlMessage;
	/**
	 * 总记录数
	 */
	@Column(name="rprl_records")
	private Long rprlRecords;
	/**
	 * 开始时间
	 */
	@Column(name="rprl_start_time")
	private String rprlStartTime;
	/**
	 * 结束时间
	 */
	@Column(name="rprl_finish_time")
	private String rprlFinishTime;
	/**
	 * 耗时
	 */
	@Column(name="rprl_cost_time")
	private Long rprlCostTime;
	/**
	 * 生成报表文件总页数
	 */
	@Column(name="rprl_page_count")
	private Long rprlPageCount;
	/**
	 * 生成报表文件大小，单位k
	 */
	@Column(name="rprl_file_size")
	private Long rprlFileSize;
	/**
	 * 触发生成报表人员id
	 */
	@Column(name="rprl_user")
	private String rprlUser;
	/**
	 * 报表运行期的SQL，长度512，超出则裁剪
	 */
	@Column(name="rprl_sql")
	private String rprlSql;
	/**
	 * 报表参数信息，长度100，超出则裁剪
	 */
	@Column(name="rprl_params")
	private String rprlParams;

}
