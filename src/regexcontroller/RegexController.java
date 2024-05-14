package regexcontroller;

import patientmanager.PatientManager;
import regex.*;
import view.View;

public class RegexController {
    private PatientManager patientManager;
    private Regex[] regexes = new Regex[]{new DateRegex(),
            new HealthRecordCodeRegex(),
            new NameRegex(),
            new HealthRecordIdRegex()};

    private View view;

    public RegexController() {

    }

    public void navigateToPatientManager(int userChoice) {


    }
}
