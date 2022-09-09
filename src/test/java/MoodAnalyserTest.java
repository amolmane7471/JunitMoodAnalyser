import com.bridgelabz.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am In a Sad Mood");
        Assertions.assertEquals("SAD", mood);

    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
