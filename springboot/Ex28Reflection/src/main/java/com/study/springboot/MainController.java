package com.study.springboot;

import com.study.springboot.AliasFor.MyRequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    //MyRequestMapping은 RequestMapping의 일부분을 재정의한 어노테이션으로서
    //RequestMapping의 value 부분은 route로 재정의하였으며, method 부분은 define을 재정의하였다.
    @MyRequestMapping(define = RequestMethod.GET, route = "/web/annotation")
    public String view() {
        return "view 메소드 호출됨.";
    }
}
