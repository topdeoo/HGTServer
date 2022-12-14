package com.virgil.hgtserver.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface VoteMapper {

    String queryNumByToken( @Param("token") String token );

    void delBeyondTime( @Param("endTime") String endTime );

    String size();

    int queryMaxCode();


    void insertVote( @Param("code")int code, @Param("token") String token,
                     @Param("startTime")String startTime, @Param("endTime")String endTime);

    void addUser( @Param("code") int code, @Param("token") String token,
                  @Param("startTime") String startTime, @Param("endTime") String endTime );

    String queryCodeByToken( @Param("token") String token );

    String queryTextByCode( @Param("code") int code );

    void insertVoteText(@Param("code")int code, @Param("text")String text);

    String queryIsVoteByToken( @Param("token") String token );

    void updateTextByCode( @Param("text") String text , @Param("code") int code );

    int queryIsVote( @Param("token")String token );

    void updateIsVote( @Param("token") String token );
}
