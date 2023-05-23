package thistisjava;

import javax.lang.model.util.ElementScanner14;

// 예제 8-2

public class Television implements RemoteControl {
    // 필드 선언
    private int volume;

    @Override
    public void turnOn()
    {
        System.out.println("TV Turn On");
    }

    @Override
    public void turnOff()
    {
        System.out.println("TV Turn Off");
    }

    @Override
    public void setVolume(int volume)
    {
        if (volume > RemoteControl.MAX_VOLUME)
        {
            this.volume = RemoteControl.MAX_VOLUME;
        }    
        else if (volume < RemoteControl.MIN_VOLUME)
        {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else
        {
            this.volume = volume;
        }
        System.out.println("Current TV Vol : " + this.volume);
    }
}
