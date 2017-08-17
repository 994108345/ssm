package com.mb.wzl.entity;

import java.util.List;

/**
 * 分页实体类
 */
public class PageBean {
    private int allCountNum;//总记录数
    private int currentPage; //当前页
    private List list;//查询到的记录集数
    private int allPageNum=getAllPageNum();//总页数
    private int countNum=getCountNum();//每页多少条记录
    private int firstCountNum=getFirstCountNum();//当前页第一条记录数
    private String tableName;//要查询的表名

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String table) {
        this.tableName = table;
    }

    public int getFirstCountNum() {
        return (getCurrentPage()-1)*10;
    }

    public void setFirstCountNum(int firstCountNum) {
        this.firstCountNum = firstCountNum;
    }

    public int getAllCountNum() {
        return allCountNum;
    }

    public void setAllCountNum(int allCountNum) {
        this.allCountNum = allCountNum;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getAllPageNum() {
        return getAllCountNum()/getCountNum()+1;
    }

    public void setAllPageNum(int allPageNum) {
        this.allPageNum = allPageNum;
    }

    public int getCountNum() {
        return countNum=10;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public PageBean() {

    }
}
