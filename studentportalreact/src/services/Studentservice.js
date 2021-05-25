import axios from 'axios'

const STUDENT_REST_API_URL="http://localhost:8010/allstudent"
class Studentservice{
      getStudents()
      {
          return axios.get(STUDENT_REST_API_URL);
      }    
}
export default new Studentservice();