package gildedRose;

public class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private boolean isNameAgedBrie(Item item) {
        return item.name.equals(AGED_BRIE);
    }

    private boolean isNameBackstagePassesToATAFKAL80ETCConcert(Item item) {
        return item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT);
    }

    private boolean isNameSulfurasHandRagnaros(Item item) {
        return item.name.equals(SULFURAS_HAND_OF_RAGNAROS);
    }

    public void updateQuality() {

        for (Item item : items) {
            if (isNameAgedBrie(item)) {
                calculationAgedBrie(item);
                continue;
            }
            if (isNameBackstagePassesToATAFKAL80ETCConcert(item)) {
                calculationBackstagePasses(item);
                continue;
            }

            if (!isNameAgedBrie(item)
                    && !isNameBackstagePassesToATAFKAL80ETCConcert(item)) {
                if (item.quality > 0) {
                    if (!isNameSulfurasHandRagnaros(item)) {
                        item.quality = item.quality - 1;
                    }
                }
            }

            if (!isNameSulfurasHandRagnaros(item)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!isNameAgedBrie(item)) {
                    if (!isNameBackstagePassesToATAFKAL80ETCConcert(item)) {
                        if (item.quality > 0) {
                            if (!isNameSulfurasHandRagnaros(item)) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

    private void calculationAgedBrie(Item item) {
        if (item.getSellIn() < 1) {
            item.quality = Math.min(item.quality + 2, 50);
        }else {
            item.quality = Math.min(item.quality + 1, 50);
        }

        item.sellIn--;
    }

    private void calculationBackstagePasses(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (isNameBackstagePassesToATAFKAL80ETCConcert(item)) {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}