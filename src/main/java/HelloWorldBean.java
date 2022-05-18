import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {

	private String categoryType;
	private Person selectedPerson;
	private List<Person> people;
	private List<Person> filteredPeople;
	private String message;

	@PostConstruct
	public void init() {
		message = "Hello World";
		this.people = this.getData();
		this.filteredPeople = this.getData();
	}

	private List<Person> getData () {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Ali", "Meftahi", 70));
		persons.add(new Person("Ahmad", "Afshari", 30));
		persons.add(new Person("Navid", "Mehrabi", 28));
		return new ArrayList<>(persons);
	}

	public void updateGrowl() {
		addMessage("Success", "Data updated");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Person getSelectedPerson() {
		return selectedPerson;
	}

	public void setSelectedPerson(Person selectedPerson) {
		this.selectedPerson = selectedPerson;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Person> getFilteredPeople() {
		return filteredPeople;
	}

	public void setFilteredPeople(List<Person> filteredPeople) {
		this.filteredPeople = filteredPeople;
	}
}