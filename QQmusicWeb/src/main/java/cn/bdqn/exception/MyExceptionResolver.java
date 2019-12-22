package cn.bdqn.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*编写异常处理器，需要实现一个接口HandlerExceptionResolver*/
public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        // 统一处理的异常
        MyException exception = null;

        if(e instanceof MyException){
            exception = (MyException) e;
        }else {
            exception = new MyException("系统开小差了,请检查网络...");
        }

        // 表示的是视图采用的是json方式【实现方式就是通过MappingJackson实现的】
        MappingJackson2JsonView view = new MappingJackson2JsonView();

        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage());
        mv.setView(view);

        return mv;
    }

    /*这种方式采用的是跳转页面的方式给用户错误提示*/
   /* @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        MyException exception = null;
        if(e instanceof MyException) {
            exception = (MyException)e;
        }else{
            exception = new MyException("网络开小差了");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("error",exception.getMessage());
        mv.setViewName("error");

        return mv;
    }*/

    /*  这种方式采用原生态servlet方式给用户响应json的错误数据提示
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {

        MyException exception = null;
        if(e instanceof MyException){
             exception = (MyException) e;
        }else{
            exception = new MyException("网络出小差了");
        }

        给用户一个json格式的错误数据
        response.setContentType("application/json;charset=utf-8");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("message",e.getMessage());

        String value = JSONObject.toJSONString(map);

        try{
            response.getWriter().write(value);
        }catch (IOException e1){
            e1.printStackTrace();
        }

        return null;
    }*/


}
