package com.example.tamna.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaticDataMapper {

    @Insert("INSERT INTO USER(CLASSES, USERID, NAME) VALUES(#{classes}, #{userId}, #{name})")
    void insertUser (int classes, String userId, String name);

    @Insert("INSERT INTO CONFERENCE_ROOM(floor, confer_room_num, room_name) VALUES(#{floor}, #{conferRoomNum}, #{roomName})")
    void insertConfer (int floor, int conferRoomNum, String roomName);
}