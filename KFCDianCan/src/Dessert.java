/**
 * �����
 * @author lenovo
 *
 */
public abstract class Dessert extends AbstractFood implements Food{
	 public void printMessage(){
	        System.out.println("--"+this.kind+"  ���ۣ�"+this.price+
	                "  ������"+this.num+"  �ϼƣ�"+this.totalPrice());
	    }
}
