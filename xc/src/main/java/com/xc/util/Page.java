package com.xc.util;

import java.util.List;

public class Page {
    
    //每页记录数
    public int PAGE_SIZE;
    
    //当前页
    private int currPage = 1;
    
    //总记录数
    private int totalCount;
    
    //总页数
    private int totalPage;
    
    //数据
    private List data;
    
    
    /**
     * 计算总页数
     */
    
    public void init() {
        if(this.totalCount %PAGE_SIZE == 0) {
            this.totalPage = this.totalCount/PAGE_SIZE;
        }else {
            this.totalPage = this.totalCount/PAGE_SIZE+1;
        }
    }


    public int getCurrPage() {
        return currPage;
    }


    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }


    public int getTotalCount() {
        return totalCount;
    }


    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    public int getTotalPage() {
        return totalPage;
    }


    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }


    public List getData() {
        return data;
    }


    public void setData(List data) {
        this.data = data;
    }
    
    public int getPageSize() {
        return PAGE_SIZE;
    }


	public int getPAGE_SIZE() {
		return PAGE_SIZE;
	}


	public void setPAGE_SIZE(int pAGE_SIZE) {
		PAGE_SIZE = pAGE_SIZE;
	}
    
    

}
