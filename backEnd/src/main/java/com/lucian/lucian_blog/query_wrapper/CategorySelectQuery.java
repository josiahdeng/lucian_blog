package com.lucian.lucian_blog.query_wrapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lucian.lucian_blog.bean.entity.Category;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;

@Getter
@Setter
public class CategorySelectQuery {
    private String name;

    public Wrapper<Category> getQueryWrapper(){
        QueryWrapper<Category> categoryQueryQueryWrapper = new QueryWrapper<>();
        if(Strings.isNotBlank(name)) categoryQueryQueryWrapper.like("name", name);
        return categoryQueryQueryWrapper;
    }
}
