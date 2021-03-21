import java.util.ArrayList;

public class Portfolio {
    public ArrayList<Project> Projects;
    public Portfolio() {
        this.Projects = new ArrayList<Project>();
    }
    public void AddToPortfolio(Project p) {
        Projects.add(p);
    }
    public void setPortfolioProject(Project i){
        Projects.add(i);
    }
    public String getPortfolio() {
        return Projects.toString();
    }
    public double getPortfolioCost() {
    	double total = 0;
    	for (Project p : Projects) {
            total += p.getCost();
        }
    	return total;
    }
    public void showPortfolio() {
    	System.out.println("All projects in portfolio:");
    	for(Project p : Projects) {
    		System.out.println(p.elevatorPitch());
    	}
        System.out.println(String.format("Total Cost: %f", this.getPortfolioCost()));

    }
}