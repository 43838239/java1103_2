package com.ocp16_exception;


public class LoginException extends Exception{
    public LoginException(String[] args) {
        //將錯誤訊息傳給父類別
     super(string);
    }
//自訂一個方法
    public void 怎麼辦() {
        System.out.println("請重新登入");
    }
}
