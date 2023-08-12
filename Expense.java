import java.math.BigDecimal;

public class Expense
{
    private String name;

    private String description;

    private BigDecimal amount;

    private Category category;

    public Expense(String name, String description, BigDecimal amount, Category category)
    {
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }
}
