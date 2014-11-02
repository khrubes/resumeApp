package resume.kelseyhrubes;

import java.util.ArrayList;

public class ResumeItemListFactory {

   private ArrayList<ResumeItem> resumeItemsSource;

   public ResumeItemListFactory(){}

    /**
     * takes in an empty ArrayList of ResumeItems and adds the needed fields
     * @param source
     */
   public ResumeItemListFactory(ArrayList<ResumeItem> source){
       this.resumeItemsSource=source;
   }

   public void setupAll(){
       setupSkills();
       setupEducation();
       setupExperience();
       setupAwards();
       setupProjects();
       setupExtraCurriculars();
   }

    private void setupSkills() {
      ResumeItem skills = new ResumeItem("Skills", R.drawable.ic_skills);
      resumeItemsSource.add(skills);
    }

    private void setupEducation() {
        ResumeItem education = new ResumeItem("Education", R.drawable.ic_education);
        resumeItemsSource.add(education);
    }

    private void setupExperience() {
        ResumeItem experience = new ResumeItem("Experience", R.drawable.ic_experience);
        resumeItemsSource.add(experience);
    }

    private void setupAwards() {
        ResumeItem awards = new ResumeItem("Awards", R.drawable.ic_awards);
        resumeItemsSource.add(awards);
    }

    private void setupProjects() {
        ResumeItem projects = new ResumeItem("Projects", R.drawable.ic_projects);
        resumeItemsSource.add(projects);
    }

    private void setupExtraCurriculars() {
        ResumeItem extracurriculars = new ResumeItem("Extracurriculars", R.drawable.ic_extracurriculars);
        resumeItemsSource.add(extracurriculars);
    }

}
