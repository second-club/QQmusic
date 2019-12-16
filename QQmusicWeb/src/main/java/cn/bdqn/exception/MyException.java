package cn.bdqn.exception;

public class MyException extends Exception{

    /*
    *   SpringMVC处理异常有三种方式，只使用最常用的两种
    * */
    // 方式一、错误提示消息
    private String message;

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
