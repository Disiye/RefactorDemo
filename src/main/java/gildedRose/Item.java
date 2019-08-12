package gildedRose;

public class Item {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public String name;

    public int sellIn;

    public int quality;

    private GildedRoseStrategy gildedRoseStrategy;

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.gildedRoseStrategy = gildedRoseStrategy();
    }

    public void compelte(){
        this.gildedRoseStrategy.compelteGildedRose(this);
    }

    public GildedRoseStrategy gildedRoseStrategy() {
        switch (this.name) {
            case AGED_BRIE:
                return new AgedBrieStrategy();
            case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
                return new BackstageStrategy();
            case SULFURAS_HAND_OF_RAGNAROS:
                return new SulfurasStrategy();
            default:
                return new OtherNameStrategy();
        }
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
