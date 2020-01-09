package id.ac.poliban.fenia.sqlitedemos01.dao;

import java.util.List;

import id.ac.poliban.fenia.sqlitedemos01.domain.Friend;

public interface FriendDao {
    void insert (Friend f);
    void Update (Friend f);
    void delete (int id);
    Friend getAFriendById (int id);
    List<Friend> getAllFriends();
}
