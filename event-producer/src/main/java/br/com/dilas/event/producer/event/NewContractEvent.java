package br.com.dilas.event.producer.event;

public class NewContractEvent {
    private int id;
    private String holder;

    public NewContractEvent() {

    }

    public NewContractEvent(int id, String holder) {
        this.id = id;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "NewContractEvent{" +
                "id=" + id +
                ", holder='" + holder + '\'' +
                '}';
    }
}
