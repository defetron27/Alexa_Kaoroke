import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class PagerKaraokeStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new DeviceIntentHandler(),
                        new KaraokeIntentHandler(),
                        new PagerIntentHandler(),
                        new CancelAndStopIntentHandler(),
                        new LaunchRequestHandler(),
                        new HelpIntentHandler(),
                        new SessionEndedRequestHandler()
                        )
                .addExceptionHandler(new GenericExceptionHandler())
                .withSkillId("amzn1.ask.skill.5b371a68-039c-4962-9371-2ac9ac41075d")
                .build();
    }

    public PagerKaraokeStreamHandler() {
        super(getSkill());
    }
}