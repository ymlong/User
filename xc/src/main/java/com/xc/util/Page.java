package com.xc.util;

import java.util.List;

public class Page {
    
    //ÿҳ��¼��
    public int PAGE_SIZE;
    
    //��ǰҳ
    private int currPage = 1;
    
    //�ܼ�¼��
    private int totalCount;
    
    //��ҳ��
    private int totalPage;
    
    //����
    private List data;
    
    
    /**
     * ������ҳ��
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
