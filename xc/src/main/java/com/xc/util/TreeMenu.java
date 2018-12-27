package com.xc.util;

import java.util.ArrayList;
import java.util.List;

import com.xc.model.Menu;
import com.xc.model.Role;

public class TreeMenu {
	
	/** 
     * 使用递归方法建树 
     * @param treeNodes 
     * @return 
     */  
    public static List<Menu> buildByRecursive(List<Menu> menus) {
    	
    	String i="0";
        List<Menu> trees = new ArrayList<Menu>();  
        for (Menu menu : menus) {  
            if (i.equals(menu.getParentId())) {  
                trees.add(findChildren(menu,menus));  
            }  
        }  
        return trees;  
    }  
  
    /** 
     * 递归查找子节点 
     * @param treeNodes 
     * @return 
     */  
    public static Menu findChildren(Menu menu,List<Menu> menus) {  
    	menu.setChildren(new ArrayList<Menu>());

        for (Menu it : menus) {  
            if(menu.getMenuId().equals(it.getParentId())) {  
                if (menu.getChildren() == null) {  
                	menu.setChildren(new ArrayList<Menu>());  
                }  
                menu.getChildren().add(findChildren(it,menus));  
            }  
        }  
        return menu;  
    }  

}
