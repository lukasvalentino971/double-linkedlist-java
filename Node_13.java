public class Node_13{
    Pembeli_13 data1beli ;
    Pesanan_13 data2pesan ;
    Node_13 next ;
    Node_13 prev ;

    Node_13(Node_13 prev, Pembeli_13 data1beli, Node_13 next ){
        this.data1beli = data1beli ;
        this.next = next ;
        this.prev = prev ;
    }

    Node_13(Node_13 prev, Pesanan_13 data2pesan, Node_13 next){
        this.data2pesan = data2pesan ;
        this.next = next ;
        this.prev = prev ;
    }
}