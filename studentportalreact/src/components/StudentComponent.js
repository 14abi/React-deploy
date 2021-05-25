
import React from 'react';
import Studentservice from '../services/Studentservice';
 class StudentComponent extends React.Component
 {
     constructor(props)
     {
         super(props)
         this.state={
             students:[]
         }
     }
     componentDidMount()
     {
         Studentservice.getStudents().then((Response)=>
         {
             this.setState({students:Response.data})
         });
     }
     render()
     {
         return(
             <div>
                 <h1 className="text-center">STUDENT PORTAL</h1>
             <table className="table table-striped">
                 <thead>
                     <tr>
                         <th>StudentId</th>

                         <th>StudentName</th>
                         
                         <th>Marks</th>
                    </tr>
                </thead>
                 <tbody>
                     {
                         this.state.students.map(
                             student=>
                             <tr key={student.id}>
                                 <td>{student.id}</td>
                                 <td>{student.studentName}</td>
                                 <td>{student.studentMarks}</td>
                             </tr>
                         )
                     }
                 </tbody>
                 </table>    
             </div>
            
            
         )
                   
            
     }

     }
 
 export default StudentComponent