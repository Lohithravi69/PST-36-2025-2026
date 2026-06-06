
import Student from './Student.jsx'
function App() {
    return(
    <>
      <Student name="Virat" age="33" isStudent={true}/> 
      <Student name="Rohit" age="42" isStudent={false}/>
      <Student name="Sachin" age="39" isStudent={true}/>
      <Student name="Dhoni" age="40" isStudent={false}/>
      <Student />
       </>           
    );
}

export default App
