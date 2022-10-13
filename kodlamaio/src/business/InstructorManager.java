package business;

import core.logging.ILogger;
import dataAccess.instractorDao.IInstructorDao;
import entities.Instructor;

import java.util.logging.Logger;

public class InstructorManager {

    private IInstructorDao iInstructorDao;
    private ILogger [] iLoggers ;

    public InstructorManager(IInstructorDao iInstructorDao, ILogger[] iLoggers) {
        this.iInstructorDao = iInstructorDao;
        this.iLoggers = iLoggers;
    }


    public void add ( Instructor instructor){
        iInstructorDao.add(instructor);

        for ( ILogger logger : iLoggers
             ) {
            logger.log("Eğitmen ismi: " + instructor.getName() + "   ID: " + instructor.getId() + "   Eğitmen çalışma saati: " + instructor.getWorkHour());
        }



    }









}
