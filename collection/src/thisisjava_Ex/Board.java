package thisisjava_Ex;

// 이것이자바다 p703 7번

public class Board {
    private String title;
    private String content;

    public Board(String title, String content)
    {
        this.title = title;
        this.content = content;
    }

    public String getTitle()
    {
        return title;
    }

    public String getContent()
    {
        return content;
    }
}
