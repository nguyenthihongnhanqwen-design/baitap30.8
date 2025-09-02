package CoSoVatChat;

public class main {
	public static void main(String[] args) {
		Ban b1 = new Ban("b001", CoSoVatChat.ChatLieu.GO,CoSoVatChat.KichCo.NHO,5,4.5,3.6);
		Ghe g1= new Ghe("G001",CoSoVatChat.KichCo.LON,CoSoVatChat.ChatLieu.KIMLOAI,4, false);
		double CNb1 = b1.canNang();
		double CNg1 = g1.canNang();
		System.out.println("Can nag cua ban la : "+CNb1+"\nCan nang cua ghe la: "+CNg1);	}

}
