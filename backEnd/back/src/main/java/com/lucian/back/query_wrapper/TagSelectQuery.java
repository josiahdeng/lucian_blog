package com.lucian.back.query_wrapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lucian.common.bean.entity.Tag;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;

/**
 * @author lingxiangdeng
 */
@Getter
@Setter
public class TagSelectQuery {
    private String name;

    public Wrapper<Tag> getQueryWrapper(){
        QueryWrapper<Tag> tagQueryWrapper = new QueryWrapper<>();
        if(Strings.isNotBlank(name)) {
            tagQueryWrapper.like("name", name);
        }
        return tagQueryWrapper;
    }
}
