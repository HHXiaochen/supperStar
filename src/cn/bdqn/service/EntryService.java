package cn.bdqn.service;

import cn.bdqn.pojo.entry.Entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 雒建伟
 * @date; 2018/11/20
 * @package: cn.bdqn.service
 * @description: TODO
 */
public interface EntryService {

    public List<Entry> GetAllEntry();

    public List<Entry> GetEntryByCategoryId(@Param("name") String name);

    public int dropEntry(@Param("id") Integer id);
}
