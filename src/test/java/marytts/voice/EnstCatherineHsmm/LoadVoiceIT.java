package marytts.voice.EnstCatherineHsmm;

import static org.junit.Assert.assertNotNull;
import marytts.modules.synthesis.Voice;
import marytts.util.MaryRuntimeUtils;

import org.junit.BeforeClass;
import org.junit.Test;

public class LoadVoiceIT {
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		MaryRuntimeUtils.ensureMaryStarted();
	}
	
    @Test
    public void canLoadVoice() throws Exception {
    	Config config = new Config();
        Voice voice = new marytts.htsengine.HMMVoice(config.getName(), null);
        assertNotNull(voice);
    }
}
