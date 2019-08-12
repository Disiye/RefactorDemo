package gildedRose;

public class AgedBrieStrategy implements GildedRoseStrategy {
    @Override
    public void compelteGildedRose(Item item) {
        if (item.getSellIn() < 1) {
            item.setQuality(Math.min(item.getQuality() + 2, 50));
        } else {
            item.setQuality(Math.min(item.getQuality() + 1, 50));
        }
        item.setSellIn(item.getSellIn() - 1);
    }
}
