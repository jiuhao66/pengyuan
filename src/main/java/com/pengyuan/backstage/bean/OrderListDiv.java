package com.pengyuan.backstage.bean;

import java.util.List;

/**
 * @author LX
 * @date 2019/7/10 - 21:16
 */
public class OrderListDiv {

    private List<Orders> list;

    private String sum ;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

}
