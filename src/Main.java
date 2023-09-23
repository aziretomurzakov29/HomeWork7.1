public class Main {
    public static void main(String[] args) {
        Madic medic = new Madic();

        HavingSuperAbility[] ability = {new Magic(),
                medic, new Warrior()};
        for (HavingSuperAbility havingSuperAbility : ability) {
            havingSuperAbility.applySuperAbility();

        }
    }
}