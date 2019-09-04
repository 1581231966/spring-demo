package com.terence.springdemo.dao;

import com.terence.springdemo.entities.BaseUser;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDao extends ElasticsearchRepository<BaseUser, String> {

}
