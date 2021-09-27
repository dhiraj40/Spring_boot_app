package todo.todoapp.Model;

import java.util.Date;

public class TodoItem {
    long id;
    long userId;
    String name;
    String desc;
    Date createdDate;
    Date startDate;
    Date endDate;

    public TodoItem() {

    }

    public TodoItem(long userId, String name, String desc, Date createdDate, Date startDate, Date endDate) {
        this.userId = userId;
        this.name = name;
        this.desc = desc;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TodoItem(long id, long userId, String name, String desc, Date createdDate, Date startDate, Date endDate) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.desc = desc;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userId='" + getUserId() + "'" +
            ", name='" + getName() + "'" +
            ", desc='" + getDesc() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            "}";
    }

}
