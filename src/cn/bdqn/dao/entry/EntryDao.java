package cn.bdqn.dao.entry;

import cn.bdqn.pojo.entry.Entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 雒建伟
 * @date; 2018/11/20
 * @package: cn.bdqn.dao.entry
 * @description: TODO
 */
public interface EntryDao {
    public List<Entry> GetAllEntry();

    public List<Entry> GetEntryByCategoryId(@Param("name") String name);

    public int dropEntry(@Param("id") Integer id);
}
