package cn.bdqn.mapper;

import cn.bdqn.domain.lbum;

public interface lbumMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(lbum record);

    int insertSelective(lbum record);

    lbum selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(lbum record);

    int updateByPrimaryKey(lbum record);
}