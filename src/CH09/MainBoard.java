package CH09;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel SLevel = new SuperLevel();
        player.upgradeLevel(SLevel);
        player.play(3);
    }
}
