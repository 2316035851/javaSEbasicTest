import java.util.*;

public class CharDemo01{
    public static void main(String[] args){
        String str = "ͳ��һ���ַ����ַ����е�����λ��";
		Scanner scanner = new Scanner(System.in);
		System.out.print("������:");
		String content = scanner.next();
		char frist = content.charAt(0);
		byte[] pos = {};
		for(int i=0;i<str.length();i++){
		    char c = str.charAt(i);
			if(c == frist){
				pos = Arrays.copyOf(pos,pos.length+1);
				pos[pos.length-1] = (byte)i;
			}
		}
		System.out.print(Arrays.toString(pos));
	}
}