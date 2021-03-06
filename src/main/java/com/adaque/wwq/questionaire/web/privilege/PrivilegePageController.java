package com.adaque.wwq.questionaire.web.privilege;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adaque.wwq.questionaire.model.easyuimodel.MenuTreeModel;
import com.adaque.wwq.questionaire.po.Privilege;
import com.adaque.wwq.questionaire.po.ResultMessage;
import com.adaque.wwq.questionaire.service.privilege.PrivilegeService;


@Controller
@RequestMapping("/privilegepage")
public class PrivilegePageController {
	
	@Autowired
	private PrivilegeService privilegeService;
	
	@RequestMapping("getAllPrivilegePage.xhtml")
	public @ResponseBody List getAllPrivilegePage() {
		List<Privilege> pri_list = privilegeService.getAllPrivilege();
		return pri_list;
	}
	
	@RequestMapping("addPrivilegePage.xhtml")
	public String addPrivilegePage() {
		return "/privilege/addprivilegepage";
	}
	
	@RequestMapping("addPrivilegeSure.xhtml")
	public @ResponseBody ResultMessage addPrivilegeSure(String name) {
		ResultMessage message = new ResultMessage();
		int id = privilegeService.getMaxId();
		Privilege p = new Privilege();
		p.setId((id+1));
		p.setName(name);
		privilegeService.addPrivilege(p);
		message.setMessage("添加成功");
		return message;
	}
	
	@RequestMapping("/getPrivilegeResourceTable.xhtml")
	public @ResponseBody List getPrivilegeResourceTable(String id) {
		
		List<MenuTreeModel> re_list = privilegeService.getPrivilegeResourceById(Integer.valueOf(id));
		
		return re_list;
	}
	
	@RequestMapping("deletePrivilege.xhtml")
	public @ResponseBody ResultMessage deletePrivilege(String id) {
		
		ResultMessage message = new ResultMessage();
		privilegeService.deletePrivilegeResource(Integer.valueOf(id));
		System.out.println();
		privilegeService.deletePrivilege(Integer.valueOf(id));
		message.setMessage("删除成功");
		return message;
	}
	
	
}
