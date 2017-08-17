import com.mb.wzl.dao.IPageBeanDao;
import com.mb.wzl.entity.PageBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wenzailong on 2017/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class PageBeanServiceTest {
    private org.slf4j.Logger logger = LoggerFactory.getLogger(PageBeanServiceTest.class);
    @Resource
    IPageBeanDao pageBeanDao;
    @Test
    public void selctByTableName(){
        PageBean pageBean=new PageBean();
        pageBean.setTableName("role");
        pageBean.setCurrentPage(1);
        try{
            List list=pageBeanDao.selectCurrentCountByTableName(pageBean);
            logger.info("PageBeanServiceTest-selctByTableName--success");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("PageBeanServiceTest-selctByTableName--error");
        }
    }
    @Test
    public void selectAllCountNum(){
        PageBean pageBean=new PageBean();
        pageBean.setTableName("role");
        pageBean.setCurrentPage(1);
        try{
           int reuturnNum=pageBeanDao.selectAllCount(pageBean);
            logger.info("PageBeanServiceTest-selectAllCountNum--success");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("PageBeanServiceTest-selectAllCountNum--error");
        }
    }
}
