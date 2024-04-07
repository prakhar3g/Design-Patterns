package SplitWiseApplication.group;

import SplitWiseApplication.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private List<Group> groupList;

    public GroupController() {
        this.groupList = new ArrayList<>();
    }

    public void createNewGroup(String groupName, User createdByUser) {
        Group group = new Group(groupName);
        group.addMember(createdByUser);
        groupList.add(group);
    }

    public Group getGroup(String groupName){

        for(Group group: groupList) {

            if(group.getGroupName().equals(groupName)){
                return group;
            }
        }
        return null;
    }

}
