package main;

public class BarChartDatas {

    String groupField;
    String categoryField;
    Integer valueField;

    public BarChartDatas(String groupField, String categoryField, Integer valueField) {
        this.groupField = groupField;
        this.categoryField = categoryField;
        this.valueField = valueField;
    }

    public String getGroupField() {
        return groupField;
    }

    public void setGroupField(String groupField) {
        this.groupField = groupField;
    }

    public String getCategoryField() {
        return categoryField;
    }

    public void setCategoryField(String categoryField) {
        this.categoryField = categoryField;
    }

    public Integer getValueField() {
        return valueField;
    }

    public void setValueField(Integer valueField) {
        this.valueField = valueField;
    }

  

}
