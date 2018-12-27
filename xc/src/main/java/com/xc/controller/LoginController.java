package com.xc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xc.model.Result;
import com.xc.model.Students;
import com.xc.service.CompanyService;
import com.xc.service.DepartmentService;
import com.xc.service.MenuService;
import com.xc.service.PostService;
import com.xc.service.RoleService;
import com.xc.service.StudentsService;

@Controller
@RequestMapping(value="/user")
public class LoginController {
	
	@Resource
	private StudentsService studentsService;
	
	@Resource
	private CompanyService companyService;
	
	@Resource
	private DepartmentService departmentService;
	
	@Resource
	private PostService postService;
	
	@Resource
	private RoleService roleService;
	
	@Resource
	private MenuService menuService;
	
	//登陆
	@RequestMapping(value="index")
	@ResponseBody
	public Result index(@RequestBody Students students) {
		
		int flag=studentsService.login(students);
		
		System.out.println(students.toString());
		
		if(flag == 1) {
			return new Result(false,"用户名错误！");
		}
		else if(flag==2){
			return new Result(false,"密码错误！");
		}
		else {
			return new Result(true,"登陆成功！");
		}	
	}
	
	//查询
	@RequestMapping(value="query")
	@ResponseBody
    public Result queryByName(Students students,Integer currPage,Integer PAGE_SIZE,HttpSession session ) {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("前端返回的分页数据："+"currPage:"+currPage+" "+"and"+" "+"PAGE_SIZE:"+PAGE_SIZE);
        return new Result(true,this.studentsService.queryByName(students,currPage,PAGE_SIZE),"根据用户名查找");
    }
	
	//新增前的数据初始化
	@RequestMapping(value="queryCompany")
	@ResponseBody
	public Result queryCompany() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("公司数据初始化");
		return new Result(true,this.companyService.query(),"公司数据查询");
	}
	
	@RequestMapping(value="queryDepartment")
	@ResponseBody
	public Result queryDepartment() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("部门数据初始化");
		return new Result(true,this.departmentService.query(),"部门数据查询");
	}
	
	@RequestMapping(value="queryBoss")
	@ResponseBody
	public Result queryBoss() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("上级数据初始化");
		return new Result(true,this.studentsService.queryBoss(),"上级数据查询");
	}
	
	@RequestMapping(value="queryPost")
	@ResponseBody
	public Result queryPost() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("岗位数据初始化");
		return new Result(true,this.postService.query(),"岗位数据查询");
	}
	
	@RequestMapping(value="queryRole")
	@ResponseBody
	public Result queryRole() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("角色数据初始化");
		return new Result(true,this.roleService.query(),"角色数据查询");
	}
	
	@RequestMapping(value="queryMenu")
	@ResponseBody
	public Result queryMenu() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("菜单数据初始化");
		return new Result(true,this.menuService.query(),"菜单数据查询");
	}
	
	//新增
	@RequestMapping(value="add")
	@ResponseBody
	public Result add(Students students) {
		System.out.println(students.toString());
		this.studentsService.add(students);
		return new Result(true,"新增成功！");
	}
	
	//删除
/*	@RequestMapping(value="delete")
	@ResponseBody
	public Result delete(String userId) {
		try {
			this.studentsService.delete(userId);
			return new Result(true,"删除成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false,"删除失败！");
		}
	}*/
	
	//批量删除
	@RequestMapping(value="delMore")
	@ResponseBody
	public Result delMore(String[] userIds) {
		try {
			this.studentsService.delMore(userIds);
			return new Result(true,"批量删除成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false,"批量删除失败！");
		}
	}
	
	//更新前的数据初始化
	@RequestMapping(value="preUpdate")
	@ResponseBody
	public Result preUpdate(String userId){
		return new Result(true,this.studentsService.queryById(userId),"更新之前的定点查询");
	}
	
	//更新
	@RequestMapping(value="update")
	@ResponseBody
	public void update(Students students) {
		this.studentsService.update(students);
	}
	
	@RequestMapping(value="updateRole")
	@ResponseBody
	public void updateRole(Students students) {
		this.studentsService.updateRole(students);
	}
	
	
}


