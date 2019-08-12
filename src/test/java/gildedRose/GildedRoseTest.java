package gildedRose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class GildedRoseTest {
    @Test
    public void should_return_19_and_29_when_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Emilio",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(19,items[0].sellIn);
        assertEquals(29,items[0].quality);
    }

    @Test
    public void should_return_19_and_31_when_name_is_Aged_Brie_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Aged Brie",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(19,items[0].sellIn);
        assertEquals(31,items[0].quality);
    }

    @Test
    public void should_return_19_and_31_when_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(19,items[0].sellIn);
        assertEquals(31,items[0].quality);
    }

    @Test
    public void should_return_20_and_30_when_name_is_Sulfuras_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",20,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(20,items[0].sellIn);
        assertEquals(30,items[0].quality);
    }

    @Test
    public void should_return_4_and_31_when_name_is_Aged_Brie_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Aged Brie",5,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(31,items[0].quality);
    }

    @Test
    public void should_return_4_and_33_when_name_is_Backstage_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(4,items[0].sellIn);
        assertEquals(33,items[0].quality);
    }

    @Test
    public void should_return_6_and_32_when_name_is_Backstage_and_sellin_is_20_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",7,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(6,items[0].sellIn);
        assertEquals(32,items[0].quality);
    }

    @Test
    public void should_return_negative_7_and_0_when_name_is_Aged_Brie_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Aged Brie",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(32,items[0].quality);
    }

    @Test
    public void should_return_negative_7_and_0_when_name_is_Backstage_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(0,items[0].quality);
    }

    @Test
    public void should_return_negative_6_and_0_when_name_is_Sulfuras_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Sulfuras, Hand of Ragnaros",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-6,items[0].sellIn);
        assertEquals(30,items[0].quality);
    }

    @Test
    public void should_return_negative_6_and_0_when_name_is_Emilio_and_sellin_is_negative_6_and_quality_is_30(){
        Item item = new Item("Emilio",-6,30);
        Item[] items = new Item[]{item};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(-7,items[0].sellIn);
        assertEquals(28,items[0].quality);
    }
}
