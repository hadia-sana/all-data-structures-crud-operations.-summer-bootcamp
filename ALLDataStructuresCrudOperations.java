package Data.structures.crud.operations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.HashMap;


public class ALLDataStructuresCrudOperations {
    public static <T, S> void insert_hashmap(HashMap<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void update_Hashmap(HashMap<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void delete_Hashmap(HashMap<T, S> h, T pos) {
        h.remove(pos);
    }

    public static <T, S> void traverse_Hashmap(HashMap<T, S> h) {
        for (T k : h.keySet()) {
            System.out.println("key : " + k + "       value:" + h.get(k));
        }
    }
    
//**************************************************************
    public static <T, S> void addhashtablefunctions(Hashtable<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void updatehashtablefunctions(Hashtable<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void delete_hashtable(Hashtable<T, S> h, T pos) {
        h.remove(pos);
    }

    public static <T, S> void traverse_hashtable(Hashtable<T, S> h) {
        for (T k : h.keySet()) {
            System.out.println("key : " + k + "       value:" + h.get(k));
        }
    }

    public static <T, S> void insert_treemap(TreeMap<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void update_treemap(TreeMap<T, S> h, T pos, S data) {
        h.put(pos, data);
    }

    public static <T, S> void delete_treemap(TreeMap<T, S> h, T pos) {
        h.remove(pos);
    }

    public static <T, S> void traverse_treemap(TreeMap<T, S> h) {
        for (T k : h.keySet()) {
            System.out.println("key : " + k + "       value:" + h.get(k));
        }
    }

    public static <T> void insert_hashset(HashSet<T> h, T data) {
        h.add(data);
    }

    public static <T> void update_hashset(HashSet<T> h, T data, T newData) {
        if (h.contains(data)) {
            h.remove(data);
            h.add(newData);
        }
    }

    public static <T> void delete_hashset(HashSet<T> h, T data) {
        h.remove(data);
    }

    public static <T> void traverse_hashset(HashSet<T> h) {
        h.forEach((a) -> System.out.println(a));
    }

    public static <T> void insert_vector(Vector<T> h, T data) {
        h.add(data);
    }

    public static <T> void update_vector(Vector<T> h, T data, T newData) {
        if (h.contains(data)) {
            h.remove(data);
            h.add(newData);
        }
    }

    public static <T> void delete_vector(Vector<T> h, T data) {
        h.remove(data);
    }

    public static <T> void traverse_vector(Vector<T> h) {
        h.forEach((a) -> System.out.println(a));
    }

    public static <T> void insert_TreeSet(TreeSet<T> h, T data) {
        h.add(data);
    }

    public static <T> void update_treeset(TreeSet<T> h, T data, T newData) {
        if (h.contains(data)) {
            h.remove(data);
            h.add(newData);
        }
    }

    public static <T> void delete_treeset(TreeSet<T> h, T data) {
        h.remove(data);
    }

    public static <T> void traverse_treeset(TreeSet<T> h) {
        h.forEach((a) -> System.out.println(a));
    }

    public static <T> void insert_stack(Stack<T> s, T data) {
        s.push(data);
    }

    public static <T> void update_stack(Stack<T> s, T data, T newData) {
        if (s.contains(data)) {
            s.remove(data);
            s.push(newData);
        }
    }

    public static <T> void delete_stack(Stack<T> s) {
        s.pop();
    }

    public static <T> void traverse_stack(Stack<T> s) {
        s.forEach((a) -> System.out.println(a));
    }

    public static <T> void insert_queue(Queue<T> s, T data) {
        s.add(data);
    }

    public static <T> void update_queue(Queue<T> s, T data, T newData) {
        if (s.contains(data)) {
            s.remove(data);
            s.add(newData);
        }
    }

    public static <T> void delete_queue(Queue<T> s) {
        s.remove();
    }

    public static <T> void traverse_Queue(Queue<T> s) {
        s.forEach((a) -> System.out.println(a));
    }

    public static <T> void insert_arraylist(ArrayList<T> a, T data) {
        a.add(data);
    }

    public static <T> void update_arraylist(ArrayList<T> a, T data, T newData) {
        if (a.contains(data)) {
            a.remove(data);
            a.add(newData);
        }
    }

    public static <T> void remove_arraylist(ArrayList<T> a, T data) {
        a.remove(data);
    }

    public static <T> void traverse_arraylist(ArrayList<T> a) {
        a.forEach((ab) -> System.out.println(ab));
    }

    public static <T> void insert_pqueue(PriorityQueue<T> a, T data) {
        a.add(data);
    }

    public static <T> void update_pqueue(PriorityQueue<T> a, T data, T newData) {
        if (a.contains(data)) {
            a.remove(data);
            a.add(newData);
        }
    }

    public static <T> void remove_pqueue(PriorityQueue<T> a, T data) {
        a.remove(data);
    }

    public static <T> void traverse_pqueue(PriorityQueue<T> a) {
        a.forEach((ab) -> System.out.println(ab));
    }

    public static <T> void insert_list(LinkedList<T> a, T data) {
        a.add(data);
    }

    public static <T> void update_list(LinkedList<T> a, T data, T newData) {
        if (a.contains(data)) {
            a.remove(data);
            a.add(newData);
        }
    }

    public static <T> void remove_list(LinkedList<T> a, T data) {
        a.remove(data);
    }

    public static <T> void traverse_list(LinkedList<T> a) {
        a.forEach((ab) -> System.out.println(ab));
    }

    public static void main(String[] args) {
        Hashtable<Integer, String> hh = new Hashtable<>();
        addhashtablefunctions(hh, 1, "ruhi");
        updatehashtablefunctions(hh, 1, "updated_ruhi");
        traverse_hashtable(hh);

        TreeMap<Integer, String> tm = new TreeMap<>();
        insert_treemap(tm, 2, "treeData");
        update_treemap(tm, 2, "updated_treeData");
        traverse_treemap(tm);

        HashSet<String> hs = new HashSet<>();
        insert_hashset(hs, "hashSetData");
        update_hashset(hs, "hashSetData", "updated_hashSetData");
        traverse_hashset(hs);

        Vector<String> v = new Vector<>();
        insert_vector(v, "vectorData");
        update_vector(v, "vectorData", "updated_vectorData");
        traverse_vector(v);

        TreeSet<String> ts = new TreeSet<>();
        insert_TreeSet(ts, "treeSetData");
        update_treeset(ts, "treeSetData", "updated_treeSetData");
        traverse_treeset(ts);

        Stack<String> stack = new Stack<>();
        insert_stack(stack, "stackData");
        update_stack(stack, "stackData", "updated_stackData");
        traverse_stack(stack);

        Queue<String> queue = new LinkedList<>();
        insert_queue(queue, "queueData");
        update_queue(queue, "queueData", "updated_queueData");
        traverse_Queue(queue);

        ArrayList<String> arrayList = new ArrayList<>();
        insert_arraylist(arrayList, "arrayListData");
        update_arraylist(arrayList, "arrayListData", "updated_arrayListData");
        traverse_arraylist(arrayList);

        PriorityQueue<String> pq = new PriorityQueue<>();
        insert_pqueue(pq, "pqData");
        update_pqueue(pq, "pqData", "updated_pqData");
        traverse_pqueue(pq);

        LinkedList<String> list = new LinkedList<>();
        insert_list(list, "listData");
        update_list(list, "listData", "updated_listData");
        traverse_list(list);
    }
}
