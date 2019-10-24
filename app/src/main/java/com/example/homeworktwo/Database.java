package com.example.homeworktwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Database {

    public static Item getItemById(int id) {
        return items.get(id);
    }

    private static final HashMap<Integer, Item> items;

    static {
        items = new HashMap<>();
    }

    public static ArrayList<Item> getAllItems() {
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));

    }

    static {
        items.put(1, new Item(1, "Bopper Classic", 2.99, "Our signature beef patty, topped with chilli, mayo, all in a bun. If you're looking for an old-school eating experience, this is the burger for you."));
        items.put(2, new Item(2, "Bopper Brekkie", 5.99, "It starts with a warm, crisp hash brown, melting cheese, rasher bacon and a freshly cracked egg. Finished with a 100% Aussie beef patty and a generous dollop of BBQ sauce in between a toasted sesame seed bun."));
        items.put(3, new Item(3, "Onion Rings", 1.99, "A box of 10 of our delicious onion rings, seasoned with our signature herbs."));
        items.put(4, new Item(4, "Fish-o-Bopper", 5.99, "Dive in and enjoy our Fish-o-Bopper. Sourced for its succulent and fresh flavour, we cook tender portions of fish and enhance their great taste with zesty tartar sauce and cheese."));
        items.put(5, new Item(5, "Hot Dog", 3.99, "This delicious, organic hot dog is topped with our signature ketchup, grilled onion, and chilli sauce. Something not to miss!"));
        items.put(6, new Item(6, "Hash Brown", 1.99, "Get 'em hot. A crunchy, golden brown crust with steaming, fluffy potato inside."));
        items.put(7, new Item(7, "Bopper Wrap", 2.49, "With a strip of succulent 100% Aussie chicken breast fillet, we add fresh lettuce and creamy mayonnaise, hand wrapped in a delicious Wholemeal wrap, made with 100% Aussie Wheat."));
        items.put(8, new Item(8, "Bopper Feast", 2.99, "The Bopper Feast burger is an Australian favourite. A juicy beef patty, cheese, tomato, lettuce, pickles, three sauces all on a classic sesame seed bun."));
        items.put(9, new Item(9, "Big Bopper", 3.99, "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun."));
        items.put(10, new Item(10, "Bopper Stacker", 6.99, "A classic double burger, the Booper McDouble stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and a slice of melty American cheese. "));
        items.put(11, new Item(11, "Spaghetti Box", 3.99, "While not traditionally Italian, our take on spaghetti is a box of long pasta topped with a generous portion of tomato sauce and shredded cheese."));
        items.put(12, new Item(12, "Fries", 1.99, "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. We only use the highest quality potatoes to create those delicious strands of crispy fluffiness that you love."));
        items.put(13, new Item(13, "Bopper Salad", 3.99, "Prepared fresh daily, we mix a gourmet salad of crisp lettuce, perfectly ripened tomato and cucumber slices, from farmers across Australia. Take it how you like, with a choice of balsamic vinegar, Caesar or Italian dressing. "));
        items.put(14, new Item(14, "Bopper McChicken", 3.49, "It's the simple things that matter. Like our quality chicken breast, cooked in a seasoned tempura coating. Topped with fresh, Australian-grown lettuce and our exceptional sauce, between a sesame seed bun, it's hard to beat a classic."));
        items.put(15, new Item(15, "Bopper BLT", 7.49, "If you're feeling like a down under meal, the Booper BLT is the way to go. Between a puffy muffin pastry consists of organic bacon, fresh lettuce, and tomato."));
    }
}
