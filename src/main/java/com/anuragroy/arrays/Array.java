package com.anuragroy.arrays;

// A Dynamic Array
public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full resize it
        if(items.length == count) {
            // Create a new array twice the size
            int[] newItems = new int[count * 2];
            // Copy exiting items to this new array
            for (int i = 0; i<count; i++)
                newItems[i] = items[i];
            // Set items field to this new array
            items = newItems;
        }
        // Add new item at end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for(int i = 0; i<count; i++)
            if(items[i] == i)
                return i;

        return -1;
    }

    public void print() {
        for (int i = 0; i<count; i++)
            System.out.println(items[i]);
    }
}
