package thisisjava_Ex;

// 이것이자바다 p703 7번

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list)
        {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
