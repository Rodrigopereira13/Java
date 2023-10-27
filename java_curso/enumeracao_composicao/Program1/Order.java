package java_curso.enumeracao_composicao.Program1;

import java.util.Date;

public class Order {
    
    private Integer id;
    private Date moment;
    private OrderStatusenum status;

    public Order(){
    }

    public Order(Integer id, Date moment, OrderStatusenum status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusenum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusenum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}
