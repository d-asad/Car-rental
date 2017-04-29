package CRM;

public interface IViewer
{

	void ViewAll(ViewType type);
	void ViewAll(ViewType type, boolean isAvailable);
}