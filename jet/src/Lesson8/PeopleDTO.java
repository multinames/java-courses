package Lesson8;

import java.util.List;

public class PeopleDTO {
    List<People> peopleList;

    public PeopleDTO(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public PeopleDTO (){};

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public String toString() {
        return "PeopleDTO{" +
                "peopleList=" + peopleList +
                '}';
    }
}
