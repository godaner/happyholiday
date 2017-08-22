package com.happyholiday.admin.interceptor;

import org.compass.core.json.JsonObject;

import com.alibaba.fastjson.JSON;
import com.happyholiday.admin.BackStatic;
import com.happyholiday.admin.action.AdminsAction;
import com.happyholiday.admin.util.BackReturnJSON;
import com.happyholiday.admin.util.BackTools;
import com.happyholiday.model.Admins;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class AdminOnlineInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Admins onlineAdmin = BackTools.getOnlineAdmin();
		BackReturnJSON  retJSON = new BackReturnJSON();
		if(onlineAdmin==null){
			retJSON.setMsg("您已离线！");
			//kineditor需要读取error属性
			retJSON.setError(1);
			//easyui的datagrid需要读取success属性
			retJSON.setSuccess(false);
			retJSON.setOnline(false);
			BackTools.writeJSON(retJSON);
		}else if(onlineAdmin.getStatus()==0){
			BackTools.getSession().invalidate();
			retJSON.setMsg("您的账户已被冻结，请联系相关管理员！");
			retJSON.setSuccess(false);
			retJSON.setError(1);
			retJSON.setOnline(false);
			BackTools.writeJSON(retJSON);
		}else{
			invocation.invoke();
		}
		return null;
	}

}
