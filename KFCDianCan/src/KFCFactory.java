
public class KFCFactory implements Factory{
	 //�����������ȱ�
	public ZingerBurger createZingerBurger(int num) {
        return new ZingerBurger(num);
    }
	//��������ţ�Ɽ
    public BeefBurger createBeefBurger(int num) {
        return new BeefBurger(num);
    }
    //�¶��������ȱ�
    public OrleansBurger createOrleansBurger(int num) {
        return new OrleansBurger(num);
    }
    //����ȫϺ��
    public ShrimpBurger createShrimpBurger(int num) {
        return new ShrimpBurger(num);
    }
    //�¶�������
    public ChickenWings createChickenWings(int num) {
        return new ChickenWings(num);
    }
    //������
    public DrumStick createDrumStick(int num) {
        return new DrumStick(num);
    }
    //���׻�
    public PopcornChicken createPopcornChicken(int num) {
        return new PopcornChicken(num);
    }
    //��������
    public Chips createChips(int num){
    	return new Chips(num);
    }
    //������̢
    public EggTart createEggTart(int num){
    	return new EggTart(num);
    }
    //����ʥ��
    public Sundae createSundae(int num){
    	return new Sundae(num);
    }
    //�����̲�
    public Milky createMilky(int num){
    	return new Milky(num);
    }
    //��������
    public Kola createKola(int num){
    	return new Kola(num);
    }
    //��������
    public Coffee createCoffee(int num){
    	return new Coffee(num);
    }
    //���������ײ�
    public OneCombo createOneCombo(int num){
    	return new OneCombo(num);
    }
    //����˫���ײ�
    public TwoCombo createTwoCombo(int num){
    	return new TwoCombo(num);
    }
    //���������ײ�
    public ThreeCombo createThreeCombo(int num){
    	return new ThreeCombo(num);
    }
}
