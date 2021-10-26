package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client clients;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, Client clients) {
        this.moment = moment;
        this.status = status;
        this.clients = clients;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClients() {
        return clients;
    }
    public void setClients(Client clients) {
        this.clients = clients;
    }
    public List<OrderItem> getItems() {
        return items;
    }
   
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    
}
