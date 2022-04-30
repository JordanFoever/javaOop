package com.hxut.team.view;

import com.hxut.team.domain.Employee;
import com.hxut.team.domain.Programmer;
import com.hxut.team.service.NameListService;
import com.hxut.team.service.TeamService;

/**
 * @author weijiangquan
 * @date 2022/4/30 -0:24
 * @Description 视图展示区
 */

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSer = new TeamService();

    public  void enterMainMenu(){
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag){
            if(menu != '1'){
                listAllEmployees();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
            menu = TSUtility.readMenuSelection();  //读取菜单
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否要退出(Y/N)");
                    char isExit = TSUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }

    }

    /**
     * 显示所有的员工信息
     */
    private void listAllEmployees(){
        // System.out.println("显示公司的所有的员工信息");
        System.out.println("------------------------开发团队调度软件------------------------------------------");
        System.out.println();

        Employee[] allEmployees = listSvc.getAllEmployees();
        if(allEmployees == null||allEmployees.length == 0){  //allEmployees == null这样写是为了避免没有这个数组出现空指针异常
            System.out.println("该公司没有员工");
        }else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for(int i = 0;i<allEmployees.length;i++){
                System.out.println(allEmployees[i]);
            }
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
    private void getTeam(){
        // 查看开发团队的情况
        System.out.println("--------------------团队成员情况-----------------------------\n");
        Programmer[] team = teamSer.getTeam();
        if(team == null || team.length == 0){
            System.out.println("开发团队没有成员");
        }else {
            System.out.println("TID/ID\t姓\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0;i<team.length;i++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("--------------------------------------------------------------");
    }
    private void addMember(){
        //添加团队的成员

    }
    private void deleteMember(){
        System.out.println("删除团队成员");
    }

    public  static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}


