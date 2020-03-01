package com.jacend.linkedlist;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 最简单的是一个单链表，大小 capacity
 * 最早出现的放到尾部
 * 当插入一个元素的时候：1.如果遍历找到同样 key 的，删除之，最新的放到队头，2.如果没找到，看大小，大小不够就删了尾节点再放在头节点
 *
 * 这样遍历效率太低 O(n)
 *
 * 为了提升效率，可以叫元素放在哈希表，自己写太麻烦，可以借用 LinkedHashMap
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity, float loadFactor) {
        super(capacity, loadFactor, false);
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        if (super.size() > this.capacity) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LRUCache<String, String>  lruCache = new LRUCache<String, String>(2, 0.75f);
        lruCache.put("1", "code");
        lruCache.put("2", "sam");
        lruCache.put("3", "jake");
        System.out.println(lruCache);
    }
}
