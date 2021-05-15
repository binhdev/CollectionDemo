package basic.dev;

public class Student {
	private String msv;
	private String name;
	private double toan;
	private double ly;
	private double hoa;
	private String dc;
	
	public Student(String msv, String name, double toan, double ly, double hoa, String dc) {
		super();
		this.msv = msv;
		this.name = name;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		this.dc = dc;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public String getDc() {
		return dc;
	}
	public void setDc(String dc) {
		this.dc = dc;
	}
	
	public double dtb() {
		return (toan + ly + hoa) / 3;
	}
	
}
