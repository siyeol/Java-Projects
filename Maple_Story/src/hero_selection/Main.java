package hero_selection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SwordMaster swordmaster = new SwordMaster("���˻�", 30, "���̷�", "����� �˹�");
		Magician magician = new Magician("�������", 210, "�Ҳ��Ŀ�", "�������׿�");
		Archery archery = new Archery("�ֽ�", 100, "�߸�", "���Ÿ� ���");
		
		swordmaster.showInfo();
		magician.showInfo();
		archery.showInfo();
	}

}
