/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author Admin
 */
class Node
 {int info;
  Node next;
  Node() {}
  Node(int x, Node p)
   {info=x;next=p;
   }
 }
public class MyList
 {Node head,tail;
  MyList() {head=tail=null;}
  boolean isEmpty()
   {return(head==null);
   }
  void clear()
   {head=tail=null;
   }
void add(int x)
   { if(isEmpty())
     head=tail=new Node(x,null);
     else
      {Node q =new Node(x,null);
       tail.next=q; tail=q;
      }
   }
void addHead(int x){
    if(isEmpty())
     head = tail = new Node(x,null);
    else
     {
      Node q = new Node(x,null);
      q.next = head;
      head = q;
     }   
}
void traverse(){
    Node p=head;
    while(p!=null){
       System.out.print("  " + p.info);
       p=p.next;
     }
    System.out.println();
   }
  //deleteFromStart() will delete a node from the beginning of the list  
void deleteStart(){
 //Checks if the list is empty  
   if(isEmpty()){
      System.out.println("List is empty");  
      return; 
   } 
   else{
             //Checks whether the list contains only one node  
            //If not, the head will point to next node in the list and tail will point to the new head.  
      if(head != tail)
         head = head.next;
      else{
            //If the list contains only one node then, it will remove it and both head and tail will point to null  
         head = tail = null;
         return;
      }
   }
      
}

void deleteEnd() {  
       //Checks if the list is empty  
    if(isEmpty()){
           System.out.println("List is empty");
           return;
    }  
       if(head == tail) head=tail=null;
       Node p = head;
       while(p.next != tail) p=p.next;
       p.next = null;
       tail = p;
    } 
void delete(int x){
    if(isEmpty()){
           System.out.println("List is empty");
           return;
    } 
    if(head.info == x){
            deleteStart();
            return;
    }
    Node p = head;
    while(p.next != null){
        if(p.next.info == x){
            p.next = p.next.next;
            break;
        }
        else
            p = p.next;
    }
    if(p.next == null) 
        tail = p;
    return;
}
Node search(int x){
    Node p=head;
    while(p!=null){
       if(p.info==x) return (p);
       p=p.next;
     }
    System.out.println();
    return null;
}
Node searchvitri(int x){
    Node current = head;
    if(isEmpty()){
      System.out.println("List is empty");  
   }  
    else{
        if(head != tail){
            while(x > 0){
                  current = current.next;
                  x--;
            }
        }
         else
            head = tail = current;
   }
   return current;
} 
void addPosK(int k, int x){
    if(isEmpty()){
        if(k == 0){
            head = tail = new Node(x,null);
            return;
        }else{
            return;
        }
    }
    if(k == 0){
        addHead(x);
        return;
    }
    Node p = head;
    int count=0;
    Node q = new Node(x,null);
    while(p != null){
        if(count++ == k -1){
            q.next = p.next;
            p.next = q;
            if(tail.next != null){
                tail = q;
            }
        }else{
            p = p.next;
        }
    }  
}
void addManyTail(int []a){
    for (int i = 0; i < a.length; i++) {
        add(a[i]);
    }
}
void addManyHead(int []a){
    for (int i = 0; i < a.length; i++) {
        addHead(a[i]);
    }
}
   public static void main(String[] args) {
        // TODO code application logic here
        int []a={5,6,1,2,9,7};
        MyList list= new MyList();
       list.addManyTail(a);
       list.traverse();
       list.addManyHead(a);
       list.traverse();
       System.out.println(list.search(5).info);
       System.out.println(list.searchvitri(3).info);
       list.deleteEnd();
       list.deleteStart();
       list.traverse();
       list.delete(5);
       list.traverse();
       list.addPosK(3, 4);
       list.traverse();
    }
}

//viet chuong trinh quan ly sinh vien, biet rang moi sv gom co 2 thuoc tinh name va age.
//chuong trinh gom co tat ca cac ham va cac lop giong nhu bai quan ly danh sach so nguyen
//(bai da chua tren lop). Ngoai ra sinh vien co the them  vao mot so lop hoac ham
//neu cam thay can thiet (Tim kiem co the theo name thi thoi age hoac nguoc lai)
