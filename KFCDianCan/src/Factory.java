/**
 * �ϵ»����󹤳�
 * @author lenovo
 *
 */
public interface Factory {
	public interface factory {
	    //��������
	    public Hamburger createHamburger(int num);

	    //����ը����ʳ��
	    public Chicken createChicken(int num);

	    //�������
	    public Dessert createDessert(int num);

	    //������Ʒ
	    public Drinks createDrinks(int num);
	}
	public Hamburger createZingerBurger(int num);
	public Hamburger createBeefBurger(int num);
	public Hamburger createOrleansBurger(int num);
	public Hamburger createShrimpBurger(int num);
	public Chicken createChickenWings(int num);
	public Chicken createDrumStick(int num);
	public Chicken createPopcornChicken(int num);
	public Dessert createChips(int num);
	public Dessert createEggTart(int num);
	public Dessert createSundae(int num);
	public Drinks createMilky(int num);
	public Drinks createKola(int num);
	public Drinks createCoffee(int num);
	public Combo createOneCombo(int num);
	public Combo createTwoCombo(int num);
	public Combo createThreeCombo(int num);
}
