package kareem;

public class arrayascend {
	public static void main(String[] args) {
		int[] kareemarray=new int[] {88,34,23,45,67,77};
		for(int i=0;i<kareemarray.length;i++) {
			for(int j=i;j<kareemarray.length;j++) {
				if(kareemarray[i]<kareemarray[j]) {
					int temp=kareemarray[i];
					kareemarray[i]=kareemarray[j];
					kareemarray[j]=temp;
				}
			}
			
		}
	
for(int a:kareemarray) {
	System.out.println(+a);
	
}

	}
}

