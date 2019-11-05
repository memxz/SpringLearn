package com.hardes.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 除了上述提到的 @Component注解外，Spring中还提供了@Component的3个衍生注解，其功能就目前来说是一致的，均是为了创建对象。
 * @Controller ：WEB层
 * @Service ：业务层
 * @Repository ：持久层
 *
 * 　　以单例或多实例方式创建对象，默认为单例，多例对象设置注解如下：
 *
 */
@Component(value="user")
@Scope(value="prototype")
public class User {
    public void add() {
        System.out.println("User Add Method.");
    }
}