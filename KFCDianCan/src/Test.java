import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        /**
         * ����һ���ϵ»���factory���ͣ�
         */
        Factory factory = new KFCFactory();
        /**
         * �����ͻ�
         */
        Customer customer = new Customer(factory);
        /**
         * �ͻ����
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
        System.out.println("��ӭ�������Լ���������ϵͳ��\n"
        		+"******************�󼪴����˵�******************\n"
        		+"�����ࣺ\n"
        		+ "1.�������ȱ�--15.0Ԫ                          2.�¶��������ȱ�--17.0Ԫ \n"
        		+ "3.����ţ�Ɽ--17.0Ԫ                          4.ȫϺ��--17.0Ԫ\n"
        		+"�����ࣺ\n"
        		+ "5.�¶�������--6.0Ԫ                             6.������--12.0Ԫ\n"
        		+ "7.���׻�--11.0Ԫ\n"
        		+ "����ࣺ\n"
        		+ "8.����--8Ԫ                                              9.��̢--4Ԫ\n"
        		+ "10.ʥ��--6Ԫ\n"
        		+"��Ʒ�ࣺ\n"
        		+ "11.����--6Ԫ                                           12.�̲�--6Ԫ\n"
        		+ "13.����--12Ԫ\n"
        		+"�ײ��ࣺ\n"
        		+"14.�����ײ�--33Ԫ\n"
        		+ "  1���������ȱ�+1��������+1������+1������/�̲裨�ε㣩\n"
        		+"15.˫���ײ�:--54Ԫ\n"
        		+ "  1���������ȱ�+1���¶��������ȱ�/����ţ�Ɽ/ȫϺ�����ε㣩\n"
        		+ "  1�԰¶�������+2����̢+2������/�̲裨�ε㣩\n"
        		+"16.�����ײ�--109Ԫ\n"
        		+ "  3���¶��������ȱ�/����ţ�Ɽ/ȫϺ�����ε㣩\n"
        		+ "  1�԰¶�������+1��������+1�����׻�\n"
        		+ "  1������+2��ʥ��+2������/�̲裨�ε㣩+1������\n"
        		+"*********************************************\n");
        while(true){
        	System.out.println("��ѡ����ŵ��");
            int a=input.nextInt();
            System.out.println("��ѡ������");
            int b=input.nextInt();
            switch(a){
            case 1:
            	//�������ȱ�
            	ZingerBurger = customer.orderZingerBurger(b);
                break;
            case 2:
            	//�¶��������ȱ�
                OrleansBurger = customer.orderOrleansBurger(b);
                break;
            case 3:
            	//����ţ�Ɽ
                BeefBurger = customer.orderBeefBurger(b);
                break;
            case 4:
            	//ȫϺ��
                ShrimpBurger = customer.orderShrimpBurger(b);
                break;
            case 5:  
            	//�¶���������
                ChickenWings = customer.orderChickenWings(b);
                break;  
            case 6:  
            	//������
                DrumStick = customer.orderDrumStick(b);
                break;
            case 7: 
            	 //���׻�
                PopcornChicken = customer.orderPopcornChicken(b);
                break;
            case 8: 
                //����
                Chips = customer.orderChips(b);
                break;
            case 9: 
                //��̢
                EggTart = customer.orderEggTart(b);
                break;
            case 10: 
                //ʥ��
                Sundae = customer.orderSundae(b);
                break;
            case 11: 
                //����
                Kola = customer.orderKola(b);
                break;
            case 12: 
                //�̲�
                Milky = customer.orderMilky(b);
                break;
            case 13: 
                //����
                Coffee = customer.orderCoffee(b);
                break;
            case 14: 
                //�����ײ�
                OneCombo = customer.orderOneCombo(b);
                break;
            case 15: 
                //˫���ײ�
                TwoCombo = customer.orderTwoCombo(b);
                break;
            case 16: 
                //�����ײ�
                ThreeCombo = customer.orderThreeCombo(b);
                break;
            }
            System.out.println("��ѡ���Ƿ������ͣ�1.��   2.��");
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
        System.out.println("�˴ε�͹��ƣ�"+money);
        System.out.println("�������Ƿ�����Ż�ȯ�� 1.��   2.��");
        int c=input.nextInt();
        int d=0;
        if(c==1){
        	System.out.println("�������Ż�ȯ���");
        	d=input.nextInt();
        }
        System.out.println("������ʵ�����");
        int e=input.nextInt();
        float changes=e-money+d;
        System.out.println("���㣺"+changes);
        System.out.println("��ӭ�´ε�ͣ�ף���ò���죡");
    }

}
