package com.leetcode.medium;

/**
 * @Author: by simple on 2018/10/29.
 */
public class Node {
    protected Node next;
    protected int data;

    public Node(int data){
        this.data = data;
    }

    public void displayLink(){
        System.out.println("{"+data+"}");
    }

}
class LinkList{

    public Node first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertHead(int a){
        Node node = new Node(a);
        node.next = first;
        first = node;
    }

    public boolean hasNext(){
        return !isEmpty();
    }

    public Object next(){
        if (!isEmpty()){
            int res = first.data;
            Node node = first.next;
            first = node;
            return res;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        LinkList linkList1 = new LinkList();
        linkList.insertHead(2);
        linkList.insertHead(4);
        linkList.insertHead(3);

        linkList1.insertHead(5);
        linkList1.insertHead(6);
        linkList1.insertHead(4);
//        int i = 0;
//        double a = 0;
//        while (linkList.hasNext()){
//            a += (Integer)linkList.next() * Math.pow(10,i);
//            i++;
//        }
//        int j =0;
//        double b = 0;
//        while (linkList1.hasNext()){
//            b += (Integer)linkList1.next() * Math.pow(10,j);
//            j++;
//        }
//        System.out.println(a + b);


        LinkList resLink = new LinkList();
        int remainder = 0;
        while (linkList.hasNext() || linkList1.hasNext()){
            Object x =  linkList.next();
            Object y =  linkList1.next();
            x = x == null ? 0 : x;
            y = y == null ? 0 : y;

//            int x = linkList.next()==null?0: (int) linkList.next();
//            int y = linkList1.next()==null?0: (int) linkList1.next();
            int res = (Integer)x + (Integer)y + remainder;
            resLink.insertHead(res%10);
            remainder = (res) / 10;
        }
        System.out.println(resLink);
    }
}
