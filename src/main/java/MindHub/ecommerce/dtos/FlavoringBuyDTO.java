package MindHub.ecommerce.dtos;

public class FlavoringBuyDTO {
    private Long id;
    private Double price;
    private Integer quantity;

    public FlavoringBuyDTO(Long id, Double price, Integer quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
