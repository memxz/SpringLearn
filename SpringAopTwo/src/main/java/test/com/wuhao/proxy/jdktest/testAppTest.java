package test.com.wuhao.proxy.jdktest; 

import com.wuhao.proxy.jdktest.ProxyFactory;
import com.wuhao.proxy.jdktest.UserService;
import com.wuhao.proxy.jdktest.UserServiceImpl;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/**
* testApp Tester.
*
* @author <Authors name>
* @since <pre>Sep 24, 2019</pre>
* @version 1.0
*/
public class testAppTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}

/** 
* 
* Method: test01() 
* 
*/ 
@Test
public void testTest01() throws Exception { 
 UserService us= new UserServiceImpl();
 UserService proxyUs= (UserService) ProxyFactory.createProxy(us);
 proxyUs.add();
} 


} 
