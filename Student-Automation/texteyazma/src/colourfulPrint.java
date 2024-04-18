public class colourfulPrint {

    // ANSI renk kodları
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";

    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String REVERSED = "\u001B[7m";

    public static void main(String[] args) {
        System.out.println(RED + "Kırmızı metin" + RESET);
        System.out.println(GREEN + "Yeşil metin" + RESET);
        System.out.println(BLUE + "Mavi metin" + RESET);
        System.out.println(YELLOW + "Sarı metin" + RESET);
        System.out.println(PURPLE + "Mor metin" + RESET);
        System.out.println(CYAN + "Camgöbeği metin" + RESET);
        System.out.println(WHITE + "Beyaz metin" + RESET);

        System.out.println(RED_BACKGROUND + WHITE + "Kırmızı arka plan" + RESET);
        System.out.println(GREEN_BACKGROUND + WHITE + "Yeşil arka plan" + RESET);
        System.out.println(BLUE_BACKGROUND + WHITE + "Mavi arka plan" + RESET);
        System.out.println(YELLOW_BACKGROUND + WHITE + "Sarı arka plan" + RESET);
        System.out.println(PURPLE_BACKGROUND + WHITE + "Mor arka plan" + RESET);
        System.out.println(CYAN_BACKGROUND + WHITE + "Camgöbeği arka plan" + RESET);
        System.out.println(WHITE_BACKGROUND + BLACK + "Beyaz arka plan" + RESET);

        System.out.println(BOLD + "Kalın metin" + RESET);
        System.out.println(UNDERLINE + "Altı çizili metin" + RESET);
        System.out.println(REVERSED + "Ters çevrilen metin" + RESET);
    }
}

