//package com.elkStackProject;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
////import com.ELKProject.demo.user.UserApplication;
//
//import java.time.LocalDateTime;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@RestController
//@Slf4j
//public class HomeController {
//	Logger log=LoggerFactory.getLogger(HomeController.class);
//
//    @GetMapping("/home")
//    public String Hpage(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//        log.info("I am logginf at home page " + localDateTime);
//        return "When accessed , this will send Home logs to kibana";
//    }
//
//
//    @GetMapping("/mywarning")
//    public String Wpage(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//        log.warn("I logging at warning page " + localDateTime);
//        return "When accessed , this will send warning logs to kibana";
//    }
//
//
//    @GetMapping("/myerr")
//    public String Epage(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//        log.error("I am loggin at error page" + localDateTime);
//        return " When accessed , this will send error logs to kibana";
//    }
//    
//    @GetMapping("/mytest")
//    public String Tpage(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//        log.error("I am loggin at test page" + localDateTime);
//        return " When accessed , this will send test logs to kibana";
//    }
//
//
//}
