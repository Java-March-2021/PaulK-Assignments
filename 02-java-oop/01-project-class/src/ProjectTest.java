public class ProjectTest {

    public static void main(String[] args) {
        Project advertisingProject = new Project();
        advertisingProject.setName("Acme Advertising");
        advertisingProject.setCost(300000);
        advertisingProject.setDesc("Acme Corporation. AAdvertosomg campaign for Acme Corporation's new product line of widgets for 2021");
        System.out.println(advertisingProject.elevatorPitch());
        Portfolio portfolio = new Portfolio();
        portfolio.setPortfolioProject(advertisingProject);
    }
    
}