import java.util.List;
import java.util.Set;

// TODO
class KnapsackBruteForce {
    static class Item {
        String name;
        int price;
        int weight;

        public Item(String name, int price, int weight) {
            this.name = name;
            this.price = price;
            this.weight = weight;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + price;
            result = prime * result + weight;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Item other = (Item) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (price != other.price)
                return false;
            if (weight != other.weight)
                return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Item stereo = new Item("Stereo", 3000, 4);
        Item laptop = new Item("Laptop", 2000, 3);
        Item guitar = new Item("Guitar", 1500, 1);
        List<Item> storeItems = List.of(stereo, laptop, guitar);

        Set<Item> stolenItems = stealAsMuchAsPossible(storeItems);
    }

    private static Set<Item> stealAsMuchAsPossible(List<Item> storItems) {
        return Set.of();
    }

}
