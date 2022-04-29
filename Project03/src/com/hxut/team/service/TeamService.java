package com.hxut.team.service;

import com.hxut.team.domain.Architect;
import com.hxut.team.domain.Designer;
import com.hxut.team.domain.Employee;
import com.hxut.team.domain.Programmer;

/**
 * @author weijiangquan
 * @date 2022/4/29 -22:06
 * @Description 关于开发团队成员的管理,添加,删除等.
 */
public class TeamService {

    private static int counter = 1; //给memberId赋值使用
    private final static int MAX_MEMBER = 5;//限制开发团队的人数(最多为5个人)
    private Programmer[] team = new Programmer[5];//用来保存开发团队的人员

    private int total;//用来记录团队中实际的开发人数

    public TeamService() {
    }

    /**
     * 获取开发团队中的所有的成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for(int i = 0;i<team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 讲指定的员工添加到开发团队中
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        //1.成员已经满了.无法添加
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已经满了,无法添加");
        }
        //2.该成员不是开发成员,无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员,无法添加");
        }
        //3.该员工已经在开发团队中
        if(isExist(e)){
            throw new TeamException("改员工已经在开发团队中");
        }
        //4.该员工已经是某团队的成员

        //5.该成员正在休假,无法添加
        Programmer p = (Programmer)e; //一定不会出现ClassCassException异常 这个地方设计到多态里面的知识,父类引用不能调用子类特有的方法,这里必须强化强转成子类的引用
        if("BUSY".equals(p.getStatus().getNAME())){  //p.getStatus().getNAME().equals("BUSY")这种可能会出现空指针异常
            throw new TeamException("该员工已经是某团队的成员了");
        }else if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员工正在休假,无法添加");
        }
        //6.团队中最多只能有一名架构师

        //7.团队中最多只能有两名设计师
        //8.团队中最多只能有三名程序员

        //获取team中已有的成员中架构师,设计师,程序员的人数
        int numOfArch = 0,numOfDes =0,numOfPro = 0;
        for(int i =0;i<total;i++){
             if(team[i] instanceof Architect){
                 numOfArch++;
             }else if(team[i] instanceof Designer){
                 numOfDes++;
            }else if(team[i] instanceof Programmer){
                 numOfPro++;
             }
        }

        if(p instanceof  Architect){
            if(numOfArch>=1){
                throw new TeamException("团队中至多有一名架构师");
            }
        }else if(p instanceof Designer){
            if(numOfDes >=2){
                throw new TeamException("团队中至多有两名设计师");
            }
        }else if(p instanceof  Programmer){
            if(numOfPro >= 3){
                throw new TeamException("团队中至多有三名程序员");
            }
        }

        // 将p(或e)添加到现有的team中
        team[total++]=p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    /**
     * 判断指定的员工是否存在于现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e){
        for(int i = 0;i<total;i++){
            if(e.getId() == team[i].getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * 从团队中把某一个员工干掉
     */
    public void removeMember(int memberId){

    }
}

