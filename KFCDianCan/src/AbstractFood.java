public abstract class AbstractFood {
	//���
    protected String kind;
    //����
    protected int num;
    //�۸�
    protected float price;

    //�ϼ�
    public float totalPrice(){
        return this.num * this.price;
    }
}
