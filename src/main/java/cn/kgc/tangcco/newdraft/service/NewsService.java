package cn.kgc.tangcco.newdraft.service;

import cn.kgc.tangcco.newdraft.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 王雨
 * @version 1.0
 * @date 2020/1/19 10:11
 * @package cn.kgc.tangcco.newdraft.service
 */
public interface NewsService{

    List<News> getAllNews();

    News getNewsById(Integer newsId);

    News getNewestNews();

    List<News> getNewsByCreatedTime();

}
