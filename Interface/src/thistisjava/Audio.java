package thistisjava;

// 예제 8-2

public class Audio implements RemoteControl {
    // 필드 선언
    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn()
    {
        System.out.println("Audio Turn On");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Audio Turn Off");
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
        System.out.println("Current Audio Vol : " + this.volume);
    }

    // default 메서드를 재정의(오버라이딩) 가능한데
    // 오버라이딩 시에는 default 키워드를 지우고 public으로 선언해줘야 함
    @Override
    public void setMute(boolean mute)
    {
        if (mute)
        {
            this.memoryVolume = this.volume;
            System.out.println("MUTE");
            setVolume(RemoteControl.MIN_VOLUME);
        }
        else 
        {
            System.out.println("SOUND ON");
            setVolume(this.memoryVolume);
        }
    }
}
