package com.technology.rediscenter.web.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller("UserAction")
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 9026533527322851032L;

    public String execute() {
        ServletActionContext.getRequest().setAttribute("message", "struts,spring测试");
        return SUCCESS;
    }
}