package Background;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @author huangzhangyu�BAUAS
 * �I�����A�Ҧ��D�����ڷ��A�����D�����K�ϡB�樫��T
 */
public abstract class Background {
	private JLabel picture; //�K�ϦbSwing���OJLabel
	private boolean walkable; //�O�_�i�H�樫
	
	
	/**
	 * @param path �Ϥ���m
	 * @return �j�p�ۦP���Ϥ�
	 */
	public ImageIcon getTransformedIcon(String path) {
		ImageIcon icon = new ImageIcon(path);
		Image image = icon.getImage();
		image = image.getScaledInstance(25, 25, Image.SCALE_SMOOTH); //�׹��C�Ӭۤ�����
		return new ImageIcon(image);
	}
	
	
	public JLabel getPicture() {
		return picture;
	}
	public void setPicture(JLabel picture) {
		this.picture = picture;
	}
	public boolean isWalkable() {
		return walkable;
	}
	public void setWalkable(boolean walkable) {
		this.walkable = walkable;
	}
}
