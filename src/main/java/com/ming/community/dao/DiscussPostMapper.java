package com.ming.community.dao;

import com.ming.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit); //offset每一页行号，limit每一页多少数据

    //@param注解用于给参数取别名，
    //如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDisscussPostRows(@Param("userId") int userId);

}
