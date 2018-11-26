package cn.bdqn.service;

import cn.bdqn.dao.entry.EntryDao;
import cn.bdqn.pojo.entry.Entry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.util.List;

/**
 * @author: 雒建伟
 * @date; 2018/11/20
 * @package: cn.bdqn.service
 * @description: TODO
 */
@Service("entryservice")
public class EntryServiceImpl implements EntryService{
    @Resource
    private EntryDao entryDao;

    @Override
    public List<Entry> GetAllEntry() {
        return entryDao.GetAllEntry();
    }

    @Override
    public List<Entry> GetEntryByCategoryId(String name) {
        return entryDao.GetEntryByCategoryId(name);
    }

    @Override
    public int dropEntry(Integer id) {
        return entryDao.dropEntry(id);
    }
}
