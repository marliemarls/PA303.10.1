public class FireMonster extends Monster{
    private String name;
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String Attack() {
        return "Attack with fire!";
    }
}
