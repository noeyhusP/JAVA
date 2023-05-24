package decrypter_short_ver;
// interface 작명은 기능 -able 으로 하는 게 관례
public interface Decryptionable {
    // interface에 넣을 클래스는 그 용도와 니즈를 잘 파악해서
    // 딱 넣을 것만 넣는 것이 좋기 때문에
    // interface 기능 구성도 고안을 많이 해봐야 함

    public String decryptCode(String code);
    
}
