package dev.yashshekhar.batch.config;

import dev.yashshekhar.batch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        // Business logic goes here.
        student.setId(null);
        return student;
    }
}
