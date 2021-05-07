if(head == null){
    return false;
}

SinglyLinkedListNode lento = head;
SinglyLinkedListNode rapido = head.next;

while(rapido != null && rapido.next != null){
    if(rapido == lento){
        return true;
    }
    
    
    rapido = rapido.next.next;
    lento = lento.next;
}

return false;