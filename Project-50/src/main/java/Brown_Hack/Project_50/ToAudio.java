package Brown_Hack.Project_50;


import javax.sound.sampled.AudioFileFormat.Type;

import com.sun.speech.freetts.FreeTTSSpeakableImpl;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;

public class ToAudio {
    private static final String VOICENAME_kevin = "kevin";
    public ToAudio(){
        
    }
    
    public void toRun(String in,boolean save, String saveLocation ){
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        
        voice = voiceManager.getVoice(VOICENAME_kevin);
        voice.allocate();
        
        SingleFileAudioPlayer audioPlayer = new SingleFileAudioPlayer("/Users/hershgupta/Documents/audio/"+saveLocation,Type.WAVE);
        if(save){
            
            voice.setAudioPlayer(audioPlayer);
        }
        voice.speak(in);
        voice.deallocate();
        audioPlayer.close();
    }
}
