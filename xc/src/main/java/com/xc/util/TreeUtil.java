package com.xc.util;

import java.util.ArrayList;
import java.util.List;

import com.xc.model.Department;

public class TreeUtil {
	
	/** 
     * ʹ�õݹ鷽������ 
     * @param treeNodes 
     * @return 
     */  
    public static List<Department> buildByRecursive(List<Department> departments) {
    	
    	Integer i=1;
        List<Department> trees = new ArrayList<Department>();  
        for (Department department : departments) {  
            if (i.equals(department.getDepartId())) {  
                trees.add(findChildren(department,departments));  
            }  
        }  
        return trees;  
    }  
  
    /** 
     * �ݹ�����ӽڵ� 
     * @param treeNodes 
     * @return 
     */  
    public static Department findChildren(Department department,List<Department> departments) {  
    	department.setChildren(new ArrayList<Department>());

        for (Department it : departments) {  
            if(department.getDepartId().equals(it.getPartId())) {  
                if (department.getChildren() == null) {  
                	department.setChildren(new ArrayList<Department>());  
                }  
                department.getChildren().add(findChildren(it,departments));  
            }  
        }  
        return department;  
    }  

}
