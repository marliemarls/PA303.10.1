public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String Attack() {
        return "Attack with stones!";
    }
}
