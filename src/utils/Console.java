package utils;

public class Console {
    public final static void clear()
    {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }
        catch (final Exception e) {
            System.out.println("Erro ao limpar o console");
            e.printStackTrace();
        }
    }


}
