package Question;

public class Text {
    public static void main(String[] args) {
    	// ������ѡ��
    	MultiChoice mc = new  MultiChoice("����������Щ����",new String[] {"1.����","2.������","3.����","4.����"} ,new int[] {1,2});  
    	int[] answer = new int[] {1,3};
    	boolean check = mc.check(answer);
    	System.out.println(check);
	    //������ѡ��
    	SingleChoice sc	 =new SingleChoice("��Ҫ����������",new String[] {"1.����","2.������","3.����","4.����"} ,3);
    	boolean check2 = sc.check(new int[] {3});
        System.out.println(check2);
    
    } 
    
	
	
	
	
}