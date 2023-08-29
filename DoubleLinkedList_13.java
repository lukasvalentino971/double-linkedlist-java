public class DoubleLinkedList_13{
    Node_13 head ;
    int size ;


    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Pembeli_13 data1){
        if(isEmpty()){
            head = new Node_13(null, data1, null);
        } else{
            Node_13 newNode = new Node_13(null, data1, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli_13 data1){
        if(isEmpty()){
            addFirst(data1);
        } else{
            Node_13 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_13 newNode = new Node_13(current, data1, null);
            current.next = newNode;
            size++;
        }
    }


    public void addFirstPesanan(Pesanan_13 data2){
        if(isEmpty()){
            head = new Node_13(null, data2, null);
        } else{
            Node_13 newNode = new Node_13(null, data2, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLastPesanan(Pesanan_13 data2){
        if(isEmpty()){
            addFirstPesanan(data2);
        } else{
            Node_13 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node_13 newNode = new Node_13(current, data2, null);
            current.next = newNode;
            size++;
        }
    }



    public int size(){
        return size;
    }


    public void print(){
        if(!isEmpty()){
            Node_13 tmp = head;
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("DAFTAR ANTRIAN RESTO ROYAL DELISH : ");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("|Nama Customer \t| No.HP \t");
            while (tmp != null){
                System.out.println("|" + tmp.data1beli.namaPembeli + "\t\t|" + tmp.data1beli.noHp + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
			System.out.println("Sisa Antrian: " + size());
        } else{
            System.out.println("List Antrian kosong");
        }
    }

    public void printPesanan(){
        if(!isEmpty()){
            Node_13 tmp = head;
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("DAFTAR Pesanan Masuk RESTO ROYAL DELISH : ");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("|Nama pesanan \t| Harga \t");
            while (tmp != null){



                System.out.println("|" + tmp.data2pesan.kodePesanan + "\t|"+ tmp.data2pesan.namaPesanan + "\t|" + tmp.data2pesan.harga + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
			System.out.println("Sisa Antrian: " + size());
        } else{
            System.out.println("List Antrian kosong");
        }
    }


    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("List Antrian masih kosong, tidak dapat dihapus!");
        } else if(size == 1){
            removeLast();
        } else{
           System.out.println("Data yang dihapus: ");
           System.out.println(head.data1beli.namaPembeli + " telah memesan menu");
           head = head.next;
           head.prev = null;
           size--;
        }
    }


    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if(head.next == null){
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
        while(current.next.next != null){
            current = current.next;
        }
        System.out.println("Data yang dihapus: ");
        System.out.println(head.data1beli.namaPembeli + " telah memesan menu");
        current.next = null;
        size--;
    }


}