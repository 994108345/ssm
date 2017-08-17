/**
 * Created by wenzailong on 2017/6/29.
 */
import com.mb.wzl.dao.IUserDao;
import com.mb.wzl.entity.User;
import com.mb.wzl.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})

public class IUserDaoTest {
    /*创建日志对象*/
    private Logger logger = LoggerFactory.getLogger(IUserDaoTest.class);

    @Resource
    private IUserDao userDao;
    @Resource
    private IUserService userService;

    @Test
    public void testSelectUser() throws Exception {
        String id = "1";
        try{
            User user = userService.selectUser(id);
            logger.info("---------------------success-----"+user.getName());
        }catch(Exception e){
            logger.info("---------------------error");
            e.printStackTrace();
        }

    }
    @Test
    public void  testMoreListParams(){
        User user=new User();
        user.setName("张三");
        List list=new ArrayList();
        list.add(user);
        String userName="222";
        try{
            List list1=userDao.testMoreParams(list,userName);
            logger.info("---------------------success-----");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("---------------------error");
        }
    }

}
