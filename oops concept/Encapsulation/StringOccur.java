class StringOccur{
 public static void main(String[] args){
	String str = "abbcccdddd";
	boolean flag = false;
	int cnt = 0;
	for(int i=0;i<str.length();i++){
		flag=false;
		for(int j=0;j<str.length();j++){
			if(!flag){
				flag = true;
				cnt++;
			}
		}
	}
	System.out.println(cnt);
 }
 }