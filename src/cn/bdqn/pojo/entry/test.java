package cn.bdqn.pojo.entry;

import cn.bdqn.service.EntryService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 雒建伟
 * @date; 2018/11/20
 * @package: cn.bdqn.pojo.entry
 * @description: TODO
 */
public class test {
    @Test
    public void test(){
        ApplicationContext cxt=new ClassPathXmlApplicationContext("applicationContext.xml");
        EntryService entryService=(EntryService)cxt.getBean("entryservice");
        List<Entry> list=new ArrayList<Entry>();
        list=entryService.GetAllEntry();
        for (Entry lists:list ) {
            System.out.println("================="+lists.getSummary());
        }

    }
}
