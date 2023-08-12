public enum Category 
{
    FOODANDDRINK("Food and Drink"), ENTERTAINMENT("Entertainment"), BILLS("Bills"), TRAVEL("Travel"), SHOPPING("Shopping"), GAS("Gas"), GROCERIES("Groceries");

    private final String category;

    Category(String category)
    {
        this.category = category;
    }

    public String toString()
    {
        return category;
    }

}
