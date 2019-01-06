/**
 * �˿���
 * @author lenovo
 *
 */
public class Customer {

    //���󹤳�
    private Factory factory;

    //���췽�������󹤳���Ϊ��������
    public Customer(Factory factory){
        this.factory = factory;
    }

    /**
     * ���
     */
    public float orderZingerBurger(int num){
        //����������ȱ�
        Hamburger zingerBurger = factory.createZingerBurger(num);
        //���������Ϣ
        zingerBurger.printMessage();
        //�����ܼ�
        return zingerBurger.totalPrice();
    }
    public float orderBeefBurger(int num){
        //��ó���ţ�Ɽ
        Hamburger beefBurger = factory.createBeefBurger(num);
        //���������Ϣ
        beefBurger.printMessage();
        //�����ܼ�
        return beefBurger.totalPrice();
    }
    public float orderOrleansBurger(int num){
        //��ð¶��������ȱ�
        Hamburger orleansBurger = factory.createOrleansBurger(num);
        //���������Ϣ
        orleansBurger.printMessage();
        //�����ܼ�
        return orleansBurger.totalPrice();
    }
    public float orderShrimpBurger(int num){
        //���ȫϺ��
        Hamburger shrimpBurger = factory.createShrimpBurger(num);
        //���������Ϣ
        shrimpBurger.printMessage();
        //�����ܼ�
        return shrimpBurger.totalPrice();
    }
    public float orderChickenWings(int num){
        //��ð¶�������
        Chicken chickenWings = factory.createChickenWings(num);
        //���������Ϣ
        chickenWings.printMessage();
        //�����ܼ�
        return chickenWings.totalPrice();
    }
    public float orderDrumStick(int num){
        //��� ������
        Chicken drumStick = factory.createDrumStick(num);
        //���������Ϣ
        drumStick.printMessage();
        //�����ܼ�
        return drumStick.totalPrice();
    }
    public float orderPopcornChicken(int num){
        //��ü��׻�
        Chicken popcornChicken = factory.createPopcornChicken(num);
        //���������Ϣ
        popcornChicken.printMessage();
        //�����ܼ�
        return popcornChicken.totalPrice();
    }
    public float orderChips(int num){
        //�������
        Dessert chips = factory.createChips(num);
        //���������Ϣ
        chips.printMessage();
        //�����ܼ�
        return chips.totalPrice();
    }
    public float orderEggTart(int num){
        //��õ�̢
    	Dessert eggTart = factory.createEggTart(num);
        //���������Ϣ
    	eggTart.printMessage();
        //�����ܼ�
        return eggTart.totalPrice();
    }
    public float orderSundae(int num){
        //���ʥ��
    	Dessert sundae = factory.createSundae(num);
        //���������Ϣ
    	sundae.printMessage();
        //�����ܼ�
        return sundae.totalPrice();
    }
    public float orderMilky(int num){
        //����̲�
    	Drinks milky = factory.createMilky(num);
        //���������Ϣ
    	milky.printMessage();
        //�����ܼ�
        return milky.totalPrice();
    }
    public float orderKola(int num){
        //��ÿ���
    	Drinks kola = factory.createKola(num);
        //���������Ϣ
    	kola.printMessage();
        //�����ܼ�
        return kola.totalPrice();
    }
    public float orderCoffee(int num){
        //��ÿ���
    	Drinks coffee = factory.createCoffee(num);
        //���������Ϣ
    	coffee.printMessage();
        //�����ܼ�
        return coffee.totalPrice();
    }

	public float orderOneCombo(int num) {
		//�����ײ�
		Combo oneCombo = factory.createOneCombo(num);
		//���������Ϣ
		oneCombo.printMessage();
        //�����ܼ�
        return oneCombo.totalPrice();
	}

	public float orderTwoCombo(int num) {
		//˫���ײ�
		Combo twoCombo = factory.createTwoCombo(num);
		//���������Ϣ
		twoCombo.printMessage();
		//�����ܼ�
		return twoCombo.totalPrice();
	}

	public float orderThreeCombo(int num) {
		//�����ײ�
	    Combo threeCombo = factory.createThreeCombo(num);
	    //���������Ϣ
	    threeCombo.printMessage();
		//�����ܼ�
		return threeCombo.totalPrice();
	}

}