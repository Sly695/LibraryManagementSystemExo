import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Publication> catalog;
    List<Member> members;

    public Library(){
        this.catalog = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addPublication(Publication publication){
        catalog.add(publication);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public void borrowItem(Member member, Publication item){

    }

    public void returnItem(Member member, Publication item){

    }

    public List<String> printCatalog(){
        List<String> publicationStored = new ArrayList<>();
        for (Publication item : catalog) {
            publicationStored.add(item.title);
        }
        return publicationStored;
    }

    public List<String> printMembers(){
        List<String> memberSubscribed = new ArrayList<>();
        for (Member person : members) {
            memberSubscribed.add(person.name);
        }
        return memberSubscribed;
    }
}
