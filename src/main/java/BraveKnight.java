public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }

}
