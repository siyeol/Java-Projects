package hero_selection;

public class Magician extends Character {
	

	private String Trait;
	private String Skill1;
	private String Skill2;
	
	
	public String getTrait() {
		return Trait;
	}

	public void setTrait(String trait) {
		this.Trait = trait;
	}

	public String getSkill1() {
		return Skill1;
	}

	public void setSkill1(String skill1) {
		this.Skill1 = skill1;
	}

	public String getSkill2() {
		return Skill2;
	}

	public void setSkill2(String skill2) {
		this.Skill2 = skill2;
	}


	public Magician (String Name, int Level, String Skill1, String Skill2) {
		super(Name, Level);
		this.Name = Name;
		this.Level=Level;
		Trait = "������ ����ϴ� ĳ����";
		this.Skill1 = Skill1;
		this.Skill2 = Skill2;
		
	}
	
	public void showInfo() {
		System.out.println("========================");
		System.out.println("�� ĳ���ʹ� ������ �Դϴ�.");
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getLevel());
		System.out.println("Ư¡ : " + getTrait());
		System.out.println("������ų1 : " + getSkill1());
		System.out.println("������ų2 : " + getSkill2());
		System.out.println("");

	}

	
}
