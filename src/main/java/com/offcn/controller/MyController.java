package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    /**
     * 访问http://localhost:8080/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @GetMapping("/first")
    public String indexPage(Model model) {
        System.out.println("哈哈哈哈哈哈哈哈哈");
        String message = "辉哥是傻逼";
        model.addAttribute("message", message);
        return "index";
    }
    @GetMapping("/getUser")
    public String getUser(Model  model){
        User user = new User(1, "傻子辉", 18);
        model.addAttribute("user",user);
        Map map = new HashMap<>();
        map.put("src1","3.jpg");
        map.put("src2","4.jpg");
        model.addAttribute("src3",map);
        return "index";
    }

    @GetMapping("/getList")
    public String getUserList(Model  model){
        ArrayList<User> list = new ArrayList<>();
        list.add( new User(1, "傻子辉", 18));
        list.add( new User(2, "傻子辉1", 18));
        list.add( new User(3, "傻子辉2", 18));
        model.addAttribute("userList",list);
        return "index2";
    }
    @GetMapping("/index3")
    public String index3(Model  model){
        model.addAttribute("username","傻逼辉砸");
        model.addAttribute("href","http://www.baidu.com");
        return "index3";
    }

    @GetMapping("/index4")
    public String index4(Model  model){
        model.addAttribute("result","y");
        model.addAttribute("user","1");
        model.addAttribute("manage","1");
        System.out.println(model);
        return "index4";
    }
    @GetMapping("/index5")
    public String index5(Model  model){

        return "index5";
    }

    @GetMapping("/index6")
    public String index6(Model  model){
        //对日期的处理
        Date date = new Date();
        model.addAttribute("date",date);
        //数字的格式化
        model.addAttribute("sum",12345.322);
        //字符串的处理
        String str = "2020-10-22 11:49:20.947  INFO 12268 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index\n" +
                "2020-10-22 11:49:21.165  INFO 12268 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\n" +
                "2020-10-22 11:49:21.179  INFO 12268 --- [           main] com.offcn.LeafdemoApplication            : Started LeafdemoApplication in 2.626 seconds (JVM running for 4.672)\n" +
                "2020-10-22 11:49:23.863  INFO 12268 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'\n" +
                "2020-10-22 11:49:23.864  INFO 12268 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'\n" +
                "2020-10-22 11:49:23.869  INFO 12268 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 5 ms";
        model.addAttribute("str",str);
        //字符串的截取
        String str2 ="213-321-321";
        model.addAttribute("str2",str2);
        return "index6";
    }
}
