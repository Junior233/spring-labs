package top.xjinfeng.lab01.spring.autowire.comonent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 描述: 如果有多个@Autowired(required = false)
 *
 * @author xu.jin.feng
 * @create 2022/1/24 11:01
 */
@Component
@Slf4j
public class TargetBean5 {

    private PropsBean1 propsBean1;

    private PropsBean2 propsBean2;

    @Autowired(required = false)
    public TargetBean5(PropsBean1 propsBean1){
        this.propsBean1 = propsBean1;
        System.out.println(1);
    }

    @Autowired(required = false)
    public TargetBean5(PropsBean2 propsBean2){
        this.propsBean2 = propsBean2;
        log.info("{}", "采用此处的构造函数");
        System.out.println(2);
    }

    @Autowired(required = false)
    public TargetBean5(){
        System.out.println(0);
    }

}
