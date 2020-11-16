package main.java.music;

public abstract class Instrument {
    protected String name = formatClassName();

    public void play() {
        System.out.print(" instrument that goes ");
    }

    public String formatClassName() {
        String className = this.getClass().getSimpleName();
        String[] name = className.split("(?=\\p{Upper})");
        StringBuilder nameWithSpaces = new StringBuilder();
        for (int i = 0; i < name.length; i++) {
            if (i == name.length - 1) {
                nameWithSpaces.append(name[i]);
                break;
            }
            nameWithSpaces.append(name[i]);
            nameWithSpaces.append(" ");
        }
        return nameWithSpaces.toString();
    }
}
