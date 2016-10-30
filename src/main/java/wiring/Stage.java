package wiring;

public class Stage {

    private Stage() {
    }

    private static class StageSingltonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingltonHolder.instance;
    }

}
