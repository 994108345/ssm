import com.mb.wzl.dao.IRoleJurisdictionDao;
import com.mb.wzl.entity.Role;
import com.mb.wzl.entity.RoleJurisdiction;
import com.mb.wzl.service.IRoleJurisdictionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzailong on 2017/7/3.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})

public class IRoleJurisdictionTest {
    /*创建日志对象*/
    private org.slf4j.Logger logger = LoggerFactory.getLogger(IRoleJurisdictionTest.class);
    @Resource
    IRoleJurisdictionService roleJurisdictionService;
    @Test
    public void selelctByRoleNameTest(){
        String roleName="管理员";
        try{
            Role role=roleJurisdictionService.selectByRoleName(roleName);
            logger.info("---------success--------");
        }catch (Exception e){
            logger.info("---------error--------");
            e.printStackTrace();
        }

    }
    @Test
    public void insertRoleTest(){

        try{
            Role role=new Role();
            role.setRoleName("部门主管");
            int a=roleJurisdictionService.insertRole(role.getRoleName());
            logger.info("---------success--------");
        }catch (Exception e){
            logger.info("---------error--------");
            e.printStackTrace();
        }
    }
    @Test
    public void insertRoleJurisdictionTest(){

        try{
            RoleJurisdiction roleJurisdiction=new RoleJurisdiction();
            roleJurisdiction.setRoleId("dcf292c0b0ec1035b146a5fe082bbf3d");
            roleJurisdiction.setJurisdictionId("a25f7a6bb0ed1035b146a5fe082bbf3d");
            int resultNum=roleJurisdictionService.insertRoleJurisdiction(roleJurisdiction);
            logger.info("---------success--------");
        }catch (Exception e){
            logger.info("---------error--------");
            e.printStackTrace();
        }
    }
    @Test
    public void addRole(){
        try{
          List list=new ArrayList<String>();
          list.add("用户信息管理");
          list.add("日志信息管理");
          list.add("账号管理");
          String roleName="实习生";
          roleJurisdictionService.addRole(roleName,list);
            logger.info("---------success--------");
        }catch (Exception e){
            logger.info("---------error--------");
            e.printStackTrace();
        }
    }
    /*测试try-catch*/
    @Test
    public void testTry() throws Exception{
            int a=10/0;

        try{
            int b=10/0;
        }catch(Exception e){
            e.printStackTrace();
            new Exception("出错了");
        }
        String c="46546";
    }
    @Test
    public void test2(){


    }
    class A{
        int a;
        int b;
    }

}

