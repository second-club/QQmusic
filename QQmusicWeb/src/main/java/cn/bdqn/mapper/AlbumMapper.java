package cn.bdqn.mapper;

import cn.bdqn.domain.Album;

public interface AlbumMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Album record);

    int insertSelective(Album record);

    Album selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}