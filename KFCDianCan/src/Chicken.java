/**
 * ������
 * @author lenovo
 *
 */
public abstract class Chicken extends AbstractFood implements Food{
	 public void printMessage(){
	        System.out.println("--"+this.kind+"  ���ۣ�"+this.price+
	                "  ������"+this.num+"  �ϼƣ�"+this.totalPrice());
	    }
}
