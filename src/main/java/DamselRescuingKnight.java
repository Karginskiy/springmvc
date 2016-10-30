import java.util.List;

/**
 * Bad example. Too hard dependency;
 */

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;
    public DamselRescuingKnight() {
        // Tight dependency with RescueDamselQuest!
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }


}
