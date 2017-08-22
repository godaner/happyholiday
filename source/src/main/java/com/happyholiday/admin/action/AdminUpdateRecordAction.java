package com.happyholiday.admin.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.happyholiday.action.AdminsBaseAction;
import com.happyholiday.admin.BackStatic;
import com.happyholiday.admin.exception.AdminsException;
import com.happyholiday.admin.pageModel.PageAdminUpdateRecord;
import com.happyholiday.admin.service.AdminUpdateRecordServiceI;
import com.happyholiday.admin.util.BackReturnJSON;
import com.happyholiday.admin.util.BackTools;
import com.happyholiday.model.Admins;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 配置action
 * 
 * @author Jhon
 * 
 */
@Namespace("/")
@Action(value = "adminUpdateRecordAction")
public class AdminUpdateRecordAction extends AdminsBaseAction implements
		ModelDriven<PageAdminUpdateRecord> {

	
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(AdminUpdateRecordAction.class);
	public PageAdminUpdateRecord pageAdminUpdateRecord = new PageAdminUpdateRecord();
	@Override
	public PageAdminUpdateRecord getModel() {
		return pageAdminUpdateRecord;
	}
	

	private AdminUpdateRecordServiceI adminUpdateRecordService;

	public AdminUpdateRecordServiceI getAdminUpdateRecordService() {
		return adminUpdateRecordService;
	}
	@Autowired
	public void setAdminUpdateRecordService(
			AdminUpdateRecordServiceI adminUpdateRecordService) {
		this.adminUpdateRecordService = adminUpdateRecordService;
	}

	public void getDatagrid() {
		/**
		 * 获取当前在线admin 执行事务 返回结果
		 */
		BackReturnJSON<PageAdminUpdateRecord> returnJSON = new BackReturnJSON<PageAdminUpdateRecord>();
		try {
			// 1.获取当前在线admin
			Admins onlineAdmin = BackTools.getOnlineAdmin();
			// 2.执行事务
			returnJSON = adminUpdateRecordService.getDatagrid(onlineAdmin,pageAdminUpdateRecord);
			returnJSON.setMsg("读取信息成功！");
			returnJSON.setSuccess(true);
		} catch (Exception e) {
			returnJSON.setMsg(e.getMessage());
			returnJSON.setSuccess(false);
			e.printStackTrace();
		} finally {
			logger.info(returnJSON);
			// 返回结果
			super.writeJSON(returnJSON);
		}
	}


}
