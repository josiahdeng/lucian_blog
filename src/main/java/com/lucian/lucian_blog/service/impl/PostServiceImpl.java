package com.lucian.lucian_blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lucian.lucian_blog.bean.entity.Post;
import com.lucian.lucian_blog.dao.PostDao;
import com.lucian.lucian_blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostDao postDao;

    @Override
    public boolean saveBatch(Collection<Post> entityList, int batchSize) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Post> entityList, int batchSize) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Post> entityList, int batchSize) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean saveOrUpdate(Post entity) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Post getOne(Wrapper<Post> queryWrapper, boolean throwEx) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Post> queryWrapper) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Post> queryWrapper, Function<? super Object, V> mapper) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseMapper<Post> getBaseMapper() {
        // TODO Auto-generated method stub
        return postDao;
    }

    @Override
    public Class<Post> getEntityClass() {
        // TODO Auto-generated method stub
        return Post.class;
    }
}
