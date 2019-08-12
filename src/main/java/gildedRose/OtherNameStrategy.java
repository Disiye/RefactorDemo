package gildedRose;

public class OtherNameStrategy implements GildedRoseStrategy {
    @Override
    public void compelteGildedRose(Item item) {
        if (item.getSellIn() < 1) {
            item.setQuality(Math.max(item.getQuality() - 2, 0));
        } else {
            item.setQuality(Math.max(item.getQuality() - 1, 0));
        }
        item.setSellIn(item.getSellIn() - 1);
    }
}
