package com.xc.util;

import java.util.ArrayList;
import java.util.List;

import com.xc.model.Role;

public class TreeRole {
	
	/** 
     * 使用递归方法建树 
     * @param treeNodes 
     * @return 
     */  
    public static List<Role> buildByRecursive(List<Role> roles) {
    	
    	Integer i=1;
        List<Role> trees = new ArrayList<Role>();  
        for (Role role : roles) {  
            if (i.equals(role.getRoleId())) {  
                trees.add(findChildren(role,roles));  
            }  
        }  
        return trees;  
    }  
  
    /** 
     * 递归查找子节点 
     * @param treeNodes 
     * @return 
     */  
    public static Role findChildren(Role role,List<Role> roles) {  
    	role.setChildren(new ArrayList<Role>());

        for (Role it : roles) {  
            if(role.getRoleId().equals(it.getParentId())) {  
                if (role.getChildren() == null) {  
                	role.setChildren(new ArrayList<Role>());  
                }  
                role.getChildren().add(findChildren(it,roles));  
            }  
        }  
        return role;  
    }  

}
