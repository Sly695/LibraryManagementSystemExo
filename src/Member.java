import java.util.List;
import java.util.ArrayList;

public class Member {
    String name;
    int memberInt;
    List<Borrowable> borrowedItems;

    public Member(String name, int memberInt, Library library){
        this.name = name;
        this.memberInt = memberInt;
        borrowedItems = new ArrayList<>();
        library.addMember(this);
    }

    public void borrowItems (Borrowable item){
        if( item instanceof Newspaper){
            System.out.println("Les journaux ne peuvent être empruntés.");
        } else {
            if(item.isBorrowed()){
                System.out.println("Désolé " + name + ", " + item.getName() + " est déjà emprunté.");
            } else {
                borrowedItems.add(item);
                item.borrow();
            }

        }
    }

    public void returnItem(Borrowable item){
        borrowedItems.remove(item);
        item.returnitem();
    }

    public List<String> printBorrowedItems(){
        List<String> listBorrowedItems = new ArrayList<>();
        for (Borrowable item : borrowedItems) {
            listBorrowedItems.add(item.getName());
        }
        return listBorrowedItems;
    }
}
