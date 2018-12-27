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
	
	//��½
	@RequestMapping(value="index")
	@ResponseBody
	public Result index(@RequestBody Students students) {
		
		int flag=studentsService.login(students);
		
		System.out.println(students.toString());
		
		if(flag == 1) {
			return new Result(false,"�û�������");
		}
		else if(flag==2){
			return new Result(false,"�������");
		}
		else {
			return new Result(true,"��½�ɹ���");
		}	
	}
	
	//��ѯ
	@RequestMapping(value="query")
	@ResponseBody
    public Result queryByName(Students students,Integer currPage,Integer PAGE_SIZE,HttpSession session ) {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("ǰ�˷��صķ�ҳ���ݣ�"+"currPage:"+currPage+" "+"and"+" "+"PAGE_SIZE:"+PAGE_SIZE);
        return new Result(true,this.studentsService.queryByName(students,currPage,PAGE_SIZE),"�����û�������");
    }
	
	//����ǰ�����ݳ�ʼ��
	@RequestMapping(value="queryCompany")
	@ResponseBody
	public Result queryCompany() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("��˾���ݳ�ʼ��");
		return new Result(true,this.companyService.query(),"��˾���ݲ�ѯ");
	}
	
	@RequestMapping(value="queryDepartment")
	@ResponseBody
	public Result queryDepartment() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("�������ݳ�ʼ��");
		return new Result(true,this.departmentService.query(),"�������ݲ�ѯ");
	}
	
	@RequestMapping(value="queryBoss")
	@ResponseBody
	public Result queryBoss() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("�ϼ����ݳ�ʼ��");
		return new Result(true,this.studentsService.queryBoss(),"�ϼ����ݲ�ѯ");
	}
	
	@RequestMapping(value="queryPost")
	@ResponseBody
	public Result queryPost() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("��λ���ݳ�ʼ��");
		return new Result(true,this.postService.query(),"��λ���ݲ�ѯ");
	}
	
	@RequestMapping(value="queryRole")
	@ResponseBody
	public Result queryRole() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("��ɫ���ݳ�ʼ��");
		return new Result(true,this.roleService.query(),"��ɫ���ݲ�ѯ");
	}
	
	@RequestMapping(value="queryMenu")
	@ResponseBody
	public Result queryMenu() {
		System.out.println("***********************************************************************************************************************************");
		System.out.println("�˵����ݳ�ʼ��");
		return new Result(true,this.menuService.query(),"�˵����ݲ�ѯ");
	}
	
	//����
	@RequestMapping(value="add")
	@ResponseBody
	public Result add(Students students) {
		System.out.println(students.toString());
		this.studentsService.add(students);
		return new Result(true,"�����ɹ���");
	}
	
	//ɾ��
/*	@RequestMapping(value="delete")
	@ResponseBody
	public Result delete(String userId) {
		try {
			this.studentsService.delete(userId);
			return new Result(true,"ɾ���ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false,"ɾ��ʧ�ܣ�");
		}
	}*/
	
	//����ɾ��
	@RequestMapping(value="delMore")
	@ResponseBody
	public Result delMore(String[] userIds) {
		try {
			this.studentsService.delMore(userIds);
			return new Result(true,"����ɾ���ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false,"����ɾ��ʧ�ܣ�");
		}
	}
	
	//����ǰ�����ݳ�ʼ��
	@RequestMapping(value="preUpdate")
	@ResponseBody
	public Result preUpdate(String userId){
		return new Result(true,this.studentsService.queryById(userId),"����֮ǰ�Ķ����ѯ");
	}
	
	//����
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


