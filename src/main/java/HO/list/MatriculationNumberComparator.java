package HO.list;

import HO.data.Student;

public class MatriculationNumberComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //0 == identisch
        //-1 kleiner
        return o1.getMatriculationNumber() - o2.getMatriculationNumber();
    }
    
}