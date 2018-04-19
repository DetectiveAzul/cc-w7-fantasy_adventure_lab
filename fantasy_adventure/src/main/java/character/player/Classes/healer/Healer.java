package character.player.Classes.healer;

import character.tools.HealingTool;

public interface Healer {
    public String heal();
    public void changeHealingTool(HealingTool healingTool);
    public String checkStatus();
}
