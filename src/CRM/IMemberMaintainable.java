package CRM;

public interface IMemberMaintainable extends IViewer
{
	void Add(Member member);
	void Add(Customer customer, Car car, java.time.LocalDateTime expectedReturnDateTime);
	void Update(Member old, Member newMember);
	void Remove(Member member);
}