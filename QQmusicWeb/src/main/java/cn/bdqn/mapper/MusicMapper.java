package cn.bdqn.mapper;

import cn.bdqn.domain.Music;

public interface MusicMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
}