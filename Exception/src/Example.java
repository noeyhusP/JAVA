import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        // 역슬래시 \ 가 2개 들어가는 이유 : 
        // 역슬래시 1개 \은 특수문자를 나타낼 때 쓰는 기호이므로
        // \\ 2개를 붙여야 \ 로 인식이 되는 것 

        // Paths.get > 위치정보 (경로) 저장
        Path file = Paths.get("C:\\AAA\\test.txt");

        BufferedWriter writer = null;

        try
        {
            // Files = (static)
            // file 경로에 newBufferedWriter(뭔가를 저장할 버퍼)를 만듦
            writer = Files.newBufferedWriter(file);
            // write 로 접근
            // file에 내용을 씀
            writer.write('A');
            writer.write('B');

            // writer가 null이 아닐 때
            if (writer != null)
            {
                writer.close();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
