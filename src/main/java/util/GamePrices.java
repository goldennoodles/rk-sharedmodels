package util;

public abstract class GamePrices {
    public static final int STEAM_PRICE_FOUR = 4;
    public static final int STEAM_PRICE_SEVEN = 7;
    public static final int STEAM_PRICE_TWELVE = 12;
    public static final int STEAM_PRICE_SIXTEEN = 16;
    public static final int STEAM_PRICE_TWENTY = 20;

    public static final int EPIC_PRICE_FOUR = 400;
    public static final int EPIC_PRICE_SEVEN = 700;
    public static final int EPIC_PRICE_TWELVE = 1200;
    public static final int EPIC_PRICE_SIXTEEN = 1600;
    public static final int EPIC_PRICE_TWENTY = 2000;

    public static int convertSteamPricesToEpic(int price) {
        switch (price) {
            case STEAM_PRICE_FOUR:
                return EPIC_PRICE_FOUR;
            case STEAM_PRICE_SEVEN:
                return EPIC_PRICE_SEVEN;
            case STEAM_PRICE_TWELVE:
                return EPIC_PRICE_TWELVE;
            case STEAM_PRICE_SIXTEEN:
                return EPIC_PRICE_SIXTEEN;
            case STEAM_PRICE_TWENTY:
                return EPIC_PRICE_TWENTY;

            default:
                System.out.println("GamePrices (L:30) ---:--- This integer [" + price + "] does not match the preformatted selection...");
                return 0;
        }
    }
}
