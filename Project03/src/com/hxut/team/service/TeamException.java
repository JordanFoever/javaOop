package com.hxut.team.service;

/**
 * @author weijiangquan
 * @date 2022/4/29 -20:55
 * @Description 自定义的异常类
 *
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229348L;

    public TeamException(){
        super();
    }

    public TeamException(String msg){
        super(msg);
    }
}
