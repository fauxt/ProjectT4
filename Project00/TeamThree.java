package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.SchaperMember;
import Project00.LucianoMember;
import Project00.HeimMember;
import Project00.JannuzziMember;


public class TeamThree extends Team
{
    public TeamThree(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new LucianoMember("Jordan Luciano"));
        members.add(new HeimMember("George Heim"));
        members.add(new JannuzziMember("Francis Jannuzzi"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}
