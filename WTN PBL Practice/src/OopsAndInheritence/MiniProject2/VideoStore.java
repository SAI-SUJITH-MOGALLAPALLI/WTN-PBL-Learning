package OopsAndInheritence.MiniProject2;

import java.util.Arrays;

public class VideoStore {
	Video[] store;
	void addVideo(String name) {
		int storeLength;
		try {
			storeLength=store.length;
		}
		catch(Exception ex) {
			storeLength=0;
			Video video=new Video(name);
			Video[] temp=new Video[storeLength+1];
			temp[storeLength]=video;
			store=temp;
			System.out.println("Video \""+name+"\" added successfully.");
			return;
		}
		store=Arrays.copyOf(store,storeLength+1);
		store[store.length-1]=new Video(name); 
		System.out.println("Video \""+name+"\" added successfully.");
	}
	void doCheckout(String name) {
		try {
			for(int i=0;i<store.length;i++) {
				if(store[i].getName().equalsIgnoreCase(name)) {
					store[i].doCheckout();
					break;
				}
			}
				System.out.println("Vedio \""+name+"\" checked out successfully.");
		}
		catch(Exception ex) {
			System.out.println("Vedio \""+name+"\" does not added to the store.\n");
		}
	}
	void doReturn(String name) {
		int flag=0;
		for(int i=0;i<store.length;i++) {
			if(store[i].getName().equalsIgnoreCase(name)) {
				store[i].doReturn();
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Vedio \""+name+"\" returned successfully.");
		else 
			System.out.println("Vedio \""+name+"\" does not added to the store.\n");
	}
	void receiveRating(String name,int rating) {
		int flag=0;
		for(int i=0;i<store.length;i++) {
			if(store[i].getName().equalsIgnoreCase(name)) {
				store[i].receiveRating(rating);
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Rating \""+rating+"\" has been mapped to the Vedio \""+name+"\".");
		else 
			System.out.println("Video \""+name+"\" does not added to the store.\n");
	}
	void listInventory() {
		System.out.println("----------------------------------------------------");
		System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
		for(int i=0;i<store.length;i++)
			System.out.println(store[i].getName()+"\t\t|\t"+store[i].getCheckout()+"\t\t|\t"+store[i].getRating());
		System.out.println("");
		System.out.println("----------------------------------------------------");
	}
}
