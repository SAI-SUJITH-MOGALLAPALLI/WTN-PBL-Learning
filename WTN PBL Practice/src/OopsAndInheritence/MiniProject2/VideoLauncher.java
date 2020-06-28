package OopsAndInheritence.MiniProject2;

import java.io.*;
public class VideoLauncher {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		VideoStore vedioStore=new VideoStore();
		while(true) {
			System.out.println("\nMAIN MENU");
			System.out.println("---------");
			System.out.println("---------");
			System.out.println("1.Add Videos :");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video :");
			System.out.println("4.Receive Rating :");
			System.out.println("5.List Inventory :");
			System.out.println("6.Exit :");
			System.out.print("Enter your choice (1..6) : ");
			int choice=Integer.parseInt(br.readLine());
			System.out.println();
			if(choice==6)
				break;
			else {
				switch(choice) {
					case 1:
						System.out.print("Enter the name of the video you want to add: ");
						String name=br.readLine();
						vedioStore.addVideo(name);
						break;
					case 2:
						System.out.print("Enter the name of the video you want to check out: ");
						name=br.readLine();
						vedioStore.doCheckout(name);
						break;
					case 3:
						System.out.print("Enter the name of the vedio you want to return: ");
						name=br.readLine();
						vedioStore.doReturn(name);
						break;
					case 4:
						System.out.print("Enter the name of the video you want to Rate: ");
						name=br.readLine();
						System.out.print("Enter the rating for this video: ");
						int rating=Integer.parseInt(br.readLine());
						vedioStore.receiveRating(name,rating);
						break;
					case 5:
						vedioStore.listInventory();
						break;
				}
			}
					
		}
	}
}
