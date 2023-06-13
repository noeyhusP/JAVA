package thisisjava_Ex;

import java.util.LinkedList;
import java.util.List;

// 이것이자바다 p703 7번

// Dao = Data Access Object
// 프로세스와 데이터베이스 시스템간의 상호작용을 위한 클래스
// ex) 회원정보를 DB에서 갖고 오려는데 DB에서 요청한 데이터를 보낼 때
// 따로 데이터타입 객체 메모리를 거쳐서 사용자에게 보내는데
// 그 데이터타입 객체가 Dao임
public class BoardDao {
    public List<Board> list;
    public List<Board> getBoardList ()
    {
        list = new LinkedList<>();

        if (list.isEmpty())
        {
            list.add(new Board("제목1", "내용1"));
            list.add(new Board("제목2", "내용2"));
            list.add(new Board("제목2", "내용2"));
        }

        return list;
    }
}
