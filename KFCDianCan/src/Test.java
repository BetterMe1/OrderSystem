import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        /**
         * 定义一个肯德基（factory类型）
         */
        Factory factory = new KFCFactory();
        /**
         * 创建客户
         */
        Customer customer = new Customer(factory);
        /**
         * 客户点餐
         */
        Scanner input =new Scanner(System.in);
        float ZingerBurger = 0;float OrleansBurger= 0;
        float BeefBurger= 0;float ShrimpBurger = 0;
        float ChickenWings= 0;float DrumStick = 0;
        float PopcornChicken = 0; float Chips= 0;
        float EggTart= 0;float Sundae = 0;
        float Kola= 0; float Milky= 0;
        float Coffee = 0;float OneCombo= 0;
        float TwoCombo= 0;float ThreeCombo = 0;
        System.out.println("欢迎进入今晚吃鸡汉堡店点餐系统！\n"
        		+"******************大吉大利菜单******************\n"
        		+"汉堡类：\n"
        		+ "1.香辣鸡腿堡--15.0元                          2.奥尔良烤鸡腿堡--17.0元 \n"
        		+ "3.超级牛肉堡--17.0元                          4.全虾堡--17.0元\n"
        		+"鸡肉类：\n"
        		+ "5.奥尔良烤翅--6.0元                             6.烤鸡腿--12.0元\n"
        		+ "7.鸡米花--11.0元\n"
        		+ "甜点类：\n"
        		+ "8.薯条--8元                                              9.蛋挞--4元\n"
        		+ "10.圣代--6元\n"
        		+"饮品类：\n"
        		+ "11.可乐--6元                                           12.奶茶--6元\n"
        		+ "13.咖啡--12元\n"
        		+"套餐类：\n"
        		+"14.单人套餐--33元\n"
        		+ "  1个香辣鸡腿堡+1个烤鸡腿+1包薯条+1杯可乐/奶茶（任点）\n"
        		+"15.双人套餐:--54元\n"
        		+ "  1个香辣鸡腿堡+1个奥尔良烤鸡腿堡/超级牛肉堡/全虾堡（任点）\n"
        		+ "  1对奥尔良烤翅+2个蛋挞+2杯可乐/奶茶（任点）\n"
        		+"16.三人套餐--109元\n"
        		+ "  3个奥尔良烤鸡腿堡/超级牛肉堡/全虾堡（任点）\n"
        		+ "  1对奥尔良烤翅+1个烤鸡腿+1包鸡米花\n"
        		+ "  1包薯条+2杯圣代+2杯可乐/奶茶（任点）+1杯咖啡\n"
        		+"*********************************************\n");
        while(true){
        	System.out.println("请选择序号点餐");
            int a=input.nextInt();
            System.out.println("请选择数量");
            int b=input.nextInt();
            switch(a){
            case 1:
            	//香辣鸡腿堡
            	ZingerBurger = customer.orderZingerBurger(b);
                break;
            case 2:
            	//奥尔良烤鸡腿堡
                OrleansBurger = customer.orderOrleansBurger(b);
                break;
            case 3:
            	//超级牛肉堡
                BeefBurger = customer.orderBeefBurger(b);
                break;
            case 4:
            	//全虾堡
                ShrimpBurger = customer.orderShrimpBurger(b);
                break;
            case 5:  
            	//奥尔良烤鸡翅
                ChickenWings = customer.orderChickenWings(b);
                break;  
            case 6:  
            	//烤鸡腿
                DrumStick = customer.orderDrumStick(b);
                break;
            case 7: 
            	 //鸡米花
                PopcornChicken = customer.orderPopcornChicken(b);
                break;
            case 8: 
                //薯条
                Chips = customer.orderChips(b);
                break;
            case 9: 
                //蛋挞
                EggTart = customer.orderEggTart(b);
                break;
            case 10: 
                //圣代
                Sundae = customer.orderSundae(b);
                break;
            case 11: 
                //可乐
                Kola = customer.orderKola(b);
                break;
            case 12: 
                //奶茶
                Milky = customer.orderMilky(b);
                break;
            case 13: 
                //咖啡
                Coffee = customer.orderCoffee(b);
                break;
            case 14: 
                //单人套餐
                OneCombo = customer.orderOneCombo(b);
                break;
            case 15: 
                //双人套餐
                TwoCombo = customer.orderTwoCombo(b);
                break;
            case 16: 
                //三人套餐
                ThreeCombo = customer.orderThreeCombo(b);
                break;
            }
            System.out.println("请选择是否继续点餐，1.是   2.否");
            int c=input.nextInt();
            if(c!=1){
            	break;
            }
        }
        float money1=ZingerBurger+OrleansBurger+BeefBurger+ShrimpBurger;
        float money2=+ChickenWings+DrumStick+PopcornChicken;
        float money3=+Chips+EggTart+Sundae;
        float money4=Kola+Milky+Coffee;
        float money5=OneCombo+TwoCombo+ThreeCombo;
        float money=money1+money2+money3+money4+money5;
        System.out.println("此次点餐共计："+money);
        System.out.println("请问您是否具有优惠券？ 1.是   2.否");
        int c=input.nextInt();
        int d=0;
        if(c==1){
        	System.out.println("请输入优惠券金额");
        	d=input.nextInt();
        }
        System.out.println("请输入实付金额");
        int e=input.nextInt();
        float changes=e-money+d;
        System.out.println("找零："+changes);
        System.out.println("欢迎下次点餐，祝您用餐愉快！");
    }

}
