package Brown_Hack.Project_50;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class ToAudio {
    private static final String VOICENAME_kevin = "kevin";
    public ToAudio(){
        
    }
    
    public void toRun(String in){
        Voice voice;
        
        VoiceManager voiceManager = VoiceManager.getInstance();
        
        voice = voiceManager.getVoice(VOICENAME_kevin);
        voice.allocate();
        voice.speak(in);
    }
}
